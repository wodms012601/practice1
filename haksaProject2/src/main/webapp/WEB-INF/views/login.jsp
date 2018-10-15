<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>학사관리시스템 로그인</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Bootstrap core CSS-->
<link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template-->
<link href="resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

<!-- Custom styles for this template-->
<link href="resources/css/sb-admin.css" rel="stylesheet">
<script type="text/javascript">
	$(document).ready(function(){
		console.log(1);
		$('#btnToLogin').click(function(){
			console.log(1);
			var inputId = $('#inputId').val();
			var inputPw = $('#inputPassword').val();
			
			$.ajax({
				url:'/rest/login'
				, type:'POST'
				, data:{userId: inputId, userPw: inputPw}
				, success: function(data){
					if(data == 'success'){
						location.href='/index';
					} else{
						$('#loginHelper').html("아이디 또는 비밀번호가 일치하지 않습니다.");
					}
				}
			})
		})
	})
</script>
</head>

<body class="bg-dark">

	<div class="container">
		<div class="card card-login mx-auto mt-5">
			<div class="card-header">로그인</div>
			<div>
				<p style="margin: 15px 10px 10px 20px;">※아이디는 학번 또는 교직원 번호 입니다.</p>
				<p style="margin: 15px 10px 10px 20px;">※초기 비밀번호는 본인의 <span style="color:red; font-weight:bold">학번 또는 교직원번호_생년월일</span> 입니다.</p>
			</div>
			<div class="card-body">
				<div class="form-group">
					<div class="form-label-group">
						<input type="text" id="inputId" name="id" class="form-control"
							placeholder="ID" required="required" value="admin"
							autofocus="autofocus"> <label for="inputId">아이디</label>
					</div>
				</div>
				<div class="form-group">
					<div class="form-label-group">
						<input type="password" id="inputPassword" name="pw" class="form-control"
							placeholder="Password" value="darkhosoon1!" required="required"> <label
							for="inputPassword">비밀번호</label>
					</div>
					<span id="loginHelper" style="margin-left:12px; color:red; font-size:14px"></span>
				</div>
				
				<button id="btnToLogin" class="btn btn-primary btn-block">로그인</button>		
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script src="resources/vendor/jquery/jquery.min.js"></script>
	<script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="resources/vendor/jquery-easing/jquery.easing.min.js"></script>
</body>
</html>
