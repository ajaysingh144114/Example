package com;

public class tutorial89898 {

	public static void main(String[] args) {
	int	k = 5;
	int j = 9;
    	k+= k++ - ++j +k;
    	System.out.println(k);
    	System.out.println(j);
    	
//----------------------------------------------------------------------------------------------------------
    	
    	
    	int a =5;
    	a++;
    	System.out.println(a);
    	a=a-(a--)-(--a);
    	System.out.println(a);
    
    	
 //---------------------------------------------------------------------------------------------------------
      
    	
    	int p = 7;
    	p += p++ + ++p + --p + p--;
		System.out.println(p);
//----------------------------------------------------------------------------------------------------------
		int o = 5;
		 int l = 2;
		o += o++ - ++l + o;
		System.out.println(o);
//---------------------------------------------------------------------------------------------------------
			
	 int x = 5;
	 x = x + x + (x++ * x++);
	 System.out.println(x);
//---------------------------------------------------------------------------------------------------------
	 int m = 2; 
	 int i = 3;
	 int z = 9;
	 
	 int h = m - (++i) % z;
	 System.out.println(h);
	 
	 
}
}
