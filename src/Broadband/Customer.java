package Broadband;

public class Customer {
     static int id=1;
     int cus_id;
     String name;
     String phno;
     public Customer(String name,String phno)
     {
    	 cus_id=id+1;
    	 this.name=name;
    	 this.phno=phno;
     }
}
