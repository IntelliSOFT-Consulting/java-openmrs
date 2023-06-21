<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Galleries</title>
</head>
<body>
<h1>Galleries</h1>
<ul>
<c:forEach items="${galleries}" var="gallery">
	<li><a href="gallery.htm?name=${gallery}">${fn:replace(gallery, "_", " ")}</a></li>
</c:forEach>
</ul>
</body>
</html>