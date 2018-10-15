<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>과목 코드 관리</title>

<!-- Bootstrap core CSS-->
<link href="/resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom fonts for this template-->
<link href="/resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">

<!-- Page level plugin CSS-->
<link href="/resources/vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="/resources/css/sb-admin.css" rel="stylesheet">
</head>
<body id="page-top">

	<jsp:include page="/WEB-INF/views/module/nav.jsp" />

	<div id="wrapper">

		<jsp:include page="/WEB-INF/views/module/sidebar.jsp" />

		<div id="content-wrapper">

			<div class="container-fluid">
				<!-- 여기에 내용이 담긴다 -->

				<h1>수업코드 관리 > 과목 코드 관리</h1>
				<br> <br>
				<table border="1">
					<thead>
						<tr>
							<th>과목 코드</th>
							<th>과목명(국문)</th>
							<th>과목명(영문)</th>
							<th>학점</th>
							<th>이론시수</th>
							<th>실습시수</th>
							<th>코드 사용유무</th>
							<th>코드 변경유무</th>
							<th>코드 변경사유</th>
							<th>코드 변경일자</th>
							<th>시스템 등록일자</th>
							<th>시스템 등록자 아이디</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="sub" items="${list}">
							<tr>
								<td>${sub.subjectCode}</td>
								<td>${sub.subjectNameKorean}</td>
								<td>${sub.subjectNameEnglish}</td>
								<td>${sub.subjectScoreGraduation}</td>
								<td>${sub.subjectHoursTheory}</td>
								<td>${sub.subjectHoursPractice}</td>
								<td>${sub.subjectHoursIsUsed}</td>
								<td>${sub.subjectHoursIsChanged}</td>
								<td>${sub.subjectHoursReasonForChange}</td>
								<td>${sub.subjectHoursChangedDate}</td>
								<td>${sub.subjectHoursRegisteredDate}</td>
								<td>${sub.recordId}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<br><br>
				<a href="/lecture/codes/addSubjectCodeForm">코드 입력</a>
			</div>
			<!-- /.container-fluid -->

			<!-- Sticky Footer -->
			<footer class="sticky-footer">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright © Haksa 2018</span>
					</div>
				</div>
			</footer>

		</div>
		<!-- /.content-wrapper -->

	</div>
	<!-- /#wrapper -->

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