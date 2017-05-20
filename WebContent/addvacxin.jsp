<%@page import="bean.Vacxin"%>
<%@page import="bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="template/inc/header.jsp" %>
<div class="container">
    <div class="row">
        <div class="col-sm-8 col-sm-offset-2 main">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header text-center text-uppercase">Thêm Văcxin</h1>
                </div>
            </div><!--/.row-->

            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
               	 		<div class="panel-body">
                            <div class="col-md-12">
                            
                                <form role="form" method="post" id="idForm" action="">
                                	
                                    <div class="form-group">
                                        <label>Tên văcxin:</label>
                                        <input type="text"  name="tenvacxin" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label>Số mũi:</label>
                                        <input type="text" name="somui" class="form-control" >
                                    </div>
                                   	<div class="form-group">
                                        <label>Mô tả:</label>
                                        <input type="text" name="mota" class="form-control">
                                    </div>
                                    	<div class="form-group">
                                        <label>Giá văcxin:</label>
                                        <input type="text" name="giavacxin" class="form-control">
                                    </div>
                                    	<div class="form-group">
                                        <label>Tên hãng:</label>
                                        <input type="text" name="tenhang" class="form-control">
                                    </div>
                                    
                           
                                    <div class="form-group text-center">
                                        <input type="submit" name="submit" class="btn btn-primary" value="Xác nhận"/>
                                        <a href="<%=request.getContextPath() %>/vacxin" class="btn btn-default">Quay về</a>
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
