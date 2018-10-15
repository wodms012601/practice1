<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>


<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>수강신청 및 정정</title><!-- Bootstrap core CSS-->
<link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template-->
<link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

<!-- Page level plugin CSS-->
<link href="/resources/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

<!-- Custom styles for this template-->
<link href="/resources/css/sb-admin.css" rel="stylesheet">


</head>

<body id="page-top">

	<jsp:include page="/WEB-INF/views/module/nav.jsp"/>

	<div id="wrapper">

		<jsp:include page="/WEB-INF/views/module/sidebar.jsp"/>

		<div id="content-wrapper">

			<div class="container-fluid">
			<!-- 여기에 내용이 담긴다 -->
			
			</div>
			<!-- /.container-fluid -->
			
			<!-- 1.세션 아이디 받아서 학과 조회
				 2.강의 계획서 테이블에서 일치하는 학과 번호 조회
				 3.학과 번호가 일치하는 과목들 정보 조회
				 4.조회된 과목 정보 출력
			 -->
			<form action="enrolCourseWrite" method="post">
				<table border=1>
					<thead align="center">
						<tr>
							<th>선택</th>
							<th>강좌번호</th>
							 <th>학번</th>
							<th>과목명</th>
							<th>이수구분</th>
							 <th>학점</th>
							 <th>학과명</th>
							 <th>학년</th>
							<th>반</th>
							 <th>교수명</th>
							<th>강의실명</th>
							<th>년도</th>
							<th>학기</th>
							 <th>재수강횟수</th>
							<th>총 수강인원</th>
						</tr>
					</thead>
					<tbody align="center">
						<c:forEach var="row" items="${enrolCourse}">
							<tr>
								<td><input type="checkbox" name ="course" value="${row.lectureStatusNumber}"></td>
								<td>${row.lectureStatusNumber}</td>
								<td>${id}</td>
								<td>${row.enrolCourseCourseName}</td>
								<td>${row.enrolCourseCompletionDivision}</td>
								 <td>${row.enrolCourseCourseCredit}</td>
								 <td>${row.enrolCourseDeptName}</td>
								 <td>${row.enrolCourseSchoolYear}</td>
								<td>${row.enrolCourseClass}</td>
								 <td>${row.enrolCourseProfName}</td>
								<td>${row.enrolCourseClassroom}</td>
								<td>${row.enrolCourseYear}</td>
								<td>${row.enrolCourseSemester}</td>
								 <td>${row.enrolCourseCourseRetakeNumber}</td>
								<td>${row.enrolCourseCourseRetakeNumber}</td>
								
							</tr>
						</c:forEach>
						<tr align="right">
							<td colspan="15"><button type="submit">수강신청입력</button></td>
						</tr>
					</tbody>
				</table>
			</form>

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