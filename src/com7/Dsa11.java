package com7;

import java.util.*;

public class Dsa11 {

	public static boolean leapyear(int y) {
		
if(y % 100 == 0 && y % 400 == 0 || y %100 != 0 && y% 4== 0) 
	return true;
return false;
	}
	
	
	public static String date(int day , int year) {
		
	int dMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
	 String Nmonth[] = {"JANUARY", "FEBRUARY", "MARCH", 
             "APRIL", "MAY", "JUNE", 
             "JULY", "AUGUST", "SEPTEMBER", 
             "OCTOBER", "NOVEMBER", "DECEMBER"};
		
		boolean l = leapyear(year);
		
		if(l) {
		dMonth[1]=29;
		}
		int i = 0;
		int sumday= 0;
		for (i = 0; i < Nmonth.length; i++) {
			sumday+= dMonth[i];
			if(sumday>= day) {
			break;
		}
			}
		
		int date = day + dMonth[i]- sumday;
		return date + "Th" + Nmonth[i]+ ", " + year;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int daynum= sc.nextInt();
		
		int year = sc.nextInt();
		
		int m = sc.nextInt();
		
		if(daynum <= 1 || daynum >=366) {
			System.out.println("please enter the right input");
		}
		
		
        String dateStr = date(daynum, year);
        
        System.out.println(dateStr );
        
        boolean l = leapyear(year);
        int nday = daynum + m;
       int  nyear = year;
        
        if( l && nday > 366) {
        	nyear = nyear+1;
        	nday = nday-366;
        	
        }
        else if(nday > 365){
        	nyear = nyear+1;
        	nday = nday-365;
        }
        
        String s = date(nday,nyear);
System.out.println("next will be " + s);
	}
	
	
}
