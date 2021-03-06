package com.lti.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.model.Users;
import com.lti.service.UserService;

public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String DOB = request.getParameter("DOB");
		String city = request.getParameter("city");
		
		Users user = new Users(id, firstname, lastname, DOB, city);
		UserService service = new UserService();
		boolean result = service.addUser(user);
		
		RequestDispatcher rd = request.getRequestDispatcher("showUsers.view");
		rd.forward(request, response);
	}

}
