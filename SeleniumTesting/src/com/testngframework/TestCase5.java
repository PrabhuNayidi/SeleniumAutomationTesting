package com.testngframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase5 
{
  @BeforeClass(groups = {"Sanity", "Regression"})
  public void login() 
  {
	  System.out.println("You have successfully loggeed into your Account!!");
  }
  
  @Test(groups = {"Sanity", "Regression"})
  public void balance() 
  {
	  System.out.println("You have the following Available Balance in your Account -- ");
  }
  
  @Test(groups = {"Regression"})
  public void approvedTransactions() 
  {
	  System.out.println("The Approved Transactions on your Account were displayed below:");
  }
  
  @Test(groups = {"Sanity", "Regression"})
  public void pendingTransactions() 
  {
	  System.out.println("The Pending Transactions on your Account are:");
  }
  
  @Test(groups = {"Regression"})
  public void fraudAlerts() 
  {
	  System.out.println("!!!!You have Fraud Alerts placed on your Account!!!!");
  }
  
  @Test(groups = {"Regression"})
  public void creditCheck() 
  {
	  System.out.println("You have a Recent Credit Check on your Account!!");
  }
  
  @Test(groups = {"Sanity", "Regression"})
  public void creditLimitIncrease() 
  {
	  System.out.println("You have Requested for a Credit Limit Increase!!");
  }
  
  @Test(groups = {"Sanity", "Regression"})
  public void addressChange() 
  {
	  System.out.println("You have successfully loggeed into your Account!!");
  }
  
  @Test(groups = {"Sanity", "Regression"})
  public void addAuthorizedUser() 
  {
	  System.out.println("You Address has been Updated and was posted on your Account!!");
  }
  
  @AfterClass(groups = {"Sanity", "Regression"})
  public void logout() 
  {
	  System.out.println("You have successfully loggeed out of your Account!!");
  }
}
