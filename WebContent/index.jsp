<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<title>Kalkulator</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

</head>
<body>

	<h1>Kalkulator</h1>
	<h1>Witaj</h1>
	<div class="container">
		<form action="<c:url value="/dodaj"/>" method="post" class="form-horizontal">
			<div class="form-group">
				<label for="firstNumber" class="col-sm-2 control-label">Pierwsza
					liczba:</label>
				<div class="col-sm-10">
					<input id="firstNumber" type="text" class="form-control"
						name="fN" required placeholder="Wpisz pierwszą liczbę" />
				</div>
			</div>
			<div class="form-group">
				<label for="secondNumber" class="col-sm-2 control-label">Druga
					liczba:</label>
				<div class="col-sm-10">
					<input id="secondNumber" type="text" class="form-control"
						name="sN" required placeholder="Wpisz drugą liczbę" />
				</div>
			</div>
			<select name="item">
			
			<option value="1">dodaj</option>
			<option value="2">odejmij</option>
			<option value="3">pomnóż</option>
			<option value="4">podziel</option>
			</select>

						
			<input type="submit" value="Zapisz" class="btn btn-primary" />
		</form>

	</div>

</body>
</html>