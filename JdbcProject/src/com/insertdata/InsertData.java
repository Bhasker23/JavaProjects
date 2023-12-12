package com.insertdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter roll number");
		int roll = sc.nextInt();
		
		System.out.println("Enter Name");
		String name = sc.next();
		
		System.out.println("Enter class");
		int standard = sc.nextInt();
		
		
		try {	
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiceDb", "root", "root")) {
			
			PreparedStatement ps = connection.prepareStatement("insert into Student values (?,?,?)");
			
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setInt(3, standard);
			
			int val = ps.executeUpdate();
			
			if(val > 0) {
				System.out.println("You have successfully Insterted Data");
			}else {
				System.out.println("Oops! Data not inserted");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
