<%@page import="bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Lập trình mạng</title>

<link href="<%=request.getContextPath() %>/template/css/bootstrap.min.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/template/css/datepicker3.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/template/css/styles.css" rel="stylesheet">


</head>

<body>
		<%
		
		User userLogin=(User)session.getAttribute("userLogin");
		%>
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <div class="col-sm-8 col-sm-offset-2 main">
                        <a class="navbar-brand" href="index.php"><span>BBOY</span></a>
                        <ul class="user-menu">
                            <li class="dropdown pull-right">
                                 <p style="color: white	">Hello,<strong><a href="#" > <%=(userLogin!=null?userLogin.getUsername(): "Guest" )%></a></strong></p>  
                                
                            </li>
                        </ul>
                    </div>
                </div>
            </div><!-- /.container-fluid -->
        </nav>