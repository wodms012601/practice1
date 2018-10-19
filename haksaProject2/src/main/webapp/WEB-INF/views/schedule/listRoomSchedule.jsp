<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>강의실시간표 리스트</title>
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
				
				// 건물 조회
				$.ajax({
					url:'/rest/building'
					, type:'GET'
					, dataType:'JSON'
					, success:function(data){
						$(data).each(function(index, item){
							$('#buildingCode').append("<option value="+item.buildingCode+">"+item.buildingName+"</option>");
						})
					}
				})
				
				// 강의실 조회
				$("#buildingCode").change(function(){
					let code = $('#buildingCode option:selected').val();
					if(code != '선택') {
						$.ajax({
							url:'/rest/room'
							, type:'GET'
							, dataType:'JSON'
							, data: {buildingCode:code}
							, success: function(data){
								$('#roomCode').empty();
								$('#roomCode').append("<option value='선택'>선택</option>");
								$(data).each(function(index, item){
									$('#roomCode').append("<option value="+item.roomCode+">"+item.roomFloor+"층"+item.roomNumber+"호"+item.roomName+"</option>");
								})
							}
						})
					} else {
						$('#roomCode').empty();
						$('#roomCode').append("<option value='선택'>선택</option>");
					}
				})
				
				// 검색결과로 강의실 시간표 조회
				$("#scheduleSearch").click(function(){
					let semesterCode = $('#semesterCode option:selected').val();
					let buildingCode = $('#buildingCode option:selected').val();
					let roomCode = $('#roomCode option:selected').val();
					let dayCode = $('#dayCode option:selected').val();
					
					if("선택" != semesterCode && "선택" != buildingCode && "선택" != roomCode && "선택" != dayCode){
						$.ajax({
							url:'/rest/roomSchedule'
							, type:'POST'
							, dataType:'JSON'
							, data: {semesterCode:semesterCode, buildingCode:buildingCode, roomCode:roomCode, dayCode:dayCode}
							, success: function(data){
								console.log("success");
				                $(data).each(function(index, item){
				                	$('#scheduleTable > tbody').append('<tr>');
				                	$('#scheduleTable > tbody').append('<td>'+item.subjectName+'</td>');
				                	$('#scheduleTable > tbody').append('<td>'+item.humanName+'</td>');
				                	$('#scheduleTable > tbody').append('<td>'+item.departmentGrade+"-"+item.departmentClass+'</td>');
				                	$('#scheduleTable > tbody').append('<td>'+item.day+'</td>');
				                	$('#scheduleTable > tbody').append('<td>'+item.period+'</td>');
				                	$('#scheduleTable > tbody').append('</tr>');
				                })
							}
						})
					}
					$(this).attr('disabled',true);
				});
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
					건물 : 
					<select name="departmentBox" id="buildingCode">
						<option value="선택">선택</option>
					</select>
					강의실 : 
					<select name="gradeBox" id="roomCode">
						<option value="선택">선택</option>
					</select>
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
								<th>교수명</th>
								<th>반</th>
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