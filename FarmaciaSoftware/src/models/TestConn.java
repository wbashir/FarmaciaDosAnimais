/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.sql.*;
import java.util.*;
/**
 *
 * @author warsame bashir
 * CYBER TEXTRON INC
 */
public class TestConn {
    // element to establish a connection
	private Connection conn;
	private String userName;
	private String password;
	private String serverName;
	private String dbms;
	private String dbName;
	private String portNumber;
        
        /*
	 * default constructor, only initializes the values
	 */
	public TestConn(){
		this.conn = null;
		this.userName = "root";
		this.password = "root";
		this.serverName = "127.0.0.1";
		this.dbms = "mysql";
		this.dbName = "OrangeDuck";
		this.portNumber = "3306";
	}
        
        
        /*
	 * establishes a connection and returns 
	 * a variable of the type Connection
	 * if an error happen, it throws a SQLException
	 * 
	 * SQLException needs to be handled appropriated
	 * 
	 */
	public Connection getConnection() throws SQLException {
		
			try {
			
			    Properties connectionProps = new Properties();
			    connectionProps.put("user", this.userName);
			    connectionProps.put("password", this.password);
	
			    if (this.dbms.equals("mysql")) {
			      this.conn = DriverManager.
			        getConnection("jdbc:" + this.dbms + "://" + this.serverName +
			                      ":" + this.portNumber + "/" + this.dbName, connectionProps);
			    } else if (this.dbms.equals("derby")) {
			      this.conn = DriverManager.
			      	//;create=true
			   getConnection("jdbc:" + this.dbms + ":" + this.dbName, connectionProps);
			    }
		  }
			catch (Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return this.conn;
	}
        
        
        
	/*
	 *	function closeConnection closes the db connection
	 *	returns a void value.
	 * 
	 */
	public void closeConnection(){
		
		if(this.conn != null){
			
			try{
				//closes the database Connection
				this.conn.close();
				System.out.println("Database connection terminated successfully");
			}
			
			catch(Exception e){
				System.out.println("An error happened during the attempt to close the connection");
			}
		}
		else{
			System.out.println("Connection was an invalid value (null)");
		}
	}
}
