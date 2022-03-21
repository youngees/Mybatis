<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<div class="container">
	<h2>Mybatis를 이용한 회원제 방명록(한줄게시판) 제작</h2>
	<li>
		<a href="mybatis/list.do" target="_blank">
			한줄게시판 바로가기(Paging O, Search X)
		</a>
	</li>
	<li>
		<a href="mybatis/listSearch.do" target="_blank">
			한줄게시판 바로가기(Paging O, Search O)
		</a>
	</li>
	
	<h2>Collection 사용하기</h2>
	<li>
		<a href="Collection/hashMap.do" target="_blank">
			hashMap.do 바로가기
		</a>
	</li>
	<li>
		<a href="Collection/arrayList.do" target="_blank">
			arrayList.do 바로가기
		</a>
	</li>
</div>
</body>
</html>
