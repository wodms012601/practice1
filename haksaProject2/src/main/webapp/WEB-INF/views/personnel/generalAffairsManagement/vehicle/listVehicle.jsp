<!-- 2018.10.02 28기 전재현 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
	<head>
	
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
		<title>vehicle List</title>
		
		<!-- Bootstrap core CSS-->
		<link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
		
		<link href="/resources/vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
		
		<link href="/resources/vendor/bootstrap/js/bootstrap.js" rel="stylesheet">
		
		<!-- Custom fonts for this template-->
		<link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
		
		<!-- Page level plugin CSS-->
		<link href="/resources/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
		
		<!-- Custom styles for this template-->
		<link href="/resources/css/sb-admin.css" rel="stylesheet">
		
		<script type="text/javascript">
			
			$(document).ready(function(){
				
				$('#home').click(function (e) {
					  e.preventDefault()
					  $(this).tab('show')
					});
				
				$('#profile').click(function (e) {
					  e.preventDefault()
					  $(this).tab('show')
					});
				
				$('#messages').click(function (e) {
					  e.preventDefault()
					  $(this).tab('show')
					});
					
			});'
		
		</script>
	</head>
	
	<body id="page-top">
	
		<jsp:include page="/WEB-INF/views/module/nav.jsp"/>
	
		<div id="wrapper">
	
			<jsp:include page="/WEB-INF/views/module/sidebar.jsp"/>
	
			<div id="content-wrapper">
	
				<div class="container-fluid">
				<!-- 여기에 내용이 담긴다 -->
				
					<!-- 차량 운행 신청 리스트  -->
					<div role="tabpanel">

						<!-- Nav tabs -->
						<ul class="nav nav-tabs" role="tablist">
							<li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">승인여부 리스트</a></li>
							<li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">승인완료 리스트</a></li>
							<li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab">승인거부 리스트</a></li>
						</ul>
						
						<!-- Tab panes -->
						<div class="tab-content">
							<!-- 날짜 검색 -->
							<select>
								<option></option>
							</select>
							<!-- 차량 승인여부 리스트 -->
							<div role="tabpanel" class="tab-pane active" id="home">
								<table>
									<thead>
										<tr>
											<td>
												<input type="checkbox" >
											</td>
											<td>부서 명</td>
											<td>직급 명</td>
											<td>성명</td>
											<td>차량 번호</td>
											<td>차량종류</td>
											<td>차량 운행목적</td>
											<td>차량 승인 여부</td>
											<td>등록일자</td>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="s" items="${vehicleList }">
											<tr>
												<td>
													<input type="checkbox" >
												</td>
												<td>${s.deptName }</td>
												<td>${s.rankName }</td>
												<td>${s.humanName }</td>
												<td>${s.vehicleNumber }</td>
												<td>${s.vehicleType }</td>
												<td>${s.vehiclePurpose }</td>
												<c:if test="${s.vehicleApprovalStatus eq null }">
													<td>확인중</td>
												</c:if>
												<c:if test="${s.vehicleApprovalStatus eq Y }">
													<td>승인</td>
												</c:if>
												<c:if test="${s.vehicleApprovalStatus eq N }">
													<td>거부</td>
												</c:if>
												<td>${s.vehicleRegistrationDay }</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
							<!-- 차량 승인여부 리스트 -->
							<div role="tabpanel" class="tab-pane" id="profile">
								<table>
									<thead>
										<tr>
											<td>
												<input type="checkbox" >
											</td>
											<td>부서 명</td>
											<td>직급 명</td>
											<td>성명</td>
											<td>차량 번호</td>
											<td>차량종류</td>
											<td>차량 운행목적</td>
											<td>차량 승인 여부</td>
											<td>등록일자</td>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="s" items="${vehicleList }">
											<tr>
												<td>
													<input type="checkbox" >
												</td>
												<td>${s.deptName }</td>
												<td>${s.rankName }</td>
												<td>${s.humanName }</td>
												<td>${s.vehicleNumber }</td>
												<td>${s.vehicleType }</td>
												<td>${s.vehiclePurpose }</td>
												<c:if test="${s.vehicleApprovalStatus eq null }">
													<td>확인중</td>
												</c:if>
												<c:if test="${s.vehicleApprovalStatus eq Y }">
													<td>승인</td>
												</c:if>
												<c:if test="${s.vehicleApprovalStatus eq N }">
													<td>거부</td>
												</c:if>
												<td>${s.vehicleRegistrationDay }</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
							<!-- 차량 승인여부 리스트 -->
							 <div role="tabpanel" class="tab-pane" id="messages">
								<table>
									<thead>
										<tr>
											<td>
												<input type="checkbox" >
											</td>
											<td>부서 명</td>
											<td>직급 명</td>
											<td>성명</td>
											<td>차량 번호</td>
											<td>차량종류</td>
											<td>차량 운행목적</td>
											<td>차량 승인 여부</td>
											<td>등록일자</td>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="s" items="${vehicleList }">
											<tr>
												<td>
													<input type="checkbox" >
												</td>
												<td>${s.deptName }</td>
												<td>${s.rankName }</td>
												<td>${s.humanName }</td>
												<td>${s.vehicleNumber }</td>
												<td>${s.vehicleType }</td>
												<td>${s.vehiclePurpose }</td>
												<c:if test="${s.vehicleApprovalStatus eq null }">
													<td>확인중</td>
												</c:if>
												<c:if test="${s.vehicleApprovalStatus eq Y }">
													<td>승인</td>
												</c:if>
												<c:if test="${s.vehicleApprovalStatus eq N }">
													<td>거부</td>
												</c:if>
												<td>${s.vehicleRegistrationDay }</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->
			</div>
		</div>
		<!-- /#wrapper -->
	
		<!-- Scroll to Top Button-->
		<a class="scroll-to-top rounded" href="#page-top"> 
			<i class="fas fa-angle-up"></i>
		</a>
	
		<!-- Logout Modal-->
		<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
				
					<div class="modal-header">
					
						<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
						
						<button class="close" type="button" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">Ã</span>
						</button>
					</div>
					
					<div class="modal-body">
						Select "Logout" below if you are ready to end your current session.
					</div>
					
					<div class="modal-footer">
					
						<button class="btn btn-secondary" type="button" data-dismiss="modal">
							Cancel
						</button>
						
						<a class="btn btn-primary" href="login.html">
							Logout
						</a>
					</div>
				</div>
			</div>
		</div>
	
		<!-- Bootstrap core JavaScript-->
		<script src="/resources/vendor/jquery/jquery.min.js"></script>
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