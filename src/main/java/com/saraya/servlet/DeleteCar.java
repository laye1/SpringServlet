package com.saraya.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.car.Car;
import com.saraya.car.CarService;

@WebServlet(urlPatterns="/delete.do")
public class DeleteCar extends HttpServlet {
	
	CarService carService = new CarService();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		 String carName= request.getParameter("carName");
		 String carMark= request.getParameter("carMark");
		 String carDescription= request.getParameter("carDescription");
		 String carPrice= request.getParameter("carPrice");
		 
		 carService.deleteCar(new Car(carName,carMark,carDescription,carPrice));
		 
          response.sendRedirect("/car.do");
	}

}
