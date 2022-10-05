package com7;

import java.util.*;

public class DS10 {
	 public static boolean isLeapYear(int y) {
	        
	        if(y % 100 ==0 && y % 400 == 0 || y % 100 != 0 && y% 4== 0 )
	        return true;
	        return false;
	    }
	 public static String computeDate(int day, int year) {
	        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        String monthNames[] = {"JANUARY", "FEBRUARY", "MARCH", 
	                                "APRIL", "MAY", "JUNE", 
	                                "JULY", "AUGUST", "SEPTEMBER", 
	                                "OCTOBER", "NOVEMBER", "DECEMBER"};
	                                
	        boolean leap = isLeapYear(year);
	        
	        if (leap) {
	            monthDays[1] = 29;
	        }
	        
	        int i = 0;
	        int daySum = 0;
	        for (i = 0; i < monthDays.length; i++) {
	            daySum += monthDays[i];
	            if (daySum >= day) {
	                break;
	            }
	        }
	        
	        int date = day + monthDays[i] - daySum;
	        
	      
	        
	        return date +"TH "+ monthNames[i]+ ", " + year;
	        
	    }
	    
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        System.out.print("DAY NUMBER: ");
	        int dayNum = in.nextInt();
	        System.out.print("YEAR: ");
	        int year = in.nextInt();
	        System.out.print("DATE AFTER (N DAYS): ");
	        int n = in.nextInt();
	        
	        if (dayNum < 1 || dayNum > 366) {
	            System.out.println("DAY NUMBER OUT OF RANGE");
	            return;
	        }
	         
	        if (n < 1 || n > 100) {
	            System.out.println("DATE AFTER (N DAYS) OUT OF RANGE");
	            return;
	        }
	        
	        String dateStr = computeDate(dayNum, year);
	        
	        
	        int nDays = dayNum + n;
	        int nYear = year;
	        boolean leap = isLeapYear(year);
	        
	        if (leap && nDays > 366) {
	            nYear = nYear + 1;
	            nDays = nDays - 366;
	        }
	        else if (nDays > 366) {
	            nYear = nYear + 1;
	            nDays = nDays - 365;
	        }
	        
	        String nDateStr = computeDate(nDays, nYear);
	        
	        System.out.println();
	        System.out.println("DATE: " + dateStr);
	        System.out.println("DATE AFTER " + n 
	                            + " DAYS: " + nDateStr);
	    }
	}
		
	
	
	
	

