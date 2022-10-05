package com6;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.text.ParseException;
import com7.Dsa20;

public class Dsa99  {

	public static void main(String[] args) throws ParseException {
		String s1 = "12:15:00";
		String s2 = "03:45:00";
SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
Date m1 = s.parse(s2);
Date m2 = s.parse(s1);
;long timedifference = Math.abs(m1.getTime()-m2.getTime());
System.out.println(timedifference/(1000*60*60) + " hour ");

	}
	
}
