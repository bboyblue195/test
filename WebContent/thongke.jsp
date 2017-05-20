

<%@page import="bean.LichSuTiemPhong"%>
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
					<h1 class="page-header text-center text-uppercase">Thống kê</h1>
				</div>
			</div>
			<!--/.row-->
			<%
				ArrayList<KhachHang> listKhachHang = (ArrayList<KhachHang>) request.getAttribute("listKhachHang");
			%>
			<div class="row">
				
					<div class="panel panel-default">
						<div class="panel-body">
							<div class="table-responsive">
								<table class="table table-bordered table-hover table-striped ">
									<thead class="text-center">
										<tr class="text-center">
											<th class="text-center">Mã khách hàng</th>
											<th class="text-center">Tên khách hàng</th>
											<th class="text-center">Số điện thoại</th>
											<th class="text-center">Địa chỉ</th>
											<th class="text-center">Ngày sinh</th>
											<th class="text-center">Tổng tiền</th>
											
										</tr>
									</thead>
									<tbody class="text-center">
										<%
											for (KhachHang item : listKhachHang) {
										%>
										<tr>
											<td><%=item.getMaKH()%></td>
											<td><%=item.getHoTenKH()%></td>
											<td><%=item.getSoDienThoai()%></td>
											<td><%=item.getDiaChi()%></td>
											<td><%=item.getNgaySinh()%></td>
											<td><%=item.getTongTien()%></td>
											
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
