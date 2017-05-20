package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.KhachHang;
import bean.LichSuTiemPhong;
import library.CheckLogin;
import model.modelKhachHang;
import model.modelLichSuTiemPhong;;

/**
 * Servlet implementation class controllerIndexKhachHang
 */

public class controllerLichSuTiemPhong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controllerLichSuTiemPhong() {
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
		if(request.getParameter("idKH")!=null){
			int idKH=Integer.parseInt(request.getParameter("idKH"));
			
			modelLichSuTiemPhong mLSTP= new modelLichSuTiemPhong();
			
			ArrayList<LichSuTiemPhong> LSTP=mLSTP.getListByID(idKH);
				
			request.setAttribute("LSTP", LSTP);
			
			RequestDispatcher rd= request.getRequestDispatcher("/lichsutiemphong.jsp");
			rd.forward(request, response);
			return;
		}else{
			RequestDispatcher rd= request.getRequestDispatcher("/khachhang.jsp");
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
