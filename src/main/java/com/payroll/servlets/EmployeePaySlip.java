package com.payroll.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.payroll.databasemanage.DBManager;
import com.payroll.model.Employee;
import com.payroll.model.PaySlab;


/**
 * Servlet implementation class EmployeePaySlip
 */
public class EmployeePaySlip extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeePaySlip() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false); 
		Employee e = (Employee) session.getAttribute("authEmp");
		
		int bs = e.getSalary();
		
		
		
		PaySlab ps = DBManager.getSlab(e.getCategory());
		if(ps != null)
		{
			
			int hra, ta, pf;
			hra = ps.getHra(); ta = ps.getTa(); pf = ps.getPf();
			float gsal = bs + ((float)hra/100)*bs + ((float)ta/100)*bs;
			float netsal = gsal- ((float)pf/100)*bs;
			
			
			
			session.setAttribute("ps", ps);
			session.setAttribute("gsal", gsal);
			session.setAttribute("netsal", netsal);
			
			getServletContext().getRequestDispatcher("/salaryslip.jsp").forward(request, response);
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}
}
