package com.saraya.servlet;

import java.io.IOException; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.saraya.car.CarService;
import com.saraya.login.UserValidation;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet  {

	/** 
	 * 
	 */
	
	UserValidation u =new UserValidation();
	CarService formation = new CarService();
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws javax.servlet.ServletException, java.io.IOException{
		
		String user=request.getParameter("username");
		String pass =request.getParameter("password");
		
		
		
		
		boolean valid = u.isValid(user, pass);
		
		
		if(valid){
		
			
			request.getSession().setAttribute("name", user);
			request.getSession().setAttribute("passe",pass);
			
		
		    
			response.sendRedirect("/car.do");
			
			}else {
				request.setAttribute("errorMessage", "your incredentials are wrong");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		    
		}
		
		
	}


}
