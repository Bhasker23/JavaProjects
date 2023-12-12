package com.driveclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverClass {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String cs = "jdbc:mysql://localhost:3306/practiceDb";
		try {
			Connection con = DriverManager.getConnection(cs, "root", "root");
			
			if (con != null) {
				System.out.println("Connected");
			}else {
				System.out.println("NotConnect");
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
