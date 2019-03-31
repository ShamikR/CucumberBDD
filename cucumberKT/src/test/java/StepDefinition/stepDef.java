package StepDefinition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef {
	
	
	
	@Given("^work hard$")
	public void work_hard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		 System.out.println("Bcground given") ;
	
	}

	
	
	@When("^study hard$")
	public void study_hard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Bcground when") ;
	}

	@Then("^practise hard$")
	public void practise_hard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		 System.out.println("Bcground then") ;
		
	}


	
	

	@Before(order=1)
	public void setUp()
	{
		System.out.println("HOOK - BEFORE");
	}
	
	@Before (order=2)
	public void setUp2()
	{
		System.out.println("HOOK - BEFORE order 2");
	}
	
	 
	
	@After(order=1)
	public void tearDown()
	{
		System.out.println("HOOK - Afters");
	}
	
	@After(order=2)
	public void tearDown2()
	{
		System.out.println("HOOK - Afters order 2 ");
	}
	
	
	
	

@Given("^I Open FaceBook Page In browser$")
public void i_Open_FaceBook_Page_In_browser() throws Throwable {
	
	
	System.out.println("i_Open_FaceBook_Page_In_browser") ;
    // Write code here that turns the phrase above into concrete actions

}

@When("^I provide \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_provide_and(String arg1, String arg2) throws Throwable {
	
	
	System.out.println("i_provide_and  "+arg1+"   "+arg2);
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^I verify the page title is \"([^\"]*)\"$")
public void i_verify_the_page_title_is(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("i_verify_the_page_title_is "+arg1) ;
	
   
}

@Given("^I set cucumber properly$")
public void i_set_cucumber_properly_and(DataTable d1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	 List<List<String>> testData = d1.raw() ;
	  
	  System.out.println("i_set_cucumber_properly_and first set "+testData.get(0).get(0)+" "+testData.get(0).get(1) );
	
	  System.out.println("i_set_cucumber_properly_and 2nd set "+testData.get(1).get(0)+" "+testData.get(1).get(1) );
		 
   
}

@When("^Code is running sucessfully$")
public void code_is_running_sucessfully() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("code_is_running_sucessfully") ;
	
	
   
}

@When("^No Setup Error blocks me$")
public void no_Setup_Error_blocks_me() throws Throwable {
	
	
	System.out.println("no_Setup_Error_blocks_me") ;
	
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^I give KT to Others on pipe and tag and hook$")
public void i_give_KT_to_Others_on_and_and_and(DataTable D2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	 List<List<String>> testData2 = D2.raw() ;
	
	System.out.println("I give KT to Others on pipe and tag and hook FIRST SET "+ testData2.get(0).get(0)+testData2.get(0).get(1)+testData2.get(0).get(2)+testData2.get(0).get(3)) ;
   
   
	System.out.println("I give KT to Others on pipe and tag and hook 2nd SET "+ testData2.get(1).get(0)+testData2.get(1).get(1)+testData2.get(1).get(2)+testData2.get(1).get(3)) ;
	   

}




@Given("^I am wake$")
public void i_am_wake() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("i_am_wake()");

}

@When("^I want to Learn Cucumber$")
public void i_want_to_Learn_Cucumber() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("I want to learn()");


}

@Then("^I run Code in Home$")
public void i_run_Code_in_Home() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("i_run code in home()");

  
}


@Given("^I am wake and in call with \"([^\"]*)\"$")
public void i_am_wake_and_in_call_with(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("i_am_wake() "+arg1);

   
}



@Then("^I run Code in Home and sharing using  (.*)$")
public void i_run_Code_in_Home_and_sharing_using_teamviewer(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("i_run code() "+arg1);

  
}



}
