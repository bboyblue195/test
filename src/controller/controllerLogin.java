package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import model.modelUser;;

/**
 * Servlet implementation class controllerLogin
 */

public class controllerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controllerLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("submit")!=null){
			modelUser mUser= new modelUser();
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			
			User user;
			if((user=mUser.getItembyUsernamePass(username, password))!=null){
				HttpSession session= request.getSession();
				session.setAttribute("userLogin", user);
				response.sendRedirect(request.getContextPath()+"/index");
				return;
			}else{
				response.sendRedirect(request.getContextPath()+"/login?msg=fail");
				return;
			}
		}else{
			RequestDispatcher rd= request.getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
		}
	}

}
