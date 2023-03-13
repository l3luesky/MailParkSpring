<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Spring Start</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
 
<div class="container">
  <h2>Spring Start</h2>
  <div class="panel panel-default">
    <div class="panel-heading">Panel Heading</div>
    <div class="panel-body">
    	<table>
    		<tr>
    			<td>제목</td>
    			<td>${vo.title}</td>
    		</tr>
    		<tr>
    			<td>내용</td>
    			<td>${vo.content}</td>
    		</tr>
    		<tr>
    			<td>작성자</td>
    			<td>${vo.writer}</td>
    		</tr>
    		<tr>
    			<td>작성일</td>
    			<td>${vo.intate}</td>
    		</tr>
    		<tr>
    			<td colspan="2" align="center">
    				<button class="btn btn-primary btn-sm">수정</button>
    				<button class="btn btn-warning btn-sm">삭제</button>
    				<button class="btn btn-info btn-sm">목록</button>
    			</td>
    		</tr>
    	</table>
    </div>
    <div class="panel-footer">Panel footer</div>
  </div>
</div>

</body>
</html>