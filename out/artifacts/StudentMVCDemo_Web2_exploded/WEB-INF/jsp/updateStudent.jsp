<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false"%>
<html>
<head>
    <title>修改联系人</title>
</head>
<body>
    <form action="/stuManager/update" method="post">
        <input type="hidden" name="sid" value="${stu.getSid()}"><br><br><br>
        学号：<input type="text" name="sno" value="${stu.getSno()}"><br><br><br>
        姓名：<input type="text" name="sname" value="${stu.getSname()}"><br><br><br>
        年龄：<input type="number" name="age" value="${stu.getAge()}"><br><br><br>
        <input type="submit" value="确认">
    </form>
</div>

</body>
</html>
