<!-- 2018.10.01 28기 전재현 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>duty worker list</title>
		
		<!-- Bootstrap core CSS-->
		<link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
		
		<!-- Custom fonts for this template-->
		<link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
		
		<!-- Page level plugin CSS-->
		<link href="/resources/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
		
		<!-- Custom styles for this template-->
		<link href="/resources/css/sb-admin.css" rel="stylesheet">
		
	</head>
	<body id="page-top">

		<!-- nav Include -->
		<jsp:include page="/WEB-INF/views/module/nav.jsp"/>
	
		<div id="wrapper">
	
			<!-- side Include -->
			<jsp:include page="/WEB-INF/views/module/sidebar.jsp"/>
	
			<div id="content-wrapper">
				
				<!-- 여기에 내용이 담긴다 -->
				<div class="container-fluid">
				
				<!-- 당직 근무조 리스트  -->
					<div role="tabpanel">
			
						<!-- Nav tabs -->
						<ul class="nav nav-tabs" role="tablist">
							<li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">당직 승인여부 리스트</a></li>
							<li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">당직 승인 리스트</a></li>
							<li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab">당직 승인 불가 리스트</a></li>
						</ul>
						
						<!-- Tab panes -->
						<div class="tab-content">
						
							<!-- 당직 승인여부 리스트 -->
							<div role="tabpanel" class="tab-pane active" id="home">
								<table>
									<thead>
										<tr>
											<td></td>
										</tr>
									</thead>
								</table>
							</div>
							
							<!-- 당직 승인 리스트 -->
							<div role="tabpanel" class="tab-pane" id="profile">
							
							</div>
							
							<!-- 당직 승인 불가 리스트 -->
							<div role="tabpanel" class="tab-pane" id="messages">
							
							</div>
							
						</div>
						
					</div>
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
		
		
	</body>
</html>