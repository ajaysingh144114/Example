package com;

public class Tuto89 {
  static boolean a2;
	public static void main(String args[]) {
		   int x = 20;
	        int y = 10;
	        double z = (x + y) * 7 + (--y + x);
	        System.out.println(z);	
	        
	        
	        int a1 = 7 * 3 + 24 / 3 - 5;
	        int b1 = (7 * 3) + (24 / 3) - 5;
	        System.out.print(a1 + ", " + b1);
	        
	        
	        boolean a, b, c;
	        a = b = c = true;

	        if( !a || ( b && c ) )
	        {
	            System.out.println("If executed");
	        }
	        else
	        {
	            System.out.println("else executed");
	            
	            
	            
	        }
	        
	         
	         x = 20;
	         y = 25;
	       boolean m = (++x < (y = y -= 4) || (x = x += 4) > y);
	       
	            System.out.println(m);
	            
	            
	            //--------------------------------
	            int marks = 50;

	            if( marks > 70 )
	                System.out.println("Distinction");
	            else if( marks > 35 )
	                System.out.println("Pass");
	            else
	                System.out.println("Fail");
	            //-------------------------------
	            
				
				marks = 50;

	            if( marks >= 70 )
	                System.out.println("Distinction");

	            if( marks < 70 && marks >= 35 )
	                System.out.println("Pass");

	            if( marks < 35 )
	                System.out.println("Fail");
	            //-------------------------------------
	            int day = 18;
	            
	            switch(day)
	            {
	                case 1:
	                    System.out.println("Monday");
	                    break;
	                case 2:
	                    System.out.println("Tuesday");
	                    break;
	                case 3:
	                    System.out.println("Wednesday");
	                    break;
	                case 4:
	                    System.out.println("Thursday");
	                    break;
	                case 5:
	                    System.out.println("Friday");
	                    break;
	                default:
	                    System.out.println("Weekend");
	                    break;
	            }
	            
	            char direction = 'N';
	            char west = 'W';

	            switch(direction)
	            {
	                case 'N':
	                    System.out.println("North");
	                    break;
	                case 'E':
	                    System.out.println("East");
	                    break;
	                case 'W':
	                    System.out.println("West");
	                    break;
	                case 'S':
	                    System.out.println("South");
	            }
	            
	            //------------------------------------
	            
	            int number = 3;
	            
	            if(number == 1)
	            {
	                System.out.println("One");
	            }

	            if(number == 2)
	            {
	                System.out.println("Two");
	            }

	            if(number == 3)
	            {
	                System.out.println("Three");
	            }
	            //-----------------------
	            number = 1;
	            
	            switch(number)
	            {
	                case 1:
	                    System.out.println("One");
	                   
	                case 2:
	                    System.out.println("Two");
	                    break;
	                case 3:
	                    System.out.println("Three");
	                    break;
	            }
	            //---------------
	            int i = 1, j = 0;
	            switch (i) {
	            case 1 :
	            	System.out.println("my name is ajay");
	            	
	                case 2 :
	                    j += 6;
	                case 4 :
	                    j += 1;
	                default :
	                    j += 2;
	                   
	                case 0 :
	                    j += 4;
	               
	            }
	            System.out.println("j = " + j);
	            
	            //----------------
	        
	            if (a2) {
	                System.out.println("A");
	            } else if (a2 && b) {
	                System.out.println("A && B");
	            } else {
	            	if (!b) {
	                    System.out.println("notB");
	                } else {
	                    System.out.println("ELSE");
	                }
	            }
	            int marks1 = 65;

	            if( marks1 > 70 )
	            {
	                System.out.println("Distinction");
	                System.out.println("Congratulations");
	            }
	            else if( marks1 > 35 )
	            {
	                System.out.println("Pass");
	            }
	            else
	            {
	                System.out.println("Fail");
	                System.out.println("Better luck next time");
	            }
	            int day1 = 2;
	            
	            switch(day1)
	            {
	                case 1:
	                    System.out.println("Monday");
	                    break;
	                case 2:
	                    System.out.println("Tuesday");
	                    break;
	                case 3:
	                    System.out.println("Wednesday");
	                    break;
	                case 4:
	                    System.out.println("Thursday");
	                    break;
	                case 5:
	                    System.out.println("Friday");
	                    break;
	                default:
	                    System.out.println("Weekend");
	                    break;
	            }
	            //----------------------
	            int day2 = 7;

	            switch(day2)
	            {
	                case 1:
	                    System.out.println("Monday");
	                case 2:
	                    System.out.println("Tuesday");
	                case 3:
	                    System.out.println("Wednesday");
	                case 4:
	                    System.out.println("Thursday");
	                case 5:
	                    System.out.println("Friday");
	            }
	        }

	    }
	
			
	
	

