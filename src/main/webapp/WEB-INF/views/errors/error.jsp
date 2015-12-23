<%--
  Created by IntelliJ IDEA.
  User: evatlsong
  Date: 15-12-23
  Time: 下午7:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<% Exception e = (Exception)request.getAttribute("ex"); %>
<h2>错误异常: <%= e.getClass().getSimpleName()%></h2>
<hr />
<p>错误描述：</p>
<%= e.getMessage()%>
<p>错误信息：</p>
<% e.printStackTrace(new java.io.PrintWriter(out)); %>
</body>
</html>
