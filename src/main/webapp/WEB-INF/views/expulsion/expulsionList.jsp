<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>

<div class="container">
	<h1>퇴출선수 목록 페이지입니다.</h1>

	<table border="1" class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>퇴출일</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="expulsion" items="${expulsion}">
				<tr>
					<td>${expulsion.id}</td>
					<td>${expulsion.name}</td>
					<td>${expulsion.createAt}</td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
</div>

<%@include file="../layout/footer.jsp"%>