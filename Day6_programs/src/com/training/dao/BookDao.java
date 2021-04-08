package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDao {
	private Connection connection;

	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//1
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","");
			if(connection != null)
			{
				System.out.println("Connection done...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void addBook(String isbn,String title,double price,long stock)
	{
		try {
			PreparedStatement pstmt=connection.prepareStatement("insert into book values(?,?,?,?)");
			pstmt.setString(1, isbn);
			pstmt.setString(2, title);
			pstmt.setDouble(3, price);
			pstmt.setLong(4, stock);
			pstmt.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void getAllBooks()
	{
		try {
			PreparedStatement pstmt=connection.prepareStatement("select * from book");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getLong(4));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		BookDao dao=new BookDao();
		dao.addBook("7554", "CSharp", 345.50, 200);
		dao.getAllBooks();

	}
}
