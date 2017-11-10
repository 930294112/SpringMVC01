<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lizhongren1
  Date: 2017/5/9
  Time: 下午4:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>博客管理</title>

    <link rel="stylesheet" href="/resources/bs/css/bootstrap.css">
    <script src="/resources/js/jquery-3.2.1.min.js"></script>
    <script src="/resources/bs/js/bootstrap.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapse" data-toggle="collapse" data-target="nav-1"
                    aria-expanded="false">
                <span class="sr-only">Toggole navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="#" class="navbar-brand">Brand</a>
        </div>

        <div class="collapse navbar-collapse" id="nav-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
                <li><a href="/addblog">新建博客</a></li>
            </ul>

            <form class="navbar-form navbar-left" action="/search">
                <div class="form-group">
                    <input type="text" class="form-control"  name="content"  placeholder="输入搜索的内容">
                </div>
                <button type="submit" class="btn btn-default" id="sub">提交</button>
            </form>

            <ul class="nav navbar-nav navbar-right">
                <li><a href="#" id="usermsg"></a></li>
                <li><a href="/login">切换用户</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <c:if test="${!empty bloglist}">
        <table id="blogtable" class="table table-bordered table-hover">
            <tr>
                <th>博客标题</th>
                <th>博客描述</th>
                <th>操作</th>

            </tr>
            <c:forEach var="blog" items="${bloglist}">
                <tr id="${blog.id}">
                    <td><a href="/blogdetail/${blog.id}">${blog.title}</a></td>
                    <td>${blog.des}</td>
                    <td><a href="#" onclick="deleteById(${blog.id})">删除|</a>
                   <a href="/updateblog/${blog.id}" >编辑</a></td>
                </tr>
            </c:forEach>

        </table>
        <div class="col-md-offset-4 col-md-4">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li>
                        <a href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                    <li class="active"><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#">6</a></li>
                    <li>
                        <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
    </c:if>
</div>

</body>
<script src="/resources/js/jquery.cookie.js"></script>
<script>
    console.log($.cookie("userid"))
    $("#usermsg").text($.cookie("loginmsg"))

    $(".pagenum").click(function () {

        $.ajax({
            type: "POST",
            url: "/bloglist",
            data: {
                userid: $.cookie("userid")
            },
            success: function (result) {
                console.log(result.data);

                if (result.errorCode == 0) {

                    // for循环添加tr标签
                    console.log(1111);
                }
            }
        })
    })


    function deleteById(id) {

        $.post("/deleteblog",
                {   "id": id,
                    "userId": $.cookie("userid")
                }, function (result) {
            if (result.errorCode == 0) {
                // 删除某一行
                var rowid = "#" + id;
                $(rowid).remove();
                alert(result.message)
            }else {
                alert(result.message)
            }
        })
    }

</script>


</html>
