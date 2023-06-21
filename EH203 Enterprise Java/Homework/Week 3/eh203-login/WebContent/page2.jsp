<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="ehsdi" uri="ehsdiTags" %>

<ehsdi:authCheck loginURL="login.htm" redirectURL="page2.jsp" />

<jsp:include page="WEB-INF/header.jsp">
	<jsp:param value="Page 2" name="title"/>
</jsp:include>

<jsp:include page="WEB-INF/footer.jsp" />