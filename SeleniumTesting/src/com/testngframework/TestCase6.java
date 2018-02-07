package com.testngframework;

import org.testng.annotations.Test;

public class TestCase6 
{
  @Test
  public void tc1() 
  {
	  long t_id = Thread.currentThread().getId();
	  System.out.println("The Current Test Case 1 was passed successfully and the Thread ID for current Test Case is - " + t_id);
  }
  @Test
  public void tc2() 
  {
	  long t_id = Thread.currentThread().getId();
	  System.out.println("The Current Test Case 2 was passed successfully and the Thread ID for current Test Case is - " + t_id);
  }
  @Test
  public void tc3() 
  {
	  long t_id = Thread.currentThread().getId();
	  System.out.println("The Current Test Case 3 was passed successfully and the Thread ID for current Test Case is - " + t_id);
  }
  @Test
  public void tc4() 
  {
	  long t_id = Thread.currentThread().getId();
	  System.out.println("The Current Test Case 4 was passed successfully and the Thread ID for current Test Case is - " + t_id);
  }
  @Test
  public void tc5() 
  {
	  long t_id = Thread.currentThread().getId();
	  System.out.println("The Current Test Case 5 was passed successfully and the Thread ID for current Test Case is - " + t_id);
  }
}
