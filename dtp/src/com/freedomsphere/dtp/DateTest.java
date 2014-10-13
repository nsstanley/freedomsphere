package com.freedomsphere.dtp;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateTest {
    
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1981, Month.DECEMBER, 06);
		LocalDate anniversary = LocalDate.of(2003, Month.APRIL, 26);
		
		System.out.println("Today is:\t\t" + today);
		System.out.println("My Birthday is:\t\t" + birthday);
		System.out.println("My Anniversary is:\t" + anniversary);
		
		long realAgeInDays = birthday.until(today, ChronoUnit.DAYS);
		long realAgeInMonths = birthday.until(today, ChronoUnit.MONTHS);
		long realAgeInYears = birthday.until(today, ChronoUnit.YEARS);
		int ageInDays = MyDate.getAgeDays(today, birthday);
		int ageInYears = MyDate.getAgeYears(birthday, today);
		int ageInMonths = MyDate.getAgeMonths(birthday, today);
		
		int marriageInYears = MyDate.getAgeYears(today, anniversary);
		int marriageInMonths = MyDate.getAgeMonths(today, anniversary);
		int marriageInDays = MyDate.getAgeDays(today, anniversary);
		
		System.out.println("I am " + realAgeInYears + " years old.");
		System.out.println("I am " + realAgeInMonths + " months old.");
		System.out.println("I am " + realAgeInDays + " days old.");
		
		System.out.println("I have been married for: ");
		System.out.println(marriageInYears + " years, or");
		System.out.println(marriageInMonths + " months, or");
		System.out.println(marriageInDays + " days.");
		
		
		
	}
	
	
	
	

}
