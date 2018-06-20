package com.payroll.databasemanage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.payroll.model.Employee;
import com.payroll.model.PaySlab;

public class DBManager{
	
	private static final String DBDriver = "com.mysql.jdbc.Driver";
	
	/*private static final String DBUrl = "jdbc:mysql://ec2-23-21-211-172.compute-1.amazonaws.com:3306/payrol";
	private static final String DBUrlPaySlab = "jdbc:mysql://us-cdbr-cb-east-01.cleardb.net:3306/cb_slab";
	
	private static final String DBUser = "victor";
	private static final String DBPass = "victor";
	
	private static final String DBUserPaySlab = "b56c1a7d237125";
	private static final String DBPassPaySlab = "1239cdcf";*/
	
	private static final String DBUrl = "jdbc:mysql://localhost/payroll";
	private static final String DBUrlPaySlab = DBUrl;
	private static final String DBUser = "root";
	private static final String DBUserPaySlab = DBUser;
	private static final String DBPass = "root";
	private static final String DBPassPaySlab = DBPass;
	

	static {
		try {
			Class.forName(DBDriver);
		} catch (Exception ex) {
			System.out.println("DBManager says Driver Not Avaialble." + ex);
		}
	}

	public static Employee authenticateUser(Employee e) {
		Employee authEmp = null;
		try {
			Connection con = DriverManager.getConnection(DBUrl, DBUser, DBPass);
			PreparedStatement st = con
					.prepareStatement("Select * from employee where id=? and password=?");
			st.setInt(1, e.getId());
			st.setString(2, e.getPassword());
			ResultSet rs = st.executeQuery();
			if (rs.next())
			{
				authEmp = new Employee();
				authEmp.setId(e.getId());
				authEmp.setPassword(e.getPassword());
				authEmp.setName(rs.getString(3));
				authEmp.setAge(rs.getInt(4));
				authEmp.setGender(rs.getString(5));
				authEmp.setContact(rs.getString(6));
				authEmp.setAddress(rs.getString(7));
				authEmp.setCategory(rs.getInt(8));
				authEmp.setSalary(rs.getInt(9));
			}
			rs.close();
			st.close();
			con.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return authEmp;
	}

	public static boolean registerEmployee(Employee e) {
		// TODO Auto-generated method stub
		boolean status = false;
		try {
			Connection con = DriverManager.getConnection(DBUrl, DBUser, DBPass);
			PreparedStatement st = con.prepareStatement("insert into employee values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			st.setInt(1, e.getId());
			st.setString(2, e.getPassword());
			st.setString(3, e.getName());
			st.setInt(4, e.getAge());
			st.setString(5, e.getGender());
			st.setString(6, e.getContact());
			st.setString(7, e.getAddress());
			st.setInt(8, e.getCategory());
			st.setInt(9, e.getSalary());
			st.executeUpdate();
			
			status = true;
			
			st.close();
			con.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return status;
	}
	public static PaySlab getSlab(int category)
	{
		PaySlab ps = null;
		try {
			Connection con = DriverManager.getConnection(DBUrlPaySlab, DBUserPaySlab, DBPassPaySlab);
			PreparedStatement st = con
					.prepareStatement("Select * from payslab where category=?");
			st.setInt(1, category);
			ResultSet rs = st.executeQuery();
			
			if(rs.next())
			{
				ps = new PaySlab();
				ps.setHra(rs.getInt(2));
				ps.setTa(rs.getInt(3));
				ps.setPf(rs.getInt(4));
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return ps;
		
	}
}
