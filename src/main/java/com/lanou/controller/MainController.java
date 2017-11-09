package com.lanou.controller;

import com.lanou.domain.Blog;
import com.lanou.domain.User;
import com.lanou.response.AjaxLoginResult;
import com.lanou.service.BlogService;
import com.lanou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 17/11/8.
 */

/**
 * @Controller:代表当前这个类是一个控制器,类似于Struts2的action 当浏览器发出请求时 HandlerMapper 会进行匹配访问路径是否在这个类中定义了
 */
@Controller
public class MainController {
    /*持有的服务层对象*/
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @Autowired
    @Qualifier("blogService")
    private BlogService blogService;

    /**
     * @return
     * @RequestMapping 定义能处理的请求路径
     * 例如:localhost:8080/home
     * 返回的视图,根据spring配置文件中的视图解析定义自动加上前缀和后缀
     * 即方法/home时,跳转的页面为
     * localhost:8080/WEB-INF/pages/home.jsp
     */
    @RequestMapping(value = "/home")
    public String home() {
        System.out.println("访问了home");
        return "home";
    }

    /**
     * 处理index的访问请求
     *
     * @return
     */
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    /**
     * 跳转到登录界面
     * 请求路径:/login
     * 返回视图:/WEB-INF/pages/user/login.jsp
     *
     * @return
     */
    @RequestMapping(value = "/login")
    public String login() {
        return "user/login";
    }

    /**
     * 注册响应
     * 请求路径:register?username='三儿' & password='123'
     * 返回视图:/WEB-INF/pages/user/register.jsp
     *
     * @return
     */

    @RequestMapping(value = "/register")
    public String register( ) {
        return "user/register";
    }

    /**
     * 处理登录请求的登录
     * 返回json数据
     * ResponseBody 声明当前的请求返回的数据为json数据
     */
    @ResponseBody
    @RequestMapping(value = "/loginu")
    public AjaxLoginResult loginu(User user) {
        AjaxLoginResult result = new AjaxLoginResult();
        /*发起业务查询*/
        if (user != null && user.getUsername() != null) {
            User user1 = userService.findByName(user.getUsername());
            System.out.println("查询到到的用户对象" + user1);
            if (user1 != null && user1.getPassword().equals(user.getPassword())) {
                 /*正确信息*/
                result.setErrorCode(0);
                user.setId(user1.getId());
                result.setData(user);
            } else {

            /*错误信息*/
                result.setErrorCode(404);
                result.setMessage("用户信息错误");


            }

        }
        return result;
    }

    /**
     * 请求进入博客页面
     *
     * @return
     * @PathVariable 获取路径中同名对象的值
     */
    @RequestMapping(value = "/blogpage/{userId}")
    public String blogpage(@PathVariable Integer userId,
                           HttpServletRequest request,
                           HttpServletResponse response,
                           Model model) {
        System.out.println("用户id" + "----" + userId);
        System.out.println(request);
        System.out.println(response);

        //构建博客对象集合
        List<Blog> blogList = blogService.findAll();

        //将博客集合对象保存到model中,属性名要求与界面一致
        model.addAttribute("bloglist", blogList);
        return "blog/blogpage";
    }

    /**
     * 根据点击不同的博客,进入不同博客详情页面
     *
     * @param blogId
     * @param model
     * @return
     */
    @RequestMapping(value = "/blogdetail/{blogId}")
    public String blogdetail(@PathVariable Integer blogId, Model model) {
        Blog blog = blogService.findById(blogId);
        model.addAttribute("blog", blog);
        return "blog/blogdetail";
    }

    /**
     * 新建博客
     *
     * @return
     */
    @RequestMapping(value = "/addblog")
    public String addblog() {
        return "blog/addblog";
    }

    @RequestMapping(value = "/newblog")
    public String newblog(){

        return  "blog/blogpage";
    }

}
