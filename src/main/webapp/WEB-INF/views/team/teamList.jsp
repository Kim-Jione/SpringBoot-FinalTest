<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>

<div class="container">
	<h1>팀 목록 페이지입니다.</h1>

	<table border="1" class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>창설일</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="team" items="${team}">
				<tr>
					<td>${team.id}</td>
					<td>${team.name}</td>
					<td>${team.createAt}</td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
</div>

<%@include file="../layout/footer.jsp"%>