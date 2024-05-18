package Broadband;
import java.util.*;
public class Broadband {
    public static void showPlan(ArrayList<Plan> plan)
    {
    	System.out.println("plan Id    Datalimit   Price   validity");
    	for(Plan p:plan)
    	{
    		System.out.println(p.planId+"  "+p.dataLimit+"   "+p.price+"   "+p.validity);
    	}
    }
    public static Plan selectPlan(ArrayList<Plan> plan1,int id)
    {
    	
    	for(Plan p:plan1)
    	{
    		if(p.planId==id) return p;
    	}
		return null;
    	
    }
    public static void showSubscription(ArrayList<Subscription> s)
    {
    	System.out.println(" name  phno  plan Id    Datalimit   Price   validity");
    	for(Subscription sub:s)
    	{
    		System.out.println(sub.name+" "+sub.phno+"  "+sub.planId+" "+sub.dataLimit+" "+"  "+sub.price+"  "+sub.validity);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           ArrayList<Plan> plan=new ArrayList<>();
           Subscription subscribe=new Subscription();
           ArrayList<Subscription> subscription=new ArrayList<>();
           plan.add(new Plan(1,2.0,200.0,29));
           plan.add(new Plan(2,1.0,150.0,29));
           plan.add(new Plan(3,1.5,189.0,29));
           while(true)
           {
        	   System.out.println("1->show plans");
        	   System.out.println("2->to Recharge");
        	   System.out.println("3->to add plans");
        	   byte b=sc.nextByte();
        	   switch(b)
        	   {
        	   case 1:
        		   System.out.println("***********plans****************");
        		   showPlan(plan);
        	        break;
        	   case 2:
        		   System.out.println("Enter the plan id");
        		   int planId=sc.nextInt();
        		   sc.nextLine();
        		   Plan p=selectPlan(plan,planId);
        		   System.out.println("Enter the name");
        		   String name=sc.nextLine();
        		   System.out.println("Enter the phone number");
        		   String phno=sc.next();
        		   subscription.add(new Subscription(p,name,phno));
        		   showSubscription(subscription);
        		   break;
        		   
        	   case 3:
        		   System.out.println();
        	   }   
           }
	}

}
