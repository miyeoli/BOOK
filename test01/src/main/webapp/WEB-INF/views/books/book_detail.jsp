<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>도서 관리</title>
</head>
<body>
<h2>도서정보관리-도서정보</h2>
<table border="1">
	<tr>
		<td rowspan="6">
			<img src="<c:url value='/resources/upload/${list.image}'/>" width="300" height="400" />
		</td>
	</tr>
	<tr>
			<td>BOOK ISBN</td>
			<td>${list.isbn }</td>

		</tr>
		<tr>
			<td>도서명</td>
			<td>${list.name }</td>
		</tr>
		<tr>
			<td>저자</td>
			<td>${list.writer }</td>
		</tr>
		<tr>
			<td>출판사</td>
			<td>${list.publisher }</td>
		</tr>
		<tr>
			<td>도서가격</td>
			<td>${list.price }</td>
		</tr>
		<tr>
			<td>책소개</td>
			<td>${list.content }</td>
		</tr>
</table>
<input type="button" value="도서정보 목록"
		onclick="window:location='<c:url value='/list'/>'" />
</body>
</html>