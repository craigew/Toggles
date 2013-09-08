<%@ page import="com.toggle.ProductionFeature" %>
<%@ page import="com.toggle.Toggle" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    if (Toggle.isOn(ProductionFeature.TOGGLE_ON)) {
%>
Hello world
<%}%>
</body>
</html>