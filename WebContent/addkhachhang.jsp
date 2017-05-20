<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="template/inc/header.jsp"%>
<div class="container">
<%@include file="template/inc/menu_bar.jsp"%>
    <div class="row">
        <div class="col-sm-8 col-sm-offset-2 main">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header text-center text-uppercase">Thêm khách hàng</h1>
                </div>
            </div><!--/.row-->

            <div class="row">
                <div class="col-lg-12">
                               
                     <div class="panel panel-default">
                        
                        <div class="panel-body">
                        <%if(request.getParameter("msg")!=null){
								if(request.getParameter("msg").equals("fail")){
									out.print(" <p style='color:red '> <strong> Thêm thất bại</p>");
								}
							}%>
                            <div class="col-md-12">
                                <form role="form" method="post" id="idForm" action="<%=request.getContextPath()%>/addkhachhang">
                                    
                                    <div class="form-group">
                                        <label>Họ và tên :</label>
                                        <input type="text"  name="fullname" class="form-control" autofocus="" >
                                    </div>
                                    <div class="form-group">
                                        <label>Số điện thoại :</label>
                                        <input type="text"  name="sdt" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label>Địa chỉ :</label>
                                        <input type="text"  name="diachi" class="form-control">  
                                    </div>
                                    <div class="form-group">
                                        <label>Ngày Sinh :</label>
                                        <input type="text"  name="ngaysinh" class="form-control" value="yyyy-mm-dd">
                                    </div>
                                    <div class="form-group text-center">
                                        <button type="submit" name="submit" class="btn btn-primary" value="submit">Đăng ký</button>
                                        <a href="<%=request.getContextPath()%>/index" class="btn btn-default">Quay về</a>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
               
            </div><!--/.row-->			
        </div><!--/.main-->
        <div class="col-sm-2">	
        </div>
    </div>
</div>
<%@include file="template/inc/footer.jsp" %>
