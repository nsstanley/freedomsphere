package com.freedomsphere.soldiertrack;

import java.util.GregorianCalendar;

abstract class Test {
	private int id = 0;
	private GregorianCalendar date;
	
	public Test(int yyyy, int mm, int dd){
		setDate(yyyy,mm,dd);
	}
	
	public Test(){
		
	}
	
	public int getId(){
		return id;
	}
	
	public void setDate(int yyyy, int mm, int dd){
		this.date = new GregorianCalendar(yyyy, mm, dd);
	}
	
	public GregorianCalendar getDate(){
		return date;
	}
}
