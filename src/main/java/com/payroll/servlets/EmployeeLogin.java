package com.payroll.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.payroll.databasemanage.DBManager;
import com.payroll.model.Employee;

/**
 * Servlet implementation class EmployeeLogin
 */
public class EmployeeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeLogin() {
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
		Employee e = new Employee();
		e.setId(id);
		e.setPassword(password);
		Employee authEmp = DBManager.authenticateUser(e);
		if(authEmp != null)
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("authEmp", authEmp);
			
			getServletContext().getRequestDispatcher("/welcome.jsp").forward(request, response);
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
	}

}
