package com.platform.methodOverloading;

public class Sum {
int add;
	public int sum(int x, int y) 
    { 
		add = x + y;
		System.out.println("summ is: " + add);
        return add; 
    } 
  
     
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
  
    
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
	

}
