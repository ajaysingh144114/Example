package com8;
import java.util.*;

public class Highest extends Record{

	private int index;
	
	 Highest(int cap){
	        super(cap);
	        this.index = 0;
	        }
	    
	    
	public void findHighestMarks() {
        // for simplicity I have assumed that there is not tie for the highest marks
        int highest = 0;
        for( int i =0; i < size; i++) {
            if( highest < marks[i]) {
                index = i;
                highest = marks[i];
                }
        }
    }
public void display() {
    super.display();
    System.out.println("Highest marks is obatained by "+names[index]+" with "+marks[index]+" as total marks.");
}


	public static void main(String[] args) {
		 int cap;
	       Scanner input = new Scanner(System.in);
	       System.out.println("Enter the strength of students");
	       cap = input.nextInt();
	       Highest obj = new Highest(cap);
	       obj.readArray();
	       obj.findHighestMarks();
	       obj.display();
	       input.close();
	

	}

}
