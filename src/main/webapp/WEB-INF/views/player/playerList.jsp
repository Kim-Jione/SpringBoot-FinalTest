<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
  <table class="table table-striped">
    <thead>
      <tr>
        <th>번호</th>
        <th>팀명</th>
        <th>포지션</th>
        <th>선수명</th>
        <th>등록일</th>
 
        <th><button id="btnDelete" class="btn btn-danger">퇴출</button></th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="player" items="${playerList}">
      <tr>
        <td>${player.id}</td>
        <td>${player.teamName}</td>
        <td>${player.position}</td>
        <td>${player.name}</td>
        <td>${player.createdAt}</td>
        <td><input onclick="getDeleteId(${player.id})" name="id" type="checkbox" class="form-check-input" value="${player.id}" ></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>

<script>
</script>

<%@ include file="../layout/footer.jsp" %>