<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<script>
function readURL(input) {
	  if (input.files && input.files[0]) {
	    var reader = new FileReader();
	    reader.onload = function(e) {
	      document.getElementById('image').src = e.target.result;
	    };
	    reader.readAsDataURL(input.files[0]);
	  } else {
	    document.getElementById('image').src = "";
	  }
	}
</script>
<title>도서 관리</title>
</head>
<body>
<section>
<article>
<form action="<c:url value='/add'/>" name="formData" method="post" enctype="multipart/form-data">
<h2>도서정보관리-도서추가</h2>

<table border="1">
		<tr>
			<td rowspan="6" height="200" width="300"><img id="image"></td>
			
		</tr>
		<tr>
			<td>BOOKISBN</td>
			<td><input type="text" name="isbn" id="isbn"></td>
		</tr>
		
		<tr>
			<td>도서명</td>
			<td><input type="text" name="name" id="name"></td>
		</tr>
		
		<tr>
			<td>저자</td>
			<td><input type="text" name="writer" id="writer"></td>
		</tr>

		<tr>
			<td>출판사</td>
			<td><input type="text" name="publisher" id="publisher"></td>
		</tr>
		
		
		<tr>
			<td>도서 가격</td>
			<td><input type="text" name="price" id="price"></td>
		</tr>
		
		<tr>
			<td>이미지</td>
			<td><input type="file" name="image" onchange="readURL(this);" accept="image/*"></td>			
		</tr>

		<tr>
			<td>책 소개</td>
			<td><textarea name="content"></textarea></td>			
		</tr> 
</table>
	<input type="submit" value="도서정보 추가">
	<input type="button" value="도서정보 목록" onclick="window:location='<c:url value='/list'/>'" />
	
</form>
</article>
</section>
</body>
</html>