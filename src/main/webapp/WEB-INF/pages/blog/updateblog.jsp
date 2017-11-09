<%--
  Created by IntelliJ IDEA.
  User: lizhongren1
  Date: 2017/5/17
  Time: 上午11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改博客</title>
</head>
<body>
<table border="1px">
    <tr>
        <td>标题</td>
        <td><input type="text" id="add_title" required></td>
    </tr>
    <tr>
        <td>描述</td>
        <td><textarea id="add_des" placeholder="请简要描述一下博客内容" required></textarea></td>
    </tr>
    <tr>
        <td>内容</td>
        <td><textarea id="add_content" placeholder="请输入内容" required></textarea></td>
    </tr>
</table>
<button id="subtn">提交</button>

</body>

<script src="/resources/js/jquery-3.2.1.min.js"></script>
<script src="/resources/js/jquery.cookie.js"></script>
<script>

</script>

</html>
