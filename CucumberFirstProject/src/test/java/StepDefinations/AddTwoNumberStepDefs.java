package StepDefinations;

import java.util.Scanner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddTwoNumberStepDefs {
	
	int x=0;
	int y=0;
	int z=0;
	
	@Given("^Users Enters Two numbers$")
	public void users_Enters_Two_numbers() throws Throwable {
	     Scanner scn=new Scanner(System.in);
	     System.out.println("Enter first Number");
	     x=scn.nextInt();
	     System.out.println("Enter second number");
	     y=scn.nextInt();
	}

	@Given("^Add Two Numbers$")
	public void add_Two_Numbers() throws Throwable {
	    z=x+y;
	}

	@Then("^Result is Displayed$")
	public void result_is_Displayed() throws Throwable {
	   System.out.println("Sum of two  number is "+ z);
	}


}
