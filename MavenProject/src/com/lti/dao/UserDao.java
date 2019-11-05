package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lti.model.Users;

public class UserDao {
	private Connection conn;
	
	private void openConnection() throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:scott@//localhost:1521/xe", "hr", "hr");
	
	}
	private void closeConnection(){
		try{
			conn.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public List<Users> readAllUsers(){
		List<Users> users = null;
		try{
			openConnection();
			String query = "Select * From PeopleClub1";
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			users = new ArrayList<>();
			while(result.next()){
				String id = result.getString("id");
				String fname = result.getString("Firstname");
				String lname = result.getString("Lastname");
				String DOB = result.getString("dob");
				String city = result.getString("city");
				Users user = new Users(id, fname, lname, DOB, city);
				users.add(user);
			}
		}catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			closeConnection();
		}
		return users;
	}
	
	public int deleteUser(String id){
		int result = 0;
		try{
			openConnection();
			String query = "Delete From PeopleClub1 Where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
		}
		catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			closeConnection();
		}
		return result;
	}
	public int createUser(Users user){
		int result = 0;
		try {
			openConnection();
			String query = "Insert Into PeopleClub1(id,Firstname, Lastname,DOB,city) Values (?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getFirstname());
			pstmt.setString(3, user.getLastname());
			pstmt.setString(4, user.getDOB());
			pstmt.setString(5, user.getCity());
			
			result = pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return result;
	}
	
}


	
	
	
	
	
	
	


