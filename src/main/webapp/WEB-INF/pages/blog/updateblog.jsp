<%--
  Created by IntelliJ IDEA.
  User: lizhongren1
  Date: 2017/5/17
  Time: 上午11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>修改博客</title>
</head>
<body>
<table border="1px">
    <tr>
        <td>标题</td>
        <td><input type="text" id="add_title"  value="${blog.title}" required></td>
    </tr>
    <tr>
        <td>描述</td>
        <td><textarea id="add_des" placeholder="${blog.des}" required></textarea></td>
    </tr>
    <tr>
        <td>内容</td>
        <td><textarea id="add_content" placeholder= "${blog.content}" required></textarea></td>
    </tr>
</table>
<button id="subtn">提交</button>

</body>

<script src="/resources/js/jquery-3.2.1.min.js"></script>
<script src="/resources/js/jquery.cookie.js"></script>
<script>
    $("#subtn").click(function () {

        $.post("/updblog/${blog.id}",{
            "title":$("#add_title").val(),
            "des":$("#add_des").val(),
            "content":$("#add_content").val(),
            "userId":$.cookie("userid"),
        },function (result) {
            if (result.errorCode == 0) {
                alert(result.message)
                location.href = "/blogpage/" + $.cookie("userid")
            }else {
                alert(result.message)
            }
        })
    })
</script>

</html>
