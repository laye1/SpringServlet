package com.saraya.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.car.Car;
import com.saraya.car.CarService;

@WebServlet(urlPatterns="/create.do")
public class CreateCarSevlet extends HttpServlet{
	
	CarService addcar = new CarService();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		
		
		request.getRequestDispatcher("/WEB-INF/views/createCar.jsp").forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws javax.servlet.ServletException, java.io.IOException{
		
		String name=request.getParameter("name");
		String mark =request.getParameter("mark");
		String description=request.getParameter("description");
		 String price =request.getParameter("price");
		 
		Car car  = new Car(name,mark,description,price);
		
		addcar.addCars(car);
		
		response.sendRedirect("/car.do");
		
		
		
	}
}
