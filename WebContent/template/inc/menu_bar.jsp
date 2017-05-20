<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<ul class="nav menu">
			<li class="navbar-brand">MENU</li>
			</br>
			<li role="presentation" class="divider"></li>
			<li><a href="<%=request.getContextPath()%>/index">Trang chủ</a></li>
			<li><a href="<%=request.getContextPath()%>/khachhang">Danh sách khách hàng</a></li>
			<li><a href="<%=request.getContextPath()%>/vacxin">Văcxin</a></li>
			<li><a href="<%=request.getContextPath()%>/thongke">Thống kê</a></li>
			<li><a href="<%=request.getContextPath()%>/addkhachhang">Thêm khách hàng</a></li>
			
			<%if(session.getAttribute("userLogin")==null){ %>
			<li><a href="<%=request.getContextPath()%>/login">Login</a></li>
			<%}else{ %>
			<li><a href="<%=request.getContextPath()%>/logout">Logout</a></li>
			<%} %>
			
		</ul>
		<div class="attribution">Thực hiện : <strong>Vỹ Huỳnh</strong></div>
	</div><!--/.sidebar-->	