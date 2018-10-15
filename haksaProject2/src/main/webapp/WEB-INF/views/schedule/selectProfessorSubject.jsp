<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>교수강의과목조회</title>
	</head>
	<body>
		년도 : 
		<select name="year">
			<option value="2018">2018</option>
			<option value="2017">2017</option>
			<option value="2016">2016</option>
			<option value="2015">2015</option>
		</select>
		학기 : 
		<select name="semester">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
		</select>
		학과 : 
		<select name="department">
			<option value="골프경기지도과">골프경기지도과</option>
			<option value="마사과">마사과</option>
			<option value="행정학과">행정학과</option>
			<option value="국어학과">국어학과</option>
		</select>
		교수 : 
		<select name="professor">
			<option value="이응빈">이응빈</option>
			<option value="김지완">김지완</option>
		</select>&emsp;
		<button type="button" onclick="search()">조회</button>
		
		<table>
			<tr>
				<th>과목</th>
				<th>학과</th>
				<th>학년</th>
				<th>주야</th>
				<th>반</th>
				<th>이수구분</th>
				<th>학점</th>
				<th>총시수</th>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</table>
	</body>
</html>