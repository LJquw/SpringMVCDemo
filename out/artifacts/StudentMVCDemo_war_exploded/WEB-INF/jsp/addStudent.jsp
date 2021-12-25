<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false"%>
<html>
<head>
        <title>新增学生</title>
        <meta name="viewport" content="width=device-width,initial-scale=1.0">
        <link
                href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
                rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增学生</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="/stuManager/add" method="post">
        ID：<input type="number" name="sid"><br><br><br>
        学号：<input type="text" name="sno"><br><br><br>
        姓名：<input type="text" name="sname"><br><br><br>
        年龄：<input type="number" name="age"><br><br><br>
        <input type="submit" value="添加">
    </form>
</div>

</body>
</html>
