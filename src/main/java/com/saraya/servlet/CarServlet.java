package com.saraya.servlet;

import java.io.IOException; 


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.car.CarService;
import com.saraya.login.UserValidation;

@WebServlet(urlPatterns="/car.do")
public class CarServlet extends HttpServlet  {

	/** 
	 * 
	 */
	
	UserValidation u =new UserValidation();
	CarService car = new CarService();
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setAttribute("cars",car.showCars());
	
		request.getRequestDispatcher("/WEB-INF/views/acceuil.jsp").forward(request, response);
	}
	
  @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws javax.servlet.ServletException, java.io.IOException{
	
		    //response.sendRedirect("/create.do");
				
				
		   }
		   
		   
		   
		
		
	}
