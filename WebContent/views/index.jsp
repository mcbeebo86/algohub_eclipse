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
	<form action="${pageContext.request.contextPath}/AlgoManagementServlet" method="post">
		Please select the problem you'd like to see:<br/>
		<select id="selectedAlgo" name="Algorithms">
			<option>Anagrams Test</option>
		</select>
		<br/>
		<input type="submit" id="btnSelectAlgo" value="Select" />
	</form>
</body>
</html>