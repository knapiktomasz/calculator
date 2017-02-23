package controller;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ResultDao;
import model.Result;
@WebServlet("/dodaj")
public class ResultServlet extends HttpServlet {
	
	private ResultDao resultDao = new ResultDao();

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			List<Result> listResult = resultDao.findAll();
			req.setAttribute("listResult", listResult);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/result.jsp");
		requestDispatcher.forward(req, resp);	
	}



	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	double result1 = 0;
	String calculation = null;
	float firstNumber = Float.parseFloat(req.getParameter("fN"));
	float secondNumber = Float.parseFloat(req.getParameter("sN"));
	int item = Integer.parseInt(req.getParameter("item"));
	if (item == 1) {
		 result1 = firstNumber+secondNumber;
		 calculation = "+";
	}
	if (item == 2) {
		 result1 = firstNumber-secondNumber;
		 calculation = "-";
	}
	if (item == 3) {
		 result1 = firstNumber*secondNumber;
		 calculation = "*";
	}
	if (item == 4) {
		 result1 = firstNumber/secondNumber;
		 calculation = "/";
	}
	
	
	Result result = new Result(firstNumber,secondNumber, calculation, result1);
	
	try {
		resultDao.save(result);
	} catch (SQLException e) {
		
		e.printStackTrace();
	}	
	
resp.sendRedirect(req.getContextPath() + "/dodaj");
	
	
	}
	
	

}
