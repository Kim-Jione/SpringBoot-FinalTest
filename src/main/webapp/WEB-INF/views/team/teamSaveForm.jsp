<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">
	<h1 style="text-align:center">팀 등록 페이지입니다.</h1>
	<form>
      <div class="d-flex justify-content-center">
         <div style="width: 500px">
            <input id="name" class="form-control" placeholder="팀 이름을 작성 해주세요." />
         </div>
         <button id="btnSave" type="button" class="btn btn-primary">등록</button>
      </div>
   </form>
</div>

<script src="/js/team.js"></script>

<%@ include file="../layout/footer.jsp"%>