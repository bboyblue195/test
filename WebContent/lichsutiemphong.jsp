

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
					<h1 class="page-header text-center text-uppercase">Lịch sử
						tiêm phòng</h1>
				</div>
			</div>
			<!--/.row-->
			<%
				ArrayList<LichSuTiemPhong> list = (ArrayList<LichSuTiemPhong>) request.getAttribute("LSTP");
			%>
			<div class="row">
				<div class="col-lg-12">
					<div class="panel-heading"><%=(list.isEmpty() ? "Chưa đi tiêm phòng" : "Khách hàng : " + list.get(0).getTenKH())%>
					</div>
					<div class="panel panel-default">
						<div class="panel-body">
							<div class="table-responsive">
								<table class="table table-bordered table-hover table-striped ">
									<thead class="text-center">
										<tr class="text-center">
											<th class="text-center">Mã khách hàng</th>
											<th class="text-center">Tên Bệnh</th>
											<th class="text-center">Mã Văcxin</th>
											<th class="text-center">Tên Văcxin</th>
											<th class="text-center">Tổng số mũi đã tiêm</th>
										</tr>
									</thead>
									<tbody class="text-center">
										<%
											for (LichSuTiemPhong item : list) {
										%>
										<tr>
											<td><%=item.getMaKH()%></td>
											<td><%=item.getTenBenh()%></td>
											<td><%=item.getMaVacxin()%></td>
											<td><%=item.getTenVacxin()%></td>
											<td><%=item.getTongSoMui()%></td>
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
