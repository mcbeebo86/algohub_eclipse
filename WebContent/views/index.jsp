<%@page import="com.algohub.shared.AlgosEnum"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to AlgoHub!</title>
</head>
<body>
	<h3>Hello and welcome to the Algo Hub!</h3>
	<p>
		Here at Algo Hub we are passionate about writing code to solve interesting algorithmic problems. <br/>
		Code for every solution is publicly available on GitHub. <br/><br/>
		
		Enjoy your visit!
	</p>
	<form action="${pageContext.request.contextPath}/AlgoManagementServlet" method="POST">
		Please select the problem you'd like to see:<br/>

<!-- 
<c:if>
</c:if>
<c:chose>
	<c:when test="">
	</c:when>
	<c:when>
	</c:when>
	<c:otherwise>
	</c:otherwise>
</c:chose>		
		<c:forEach items="<%=AlgosEnum.values() %>" var="el">
		${el.name}
		</c:forEach>
		
		<select>
		<%
		for (AlgosEnum ae: AlgosEnum.values()) {
		%>
		
		<option value="<%=ae.name()%>"><%=ae.name() %></option>
		
		<%
		}
		%>
		</select>
 -->	
		<select id="selectedAlgo" name="Algorithms">
			<option>Anagrams Test</option>
			<option>Substring Test</option>
			<option>Alternating Ints Test</option>
		</select>
		<br/>
		<input type="submit" id="btnSelectAlgo" value="Select" />
	</form>
</body>
</html>