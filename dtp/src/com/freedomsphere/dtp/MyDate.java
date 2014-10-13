package com.freedomsphere.dtp;

import java.time.LocalDate;
import java.time.Period;

public abstract class MyDate {
	
	private static boolean isOrderedCorrectly(LocalDate date1, LocalDate date2){
		if(date1.isBefore(date2)){
			return true;
		}else{
			return false;
		}
	}
	
	public static int getAgeYears(LocalDate date1, LocalDate date2){
		if(isOrderedCorrectly(date1, date2)){
			return Period.between(date1, date2).getYears();
		}else{
			return Period.between(date2, date1).getYears();
		}
	}
	
	public static int getAgeMonths(LocalDate date1, LocalDate date2){
		if(isOrderedCorrectly(date1, date2)){
			return Period.between(date1, date2).getMonths();
		}else{
			return Period.between(date2, date2).getMonths();
		}
	}
	
	public static int getAgeDays(LocalDate date1, LocalDate date2){
		if(isOrderedCorrectly(date1, date2)){
			return Period.between(date1, date2).getDays();
		}else{
			return Period.between(date2, date1).getDays();
		}
	}
}
