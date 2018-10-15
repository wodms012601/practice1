<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>side bar</title>
</head>
<body>
	<!-- Sidebar -->
	<ul class="sidebar navbar-nav">
		<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> 
				<i class="fas fa-fw fa-folder"></i> <span>공통코드 관리</span>
			</a>
			<div class="dropdown-menu" aria-labelledby="pagesDropdown">
				<a class="dropdown-item" href="/common/codes/agency">기관 코드</a> 
				<a class="dropdown-item" href="/common/codes/organization">기구 코드</a> 
				<a class="dropdown-item" href="/common/codes/department">부서 코드</a>
				<a class="dropdown-item" href="/common/codes/teamCode">팀 코드</a> 
				<a class="dropdown-item" href="/common/codes/jobGroup">직군 코드</a>
				<a class="dropdown-item" href="/common/codes/jobType">직종 코드</a>
				<a class="dropdown-item" href="/common/codes/jobRank">직급 코드</a>
				<a class="dropdown-item" href="/common/codes/jobPosition">직위 코드</a>
				<a class="dropdown-item" href="/common/codes/building">건물 코드</a>
				<a class="dropdown-item" href="/common/codes/room">강의실 코드</a>
				<a class="dropdown-item" href="/common/codes/country">국가 코드</a>
			</div>
		</li>
		<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> 
				<i class="fas fa-fw fa-folder"></i> <span>학적코드 관리</span>
			</a>
			<div class="dropdown-menu" aria-labelledby="pagesDropdown">
				<h1 class="dropdown-header">코드 관리</h1>
				<a class="dropdown-item" href="/schoolRegister/codes/semester">학기 코드</a> 
				<a class="dropdown-item" href="/schoolRegister/codes/calander">학기별상세일정</a> 
				<a class="dropdown-item" href="/schoolRegister/codes/reasonForChangeSchoolRegister">학적변동사유 코드</a>
				<a class="dropdown-item" href="/schoolRegister/codes/typeOfCounsel">상담구분 코드</a> 
				<a class="dropdown-item" href="/schoolRegister/codes/resultOfCounsel">상담결과 코드</a>
				<div class="dropdown-divider"></div>
			</div>
		</li>
		<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> 
				<i class="fas fa-fw fa-folder"></i> <span>수업코드 관리</span>
			</a>
			<div class="dropdown-menu" aria-labelledby="pagesDropdown">
				<a class="dropdown-item" href="/lecture/codes/Toc">이수구분 코드</a> 
				<a class="dropdown-item" href="/lecture/codes/subject">과목 코드</a> 
				<a class="dropdown-item" href="/lecture/codes/Qfel">강의평가항목 코드</a>
				<a class="dropdown-item" href="/lecture/codes/Afe">평가항목 배정 코드</a>
				<a class="dropdown-item" href="/lecture/codes/Gc">성적평가기준 코드</a> 
			</div>
		</li>
		<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> 
				<i class="fas fa-fw fa-folder"></i> <span>강의담당 관리</span>
			</a>
			<div class="dropdown-menu" aria-labelledby="pagesDropdown">
				<a class="dropdown-item" href="/lesson/lecture/classByDepartment">학과별반관리</a> 
				<a class="dropdown-item" href="/lesson/lecture/lectureStatus">강의상황서 관리</a> 
				<a class="dropdown-item" href="/lesson/lecture/professorChange">강의담당상황교수 변경관리</a>
				<a class="dropdown-item" href="/lesson/lecture/changedTypeOfCompletion">이수구분변경관리</a> 
			</div>
		</li>
		<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> 
				<i class="fas fa-fw fa-folder"></i> <span>시간표 관리</span>
			</a>
			<div class="dropdown-menu" aria-labelledby="pagesDropdown">
				<a class="dropdown-item" href="/schoolregister/schedule">시간표 입력</a> 
			</div>
		</li>
		<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> 
				<i class="fas fa-fw fa-folder"></i> <span>졸업코드 관리</span>
			</a>
			<div class="dropdown-menu" aria-labelledby="pagesDropdown">
				<a class="dropdown-item" href="#">졸업불가사유 코드</a> 
			</div>
		</li>
		<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> 
				<i class="fas fa-fw fa-folder"></i> <span>총무 관리</span>
			</a>
			<div class="dropdown-menu" aria-labelledby="pagesDropdown">
				<a class="dropdown-item" href="/personnel/generalAffairsManagement/holiday/listHoliday">휴일</a> 
				<a class="dropdown-item" href="/personnel/generalAffairsManagement/vehicle/listVehicle">차량운행</a>
				<a class="dropdown-item" href="/personnel/generalAffairsManagement/vacation/listVacation">휴가</a>
			</div>
		</li>
		
	</ul>
</body>
</html>