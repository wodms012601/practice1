<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>시간표 입력</title>
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Bootstrap core CSS-->
		<link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
		<!-- Custom fonts for this template-->
		<link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
		<!-- Page level plugin CSS-->
		<link href="/resources/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
		<!-- Custom styles for this template-->
		<link href="/resources/css/sb-admin.css" rel="stylesheet">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			
			// 학기 조회
			$.ajax({
				url:'/rest/semester'
				, type:'GET'
				, dataType:'JSON'
				, success:function(data){
					$(data).each(function(index, item){
						$('#semesterCode').append("<option value="+item.semesterCode+">"+item.semesterCode+"</option>");
					})
				}
			})
			
			// 학과 조회
			$("#semesterCode").change(function(){
				let code = $('#semesterCode option:selected').val();
				console.log(code);
				if(code != '선택') {
					$.ajax({
						url:'/rest/department'
						, type:'GET'
						, dataType:'JSON'
						, data: {semesterCode:code}
						, success: function(data){
							$('#departmentCode').empty();
							$('#departmentCode').append("<option value='선택'>선택</option>");
							$(data).each(function(index, item){
								$('#departmentCode').append("<option value="+item.deptNameKorean+">"+item.deptNameKorean+"</option>");
							})
						}
					})
				} else {
					$('#departmentCode').empty();
					$('#departmentCode').append("<option value='선택'>선택</option>");
				}
			})
			
			// 학년 조회
			$('#departmentCode').change(function(){
				let code = $('#departmentCode option:selected').val();
				if(code != '선택'){
					$.ajax({
						url:'/rest/grade'
						, type:'GET'
						, dataType:'JSON'
						, data:{departmentCode:code}
						, success: function(data){
							$('#gradeCode').empty();
							$('#gradeCode').append("<option value='선택'>선택</option>");
							$(data).each(function(index, item){
								$('#gradeCode').append("<option value="+item.classByDepartmentGrade+">"+item.classByDepartmentGrade+"</option>");
							})
						}
					})
				} else {
					$('#gradeCode').empty();
					$('#gradeCode').append("<option value='선택'>선택</option>");
				}
			})
			
			// 반 조회
			$('#gradeCode').change(function(){
				let code = $('#gradeCode option:selected').val();
				if(code != '선택'){
					$.ajax({
						url:'/rest/class'
						, type:'GET'
						, dataType:'JSON'
						, data:{gradeCode:code}
						, success: function(data){
							$('#classCode').empty();
							$('#classCode').append("<option value='선택'>선택</option>");
							$(data).each(function(index, item){
								$('#classCode').append("<option value="+item.classByDepartmentClass+">"+item.classByDepartmentClass+"</option>");
							})
						}
					})
				} else {
					$('#classCode').empty();
					$('#classCode').append("<option value='선택'>선택</option>");
				}
			})
			
			// 검색결과로 강의 조회
			$("#click").click(function(){
				let semesterCode = $('#semesterCode option:selected').val();
				let departmentCode = $('#departmentCode option:selected').val();
				let gradeCode = $('#gradeCode option:selected').val();
				let classesCode = $('#classCode option:selected').val();
				let dayCode = $('#dayCode option:selected').val();
				
				if("선택" != semesterCode && "선택" != departmentCode && "선택" != gradeCode && "선택" != classCode && "선택" != dayCode){
					$.ajax({
						url:'/rest/scheduleFormList'
						, type:'POST'
						, dataType:'JSON'
						, data: {semesterCode:semesterCode, departmentCode:departmentCode, gradeCode:gradeCode, classesCode:classesCode, dayCode:dayCode}
						, success: function(data){
							console.log("success");
			                $(data).each(function(index, item){
			                	$('#scheduleTable > tbody').append('<tr>');
			                	$('#scheduleTable > tbody').append('<td>'+item.subjectName+'</td>');
			                	$('#scheduleTable > tbody').append('<td>'+item.humanName+'</td>');
			                	$('#scheduleTable > tbody').append('<td>'+item.buildingName+item.roomFloor+"층"+item.roomNumber+"호"+'</td>');
			                	$('#scheduleTable > tbody').append('<td><select name="day"><option value="선택">선택</option><option value="월">월</option><option value="화">화</option><option value="수">수</option><option value="목">목</option><option value="금">금</option></select></td>');
			                	$('#scheduleTable > tbody').append('<td><select name="period"><option value="선택">선택</option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option value="9">9</option></select></td>');
			                	$('#scheduleTable > tbody').append('</tr>');
			                })
						}
					})
				}
				$(this).attr('disabled',true);
			});
		})
		</script>
	</head>
	<body id="page-top">
		<jsp:include page="/WEB-INF/views/module/nav.jsp"/>
		
		<div id="wrapper">
			<jsp:include page="/WEB-INF/views/module/sidebar.jsp"/>
			
			<div id="content-wrapper">
				<div class="container-fluid">
					년도-학기 : 
					<select name="yearBox" id="semesterCode">
						<option value="선택">선택</option>
					</select>
					학과 : 
					<select name="departmentBox" id="departmentCode">
						<option value="선택">선택</option>
					</select>
					학년 : 
					<select name="gradeBox" id="gradeCode">
						<option value="선택">선택</option>
					</select>
					반 : 
					<select name="classBox" id="classCode">
						<option value="선택">선택</option>
					</select>
					주야 : 
					<select name="dayBox" id="dayCode">
						<option value="선택">선택</option>
						<option value="주">주</option>
						<option value="야">야</option>
					</select>&emsp;
					<button type="button" id="click">조회</button>
		
					<form action="${pageContext.request.contextPath}/scheduleAdd" method="post">
						<table border="1" id="scheduleTable">
							<thead>
								<tr>
									<th>과목명</th>
									<th>담당교수</th>
									<th>강의실</th>
									<th>요일</th>
									<th>교시</th>
								</tr>
							</thead>
							<tbody>
							</tbody>
						</table>
						<button type="submit">저장</button>
					</form>
				</div>
				<footer class="sticky-footer">
					<div class="container my-auto">
						<div class="copyright text-center my-auto">
							<span>Copyright © Haksa 2018</span>
						</div>
					</div>
				</footer>
			</div>
		</div>
		<!-- Scroll to Top Button-->
		<a class="scroll-to-top rounded" href="#page-top"> <i
			class="fas fa-angle-up"></i>
		</a>

		<!-- Logout Modal-->
		<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
						<button class="close" type="button" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">Ã</span>
						</button>
					</div>
					<div class="modal-body">Select "Logout" below if you are ready
						to end your current session.</div>
					<div class="modal-footer">
						<button class="btn btn-secondary" type="button"
							data-dismiss="modal">Cancel</button>
						<a class="btn btn-primary" href="login.html">Logout</a>
					</div>
				</div>
			</div>
		</div>
		<!-- Bootstrap core JavaScript-->
		<script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
		
		<!-- Core plugin JavaScript-->
		<script src="/resources/vendor/jquery-easing/jquery.easing.min.js"></script>
	
		<!-- Page level plugin JavaScript-->
		<script src="/resources/vendor/chart.js/Chart.min.js"></script>
		<script src="/resources/vendor/datatables/jquery.dataTables.js"></script>
		<script src="/resources/vendor/datatables/dataTables.bootstrap4.js"></script>
	
		<!-- Custom scripts for all pages-->
		<script src="/resources/js/sb-admin.min.js"></script>
	
		<!-- Demo scripts for this page-->
		<script src="/resources/js/demo/datatables-demo.js"></script>
		<script src="/resources/js/demo/chart-area-demo.js"></script>
	</body>
</html>