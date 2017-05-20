
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Lập trình mạng</title>

<link
	href="<%=request.getContextPath()%>/template/css/bootstrap.min.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/template/css/datepicker3.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/template/css/styles.css"
	rel="stylesheet">


</head>

<body>

	<div class="row">
		<div
			class="col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4">
			<div class="login-panel panel panel-default">
				<div class="panel-heading">Đăng nhập :</div>

				<div class="panel-body">
					<form role="form" method="post"
						action="<%=request.getContextPath()%>/login">
						<fieldset>
							<div class="form-group">
								<input class="form-control" placeholder="Tên đăng nhập"
									name="username" type="text" autofocus="">
							</div>
							<div class="form-group">
								<input class="form-control" placeholder="Mật khẩu"
									name="password" type="password" value="">
							</div>
							<div>
								<%
									if (request.getParameter("msg") != null) {
										if (request.getParameter("msg").equals("fail")) {
											out.print(" <p style='color:red '> <strong> Sai username hoặc password</p>");
										} else if (request.getParameter("msg").equals("registersuccess")) {
											out.print(" <p style='color:red '> <strong> Đăng ký thành công</p>");
										}
									}
								%>
							</div>
							<div>
								<input type="submit" class="btn btn-primary" value="Đăng nhập"
									name="submit" /> <a href="<%=request.getContextPath()%>/index"
									class="btn btn-default btn-md">Quay lại</a>
							</div>

						</fieldset>
					</form>
				</div>
			</div>
		</div>
		<!-- /.col-->
	</div>
	<!-- /.row -->
	<%@include file="template/inc/footer.jsp"%>