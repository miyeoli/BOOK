<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 관리</title>
</head>
<body>
<h2>도서정보관리-리스트</h2>
<form action="<c:url value='/search'/>" name="listCommand" method="get">
		<select name = 'option'>
		<option value="writer">저자</option>
		<option value="name">책 제목</option>
		<option value="publisher">출판사</option>
		</select>
		<input name="keyword" type="text" placeholder="도서제목 또는 저자 입력" />
		<input type="submit" value="검색하기" />
</form>
<table border="1">
	<tr>
		<th>번호</th>
		<th>표지</th>
		<th>도서 ISBN</th>
		<th>도서 제목</th>
		<th>저자</th>
		<th>출판사</th>
		<th>가격</th>
	</tr>
	<c:forEach var="list" items="${list}">
	<tr>
		<td>${list.num}</td>
		<td><img src="<c:url value='/resources/upload/${list.image}'/>" width="100" height="100"></td>
		<td>${list.isbn}</td>
		<td><a href="<c:url value='/detail/${list.num }'/>">${list.name}</a></td>
		<td>${list.writer}</td>
		<td>${list.publisher}</td>
		<td>${list.price}원</td>
	</tr>
	</c:forEach>
	
	<c:if test="${! empty SearchList }">
	<c:forEach var="list" items="${SearchList}">
	<tr>
		<td>${list.num}</td>
		<td><img src="<c:url value='/resources/upload/${list.image}'/>" width="100" height="100"></td>
		<td>${list.isbn}</td>
		<td><a href="<c:url value='/detail/${list.num }'/>">${list.name}</a></td>
		<td>${list.writer}</td>
		<td>${list.publisher}</td>
		<td>${list.price}원</td>
	</tr>
	</c:forEach>
	</c:if>
</table>



	<input type="button" value="도서정보 추가" 
		onclick="window:location='<c:url value='/add'/>'"/>
</body>
</html>