package com.testngframework;

import org.testng.annotations.Test;

public class TestCase7 
{
	  @Test
	  public void tc6() 
	  {
		  long t_id = Thread.currentThread().getId();
		  System.out.println("The Current Test Case 6 was passed successfully and the Thread ID for current Test Case is - " + t_id);
	  }
	  @Test
	  public void tc7() 
	  {
		  long t_id = Thread.currentThread().getId();
		  System.out.println("The Current Test Case 7 was passed successfully and the Thread ID for current Test Case is - " + t_id);
	  }
	  @Test
	  public void tc8() 
	  {
		  long t_id = Thread.currentThread().getId();
		  System.out.println("The Current Test Case 8 was passed successfully and the Thread ID for current Test Case is - " + t_id);
	  }
	  @Test
	  public void tc9() 
	  {
		  long t_id = Thread.currentThread().getId();
		  System.out.println("The Current Test Case 9 was passed successfully and the Thread ID for current Test Case is - " + t_id);
	  }
	  @Test
	  public void tc10() 
	  {
		  long t_id = Thread.currentThread().getId();
		  System.out.println("The Current Test Case 10 was passed successfully and the Thread ID for current Test Case is - " + t_id);
	  }
}
