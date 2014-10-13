package com.freedomsphere.soldiertrack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dbc 
{
	
	public static ResultSet executeQuery(String query)
	{
		
		
		try 
		{
			//1. get a connection to db
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
					"nstanley", "aNzLMtcz12");
			
			//2. create a statement
					
			Statement myStat = myConn.createStatement();	
			
			//3. execute query
			
			return myStat.executeQuery(query);
			
			//4. process the result set
			
			
		}
		catch (Exception e) 	
		{
			e.printStackTrace();
		}
		
		
		return null;
		

	}
}

	
