package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.KhachHang;
import bean.User;
import library.CheckLogin;
import model.modelKhachHang;
import model.modelUser;


/**
 * Servlet implementation class controllerRegister
 */

public class controllerAddKhachHang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controllerAddKhachHang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (CheckLogin.CheckLoginLib(request, response)==false){
			return;
		}
		if(request.getParameter("submit")!=null){
			modelKhachHang mKH=new modelKhachHang();
			String sdt=request.getParameter("sdt");
			String diachi=request.getParameter("diachi");
			String fullname=request.getParameter("fullname");
			String ngaysinh=request.getParameter("ngaysinh");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			Date ns=null;
			try {
				ns = sdf.parse(ngaysinh);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			KhachHang obj=new KhachHang(0, fullname, sdt, diachi, ns);
			
			int rs=mKH.add(obj);
			if(rs==1){
				response.sendRedirect(request.getContextPath()+"/khachhang?msg=success");
				return;
			}else{
				response.sendRedirect(request.getContextPath()+"/addkhachhang?msg=fail");
				return;
			}
		}else{
			RequestDispatcher rd= request.getRequestDispatcher("/addkhachhang.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
