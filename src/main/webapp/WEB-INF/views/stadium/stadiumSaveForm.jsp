<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>

<div class="container">
<h1>경기장 등록 페이지입니다.</h1>

<form>
경기장 이름 : <input type="text" placeholder="경기장 이름을 적어주세요" id="name" name="name"/>

<button id="btnSave" type="button" class="btn btn-primary">등록</button>
</form>
</div>

<script src="/js/stadium.js"></script>
<%@include file="../layout/footer.jsp"%>
