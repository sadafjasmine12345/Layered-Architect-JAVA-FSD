package com.pace.library.helper;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * HELPER class to handle DATACONNECTIVITY in MYSQL
 */
public class DbConnector {
	//New instance of Connection
	private static Connection connection=null;
	//Opening connection with MySql database
	public static Connection createConnection() throws ClassNotFoundException, SQLException{
		String url,userId,passWord;
		url="jdbc:mysql://@localhost:3306/library2";
		userId="root";
		passWord="Sai@#786";
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(url,userId,passWord);
		return connection;
		
	}
    //closing connection
    public static void closeConnection() throws ClassNotFoundException, SQLException{
    	connection.close();
    }
    	
	

}
