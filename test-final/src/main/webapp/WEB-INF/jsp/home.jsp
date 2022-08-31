<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2022/8/24
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form id='home' action="/home/add" method="POST">
    For Run in JSP: ${message}<br>
    <input type='hidden' name='num'>
    <input type='hidden' id='act' name='act' value='add'>
    ID:<input type='text' id='id' name='id' required><br>
    NAME:<input type='text' name='name' required><br>
    <button type="submit" value="送出">送出</button>
</form>
<form action="/home/all" method="POST">
    <button  type="submit" value="提交">查看</button>
</form>

</body>
</html>
