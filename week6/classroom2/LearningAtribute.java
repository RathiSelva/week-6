package week6.classroom2;

import org.testng.annotations.Test;

public class LearningAtribute {
	
	@Test(invocationCount =5,priority =0)		
    public void waitTo(){
	    System.out.println("walking");}
	    
	    @Test(priority =2,alwaysRun = true)		
	       public void goByBus(){
		    System.out.println("Go to School by Bus");}

	    @Test(priority =1,enabled = true)		
	       public void goByCar(){
		    System.out.println("Go to School by Car");}
	    
	    
	    @Test(dependsOnMethods = "goByCar")
	    public void goByVan(){
		    System.out.println("Go to School by Van");}
	    

	

	public static void main(String[] args) {
		LearningAtribute school= new LearningAtribute();
		school.waitTo();
		school.goByBus();
		school.goByCar();
      
		

}}
