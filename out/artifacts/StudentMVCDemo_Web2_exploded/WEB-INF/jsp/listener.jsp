<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false"%>
<html>
<head>
    <title>Listener</title>
</head>
<body>
<h1>欢迎进入网站</h1>
<h1>当前在线总人数：${applicationScope.get("count")}</h1>
</body>
</html>
