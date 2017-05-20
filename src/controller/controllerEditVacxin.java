package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Vacxin;
import library.CheckLogin;
import model.modelVacxin;

/**
 * Servlet implementation class controllerEditVacxin
 */

public class controllerEditVacxin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controllerEditVacxin() {
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
		int idVacxin= Integer.parseInt(request.getParameter("idVacxin"));
		modelVacxin mVacxin=new modelVacxin();
		
		if(request.getParameter("submit")!=null){
			int mavacxin=Integer.parseInt(request.getParameter("mavacxin"));
			int somui=Integer.parseInt(request.getParameter("somui"));
			int giavacxin=Integer.parseInt(request.getParameter("giavacxin"));
			String tenvacxin=request.getParameter("tenvacxin");
			String mota=request.getParameter("mota");
			String tenhang=request.getParameter("tenhang");
			Vacxin vacxin=new Vacxin(mavacxin, tenvacxin, somui, mota, giavacxin, tenhang);
			int rs=mVacxin.edit(vacxin);
			if(rs==0){
				response.sendRedirect(request.getContextPath()+"/vacxin?msg=editfail");
				return;
			}else{
				response.sendRedirect(request.getContextPath()+"/vacxin?msg=editsuccess");
				return;
				
			}
		}else{
			Vacxin vacxin=mVacxin.getItemById(idVacxin);
			request.setAttribute("vacxin", vacxin);
			RequestDispatcher rd=request.getRequestDispatcher("/editvacxin.jsp");
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
