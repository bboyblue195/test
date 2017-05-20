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
 * Servlet implementation class controllerAddVacxin
 */

public class controllerAddVacxin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controllerAddVacxin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (CheckLogin.CheckLoginLib(request, response)==false){
			return;
		}
	
		modelVacxin mVacxin=new modelVacxin();
		
		if(request.getParameter("submit")!=null){
			
			int somui=Integer.parseInt(request.getParameter("somui"));
			int giavacxin=Integer.parseInt(request.getParameter("giavacxin"));
			String tenvacxin=request.getParameter("tenvacxin");
			String mota=request.getParameter("mota");
			String tenhang=request.getParameter("tenhang");
			Vacxin vacxin=new Vacxin(0, tenvacxin, somui, mota, giavacxin, tenhang);
			int rs=mVacxin.add(vacxin);
			if(rs==0){
				response.sendRedirect(request.getContextPath()+"/vacxin?msg=addfail");
				return;
			}else{
				response.sendRedirect(request.getContextPath()+"/vacxin?msg=addsuccess");
				return;
				
			}
		}else{
			
			RequestDispatcher rd=request.getRequestDispatcher("/addvacxin.jsp");
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
