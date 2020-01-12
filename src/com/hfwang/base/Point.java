package com.hfwang.base;

public class Point
{
   private double x;
   private double y;
    
   public Point() 
   {
	   this.x=1;
	   this.y=1;
   }
   
   public Point(double x,double y)
   {
	   this.x=x;
	   this.y=y;
   }
   

   public double distance(Point a){	  
	  return Math.pow((a.x-x)*(a.x-x)+(a.y-y)*(a.y-y),0.5);	   
   }
   
}
