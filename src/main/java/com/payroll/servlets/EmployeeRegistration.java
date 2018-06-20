package com.payroll.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.payroll.databasemanage.DBManager;
import com.payroll.model.Employee;

/**
 * Servlet implementation class EmployeeRegistration
 */
public class EmployeeRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		int category = Integer.parseInt(request.getParameter("category"));
		int salary = Integer.parseInt(request.getParameter("salary"));
		
		Employee e = new Employee();
		
		e.setId(id);
		e.setPassword(password);
		e.setName(name);
		e.setAge(age);
		e.setGender(gender);
		e.setContact(contact);
		e.setAddress(address);
		e.setCategory(category);
		e.setSalary(salary);
		
		if(DBManager.registerEmployee(e))
		{
			response.sendRedirect("registrationsuccessful.jsp");
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
	}

}
