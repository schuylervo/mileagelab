<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> <center> MPG Result Calculation </center> </h3>
	<p>
		 Based on your vehicle's MPG rating and gasoline tank capacity, you can expect to be able to drive
	</p>
	<p>	 
	&nbsp&nbsp&nbsp&nbsp	 ${ mpg } [MPG] * ${ gallons } [GALLONS]= ${ result } miles before running out of gas. 
	</p>
	<p>
	DISCLAIMER: Real world conditions such as vehicle tire pressure, outdoor air temperature, driving style, and other factors may impact these expected results.
	</p>
	<p>
		<a href="/">Home</a>
	</p>
</body>
</html>