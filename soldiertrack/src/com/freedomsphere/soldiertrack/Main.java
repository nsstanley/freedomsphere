package com.freedomsphere.soldiertrack;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int userChoice = 1;
		
		printWelcome();
		
		Scanner reader = new Scanner(System.in);
		do
		{
			printMainMenu();
			System.out.println("Choose an item (0 to exit): ");
			userChoice=reader.nextInt();
				
			switch(userChoice)
			{
			case 1:
				printSoldierList();
				
				break;
			case 2:
				printContactRoster();
				
				break;
			case 3:
				addSoldier();
			case 4:
				listTables();
			default:
					
			}
		}while (userChoice != 0);
		
		reader.close();
		System.exit(0);
		
		
		
		
	}
	
	public static void printSoldierList()
	{
		ArrayList<Soldier> soldiersList = new ArrayList<Soldier>();
		ResultSet results = Dbc.executeQuery("SELECT * FROM soldier");
		try {
			while (results.next())
			{
				Soldier sm = new Soldier(results.getInt("id"), results.getString("first_name"), 
					results.getString("middle_name"), results.getString("last_name"), 
					results.getString("dob"), results.getString("sex"));
				soldiersList.add(sm);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Soldier item : soldiersList)
		{
			System.out.println(item);
		}
	}
	public static void printContactRoster()
	{
		
	}
	
	public static void addSoldier()
	{
		System.out.println(buildInsertQuery("soldier", "last_name","first_name","middle_name","sex","dob","test_l","test_f","test_m","male","19811206"));
	}
	
	public static void printWelcome()
	{
		System.out.println("*******************************");
		System.out.println("Welcom to the Soldier Tracker");
		System.out.println("*******************************");
	}
	public static void printMainMenu()
	{
		System.out.println("\n1. List All Soldiers");
		System.out.println("2. List Contact Roster\n");
		System.out.println("3. Add Soldier\n");
	}
	public static void listTables()
	{
		ResultSet results = Dbc.executeQuery("SHOW TABLES");
		try {
			while (results.next())
			{
				System.out.println(results.getString("Tables_in_mydb"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	public static String buildInsertQuery(String tableName, String col1, String col2, String col3,
			String col4, String col5, String in1, String in2, String in3, String in4, String in5)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO ");
		sb.append(tableName);
		sb.append(" (");
		sb.append(col1);
		sb.append(", ");
		sb.append(col2);
		sb.append(", ");
		sb.append(col3);
		sb.append(", ");
		sb.append(col4);
		sb.append(", ");
		sb.append(col5);
		sb.append(") ");
		sb.append("VALUES ");
		sb.append(" (");
		sb.append(in1);
		sb.append(", ");
		sb.append(in2);
		sb.append(", ");
		sb.append(in3);
		sb.append(", ");
		sb.append(in4);
		sb.append(", ");
		sb.append(in5);
		sb.append(") ");
		return sb.toString();
	}

}

/***************DB Info*****************
 * `address` - `id`, `street`, `street2`, `city`, `state`, `zip`, `sm_info_id`
 * `apft` - `id`, `date`, `score`, `pass`, `sm_info_id`
 * `contract` - `id`, `start_date`, `end_date`, `sm_info_id`
 * `credential` - `id`, `name`, `end_date`, `sm_info_id`
 * `drivers_license` - `id`, `end_date`, `type`, `sm_info_id`
 * `htwt` - `id`, `date`, `pass`, `sm_info_id`
 * `online_training` - `id`, `name`, `start_date`, `end_date`, `sm_info_id`
 * `phone` - `id`, `number`, `type`, `sm_info_id`
 * `qual` - `id`, `date`, `score`, `weapon`, `sm_info_id`
 * `rank` - `id`, `rank`, `date`, `sm_info_id`
 * `resident_training` - `id`, `name`, `location`, `start_date`, `end_date`, `sm_info_id`
 * `soldier` - `id`, `last_name`, `first_name`, `middle_name`, `sex`, `dob`
 */
