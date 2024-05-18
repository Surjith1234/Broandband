package Broadband;

public class Subscription {
	String name;
	String phno;
	 int planId;
     double dataLimit;
     double price;
     int validity;
     public Subscription(Plan p,String name,String phno)
     {
    	 planId=p.planId;
     	dataLimit=p.dataLimit;
     	price=p.price;
     	validity=p.validity;
     	this.name=name;
     	this.phno=phno;
     }
     public Subscription()
     {
    	 
     }
//    public void subscribe(Plan p,String name,String phno)
//    {
//    	planId=p.planId;
//    	dataLimit=p.dataLimit;
//    	price=p.price;
//    	validity=p.validity;
//    	this.name=name;
//    	this.phno=phno;
//    }
}
