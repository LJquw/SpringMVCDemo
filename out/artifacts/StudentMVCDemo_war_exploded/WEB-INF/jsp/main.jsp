<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false"%>
<html>
<head>
    <title>Main</title>
</head>
<body>
<h1>欢迎进入网站</h1>
<p>用户名:${param.username}</p>
<p>密码：${param.password}</p>
<a href="/LogoutServlet">退出</a>
</body>
</html>
