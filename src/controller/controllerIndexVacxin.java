package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Vacxin;
import model.modelVacxin;

/**
 * Servlet implementation class controllerIndexVacxin
 */

public class controllerIndexVacxin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controllerIndexVacxin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		modelVacxin mVacxin=new modelVacxin();
		ArrayList<Vacxin> ListVacxin=null;
		if(request.getParameter("action")!=null){
			String TenVacxin=request.getParameter("TenVacxin");
			ListVacxin=mVacxin.getListByName(TenVacxin);
		}else{
			ListVacxin=mVacxin.getList();
		}
	
		request.setAttribute("ListVacxin", ListVacxin);
		RequestDispatcher rd= request.getRequestDispatcher("/vacxin.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
