package com.AssignmentQuestion3;

public class SuperClass {

	
	public int gear; 
    public int speed; 
          
    // the Bicycle class has one constructor 
    public SuperClass(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    } 
          
    // the Bicycle class has three methods 
    protected int applyBrake(int decrement) 
    { 
        speed -= decrement; 
        return speed;
    } 
          
    public void speedUp(int increment) 
    { 
        speed += increment; 
    } 
      
    // toString() method to print info of Bicycle 
    public String toString()  
    { 
        return("No of gears are "+gear 
                +"\n"
                + "speed of bicycle is "+speed); 
    }  


}
