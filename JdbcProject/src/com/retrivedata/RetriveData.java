package com.retrivedata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetriveData {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiceDb","root","root")){
			
			PreparedStatement ps = connection.prepareStatement("select * from Student ");
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				int roll = rs.getInt("roll");
				String name = rs.getString("Name");
				int standard = rs.getInt("class");
				
				System.out.println(roll + " "+ name + " "+ standard);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
