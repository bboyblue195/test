
<%@page import="model.modelLichSuTiemPhong"%>
<%@page import="bean.KhachHang"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="template/inc/header.jsp"%>
<div class="container">
	<%@include file="template/inc/menu_bar.jsp"%>
	<div class="row">
		<div class="col-sm-8 col-sm-offset-2 main">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header text-center text-uppercase">Danh sáng
						khách hàng</h1>
				</div>
			</div>
			<!--/.row-->

			<div class="row">
				<div class="col-lg-12">

					<%
						if (request.getParameter("msg") != null) {
							if (request.getParameter("msg").equals("success")) {
								out.print(" <p style='color:red '> <strong> Thêm thành công</p>");
							}
						}
					%>
					<div class="panel panel-default">
						<div class="panel-body">
							<%
								ArrayList<KhachHang> listKhachHang = (ArrayList<KhachHang>) request.getAttribute("listKhachHang");
							%>
							<div class="table-responsive">
								<table class="table table-bordered table-hover table-striped ">
									<thead class="text-center">
										<tr class="text-center">
											<th class="text-center">Họ và tên</th>
											<th class="text-center">Số Điện Thoại</th>
											<th class="text-center">Địa Chỉ</th>
											<th class="text-center">Ngày Sinh</th>

										</tr>
									</thead>
									<tbody class="text-center">
										<%
											modelLichSuTiemPhong modelLSTP = new modelLichSuTiemPhong();
											for (KhachHang item : listKhachHang) {
										%>
										<tr>
											<td><a
												href="<%=request.getContextPath()%>/lichsutiemphong?idKH=<%=item.getMaKH()%>"><%=item.getHoTenKH()%></a></td>
											<td><%=item.getSoDienThoai()%></td>
											<td><%=item.getDiaChi()%></td>
											<td><%=item.getNgaySinh()%></td>
										</tr>
										<%
											}
										%>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--/.row-->
		</div>
		<!--/.main-->
		<div class="col-sm-2"></div>
	</div>
</div>
<%@include file="template/inc/footer.jsp"%>
