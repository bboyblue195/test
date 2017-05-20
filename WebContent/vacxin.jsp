<%@page import="bean.Vacxin"%>
<%@page import="bean.User"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="template/inc/header.jsp"%>
<div class="container">
	<%@include file="template/inc/menu_bar.jsp"%>
	<!--/.row-->
	<div class="row">
		<div class="col-sm-8 col-sm-offset-2 main">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header text-center text-uppercase">Danh sáng Văcxin</h1>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-sm-12">
                                    <form class="form-inline" role="form" method="get" action="<%=request.getContextPath()%>/vacxin?action=find">
                                        <div class="form-group">
                                            <label>Tên Văcxin :</label>
                                            <input name="TenVacxin" class="form-control" />
                                        </div>
                                        <div class="form-group">
                                            <button type="submit" class="btn btn-primary" value="find" name="action">Tìm kiếm</button>
                                            <a href="<%=request.getContextPath() %>/vacxin" class="btn btn-default btn-md">Reset</a>
                                        </div>
                                    </form>	
                                </div>
                                <div class="clearfix"></div>
                            </div>	
                        </div>
                    </div>
					
				</div>
			</div>
			<!--/.row-->
			<div class="row">
				<%
					ArrayList<Vacxin> list = (ArrayList<Vacxin>) request.getAttribute("ListVacxin");
					if (request.getParameter("msg") != null) {
						if (request.getParameter("msg").equals("addfail")) {
							out.print(" <p style='color:red '> <strong> Thêm thất bại</p>");
						} else if (request.getParameter("msg").equals("addsuccess")) {
							out.print(" <p style='color:red '> <strong> Thêm thành công</p>");
						} else if (request.getParameter("msg").equals("editfail")) {
							out.print(" <p style='color:red '> <strong> Sửa thất bại</p>");
						} else if (request.getParameter("msg").equals("editsuccess")) {
							out.print(" <p style='color:red '> <strong> Sửa thành công</p>");
						}
					}
				%>

				<div class="panel panel-default">
					<div class="panel-body">
						<div class="table-responsive">
							<table class="table table-bordered table-hover table-striped ">
								<thead class="text-center">
									<tr class="text-center">
										<th class="text-center">Mã Văcxin</th>
										<th class="text-center">Tên Văcxin</th>
										<th class="text-center">Số Mũi</th>
										<th class="text-center">Mô Tả</th>
										<th class="text-center">Giá Văcxin</th>
										<th class="text-center">Tên Hãng</th>
										<th class="text-center">Thao Tác</th>
									</tr>
								</thead>
								<tbody class="text-center">
									<%
										for (Vacxin item : list) {
									%>
									<tr>
										<td><%=item.getMaVacxin()%></td>
										<td><%=item.getTenVacxin()%></td>
										<td><%=item.getSoMui()%></td>
										<td><%=item.getMoTa()%></td>
										<td><%=item.getGiaVacxin()%></td>
										<td><%=item.getTenHang()%></td>
										<td><a
											href="<%=request.getContextPath()%>/editvacxin?idVacxin=<%=item.getMaVacxin()%>">Sửa</a></td>
									</tr>
									<%
										}
									%>
								</tbody>
							</table>
							<a href="<%=request.getContextPath()%>/addvacxin" class="btn btn-primary pull-right">Thêm</a>
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
