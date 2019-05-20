package com.AssignmentQuestion3;

public class SubClassA extends SuperClass {

	public int seatHeight; 
    
    // the MountainBike subclass has one constructor 
    public SubClassA(int gear,int speed,int startHeight) 
    { 
        // invoking base-class(SuperClass_Bicycle) constructor 
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
          
   // overriding toString() method 
   // of Bicycle to print more info 
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nseat height is "+seatHeight); 
    } 
    
    public int applyBrake(int decrement) 
          { 
              speed -= decrement;
              return speed;
          } 

}
