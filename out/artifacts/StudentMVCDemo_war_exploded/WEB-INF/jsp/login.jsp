<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%
    String username="";
    String password="";
    Cookie[] cookies=request.getCookies();
    if(cookies!=null&&cookies.length>0)
    {
        for(Cookie c:cookies){
            if(c.getName().equals("username")){
                username=c.getValue();
            }
            if(c.getName().equals("password")){
                password=c.getValue();
            }
        }
    }
%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
    <title>Title</title>
</head>
<body>
        <div class="container">
                <article role="login">
                    <form id="login_form"  action="/login" method="post">
                        <h3 class="text-center"><i class="fa fa-lock"></i> Login</h3>
                        <div class="form-group">
                            用户名<br>
                            <input type="text" id="username" name="username"  value="<%=username %>" required>
                        </div>
                        <div class="form-group">
                            密码<br>
                            <input type="password" id="password" name="password" class="form-control" value="<%=password %>" required>
                        </div>
                        <div class="form-group">
                            <input type="submit" id="submiButton" onclick="check()" value="Login">
                        </div>
                    </form>
                </article>
        </div>
    <script type="text/javascript">
            function check() {
            var username = document.getElementById("username")
            var password = document.getElementById("password")
            var code = document.getElementById("code")
            if (username.value == "") {
                alert("请输入用户名")
            } else if (password.value == "") {
                alert("请输入密码")
            } else {
                document.forms[0].submit()
            }
        }
    </script>
</body>
</html>
