<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<title>Wynik</title>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

</head>
<body>
	<table class="table table-bordered table-striped table-hover">
	<thead>
	<tr>
	<th>Id</th>
	<th>Pierwsza liczba</th>
	<th>Dzialanie</th>
	<th>Druga liczba</th>
	<th>Wynik</th>
	</tr>
	</thead>
	<tbody>
<c:forEach items="${listResult}" var="number">
	<tr>
	<td>${number.id}</td>
	<td>${number.firstNumber}</td>
	<td>${number.calculation}</td>
	<td>${number.secondNumber}</td>
	<td>${number.result}</td>
	
	
	</tr>
	
	
	</c:forEach>
	
	
	
	
	</tbody>
	
	</table>
</body>
</html>