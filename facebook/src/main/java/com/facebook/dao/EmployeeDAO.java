package com.facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

import com.facebook.entity.Employee;

@Repository
public class EmployeeDAO implements EmployeeDAOInterface{

	public int registerEmployeeDAO(Employee ee) {
		int i=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/microservices2","root","rajesh");
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setString(1,ee.getName() );
			ps.setString(2, ee.getPass());
			ps.setString(3, ee.getEmail());
			ps.setString(4,ee.getAddress() );
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
