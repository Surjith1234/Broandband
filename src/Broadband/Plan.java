package Broadband;

public class Plan {
     static int id=0;
     int planId;
     double dataLimit;
     double price;
     int validity;
     public Plan(int planId,Double dataLimit,double price,int validity)
     {
    	 this.planId=planId;
    	 this.dataLimit=dataLimit;
    	 this.price=price;
    	 this.validity=validity;
     }   
     
}
