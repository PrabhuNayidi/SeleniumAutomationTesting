package com.testngframework;

/*import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;*/
import org.testng.annotations.Test;

public class TestCase3 
{
	  /*@BeforeMethod
	  public void login()
	  {
		  System.out.println("You have logged into your Account Successfully!");
	  }*/
		
	  @Test(priority = 1) 
	  public void checkUser() 
	  {
		  System.out.println("The User was checked among the Existing Records Successfully!");
	  }
	  
	  @Test(priority = 2)
	  public void createUser() 
	  {
		  System.out.println("New User was added to the Existing Records Successfully!");
	  }
	  
	  @Test(priority = 3)
	  public void editUser() 
	  {
		  System.out.println("The Selected User information was changed Successfully!");
	  }
	  
	  @Test(priority = 4)
	  public void deleteUser() 
	  {
		  System.out.println("The Selected User was deleted from the Existing Records Successfully!");
	  }
	  
	  /*@AfterMethod
	  public void logout()
	  {
		  System.out.println("You have logged out of your Account Successfully!");
	  }*/
}
