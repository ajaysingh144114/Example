package com1;
import java.util.*;
public class Tut1 {

	 public static boolean containsDuplicate(int[] nums) {
	        HashSet<Integer> set = new HashSet<Integer>();
	        
	        for(int i=0 ; i<nums.length ; i++){
	            int num = nums[i]; //fetching the element
	            if(!set.contains(num)){ //checking if the elemnent exists
	                set.add(num);    //adding if the element does not exist
	            } 
	            else{ //this condition is satisified when there is a duplicate element existing thereby returning true
				return true;}
	        }
	        return false;
	    }
	
	public static void main(String[] args) {
		
		
		Random rand = new Random();
		int[] nums = new int[5];
		for(int i = 0; i<nums.length;i++) {
			nums[i]= rand.nextInt(20);
			System.out.println(nums[i]);
		}
		
	boolean m =	containsDuplicate(nums);
	System.out.println(m);

	}

}
