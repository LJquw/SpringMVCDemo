<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
  <head>
    <title>首页</title>
      <style>
          table{
              width: 400px;
              border: 1px solid #000;
              border-collapse:collapse;
              margin: auto;
          }
          td,th{
              border: 1px solid #000;
              text-align: center;
          }
      </style>
  </head>
  <body>
  <table>
    <tr class="tb_title">
      <a href="/stuManager/toAdd">新增</a>
      <td width="10%">SID</td>
      <td width="30%">学号</td>
      <td width="12%">姓名</td>
      <td width="10%">年龄</td>
      <td width="26%">操作</td>
    </tr>
    <c:forEach var="s" items="${stus}" varStatus="status">
      <tr>
        <td width="10%">${s.sid}</td>
        <td width="30%">${s.sno}</td>
        <td width="12%">${s.sname}</td>
        <td width="12%">${s.age}</td>
        <td width="26%">
          <a href="${pageContext.request.contextPath}/stuManager/toUpdate?sid=${s.sid}">编辑</a>
          <a href="${pageContext.request.contextPath}/stuManager/delete/${s.sid}">删除</a>
        </td>
      </tr>
    </c:forEach>

  </table>
  <a href="/LogoutServlet">退出</a>
  <a href="/listener">网站在线人数</a>
  </body>
</html>
