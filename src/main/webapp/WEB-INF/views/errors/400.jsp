<%--
  Created by IntelliJ IDEA.
  User: evatlsong
  Date: 15-12-23
  Time: 下午5:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
        import="com.evatlsong.archetype.exception.RestException" %>

<html>
<head>
    <title></title>
</head>
<body>
<% RestException e = (RestException)request.getAttribute("ex"); %>
<% response.setStatus(e.status.value()); %>
<h2>错误异常: <%= e.getClass().getSimpleName()%></h2>
<hr />
<p>错误描述：</p>
<%= e.getMessage()%>
<p>错误信息：</p>
<% e.printStackTrace(new java.io.PrintWriter(out)); %>
</body>
</html>
