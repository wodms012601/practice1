<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>교수시간표 리스트</title>
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
				
				// 교직원번호로 교수 이름 검색
				$('#professorSearch').click(function(){
					let professorNumber = $('#professorNumber').val();
					
					$.ajax({
						url:'/rest/professorName'
						, type:'GET'
						, data: {professorNumber:professorNumber}
						, success:function(data){
							console.log('success');
							console.log(data)
							$('#professorName').val(data);
						}
					})
				})
				
				// 교수 시간표 조회
				$('#scheduleSearch').click(function(){
					let semesterCode = $('#semesterCode option:selected').val();
					let professorNumber = $('#professorNumber').val();
					let dayCode = $('#dayCode option:selected').val();
					
					if("선택" != semesterCode && null != professorNumber && "선택" != dayCode){
						$.ajax({
							url:'/rest/professorSchedule'
							, type:'POST'
							, dataType:'JSON'
							, data: {semesterCode:semesterCode, appointmentSchoolPersonnelNumber:professorNumber, classByDepartmentDayAndNight:dayCode}
							, success: function(data){
								console.log("success");
				                $(data).each(function(index, item){
				                	$('#scheduleTable > tbody').append('<tr>');
				                	$('#scheduleTable > tbody').append('<td>'+item.subjectName+'</td>');
				                	$('#scheduleTable > tbody').append('<td>'+item.deptName+'</td>');
				                	$('#scheduleTable > tbody').append('<td>'+item.buildingName+item.roomFloor+"층"+item.roomNumber+"호"+'</td>');
				                	$('#scheduleTable > tbody').append('<td>'+item.day+'</td>');
				                	$('#scheduleTable > tbody').append('<td>'+item.period+'</td>');
				                	$('#scheduleTable > tbody').append('</tr>');
				                })
							}
						})
					}
					$(this).attr('disabled',true);
				})
			});
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
					교수 : 
					<input type="text" id="professorNumber">
					<button type="button" id="professorSearch">이미지태그</button>
					<input type="text" id="professorName" readonly>
					주야 : 
					<select name="dayBox" id="dayCode">
						<option value="선택">선택</option>
						<option value="주">주</option>
						<option value="야">야</option>
					</select>&emsp;
					<button type="button" id="scheduleSearch">조회</button>
					
					<table border="1" id="scheduleTable">
						<thead>
							<tr>
								<th>과목명</th>
								<th>학과명</th>
								<th>강의실</th>
								<th>요일</th>
								<th>교시</th>
							</tr>
						</thead>
						<tbody>
						</tbody>
					</table>
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