package com.nhs.teststeps;
import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import com.NHS.Pages.NHSHompage;
import Utils.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//Given below is implementation of Step Definitions of Wales User Journey
public class NHSTestSteps extends TestBase {

	
	NHSHompage homepage1=null;
	
	
	
	@Before
	public void setup() throws IOException {
	    initialize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			
	}

	@Given("I am on the NHS Cost Checker Tool and click Start button")
	public void i_am_on_the_NHS_Cost_Checker_Tool_and_click_Start_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(CONFIG.getProperty("testsiteName")); 
		
	   // throw new cucumber.api.PendingException();
	}
		
	
	@And("^I select Country as \"(.*)\"$")
	public void i_select_Country_as(String string) throws Exception  {
	    // Write code here that turns the phrase above into concrete actions
		 homepage1=PageFactory.initElements(driver, NHSHompage.class);
		 homepage1.Country(string);
			
			
		
		}

	@And("I enter below sixteen chidren date of birth {string},{string},{string}")
	public void i_enter_Patients_date_of_birth(String string, String string2, String string3) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions

		homepage1=	PageFactory.initElements(driver, NHSHompage.class);
	    homepage1.NHSPatientDOB(string, string2, string3);
	   
	}


	@Then("the Patients gets help with NHS Cost")
	public void the_Patients_gets_help_with_NHS_Cost() {
	    // Write code here that turns the phrase above into concrete actions
	    homepage1=	PageFactory.initElements(driver, NHSHompage.class);
	    homepage1.NHSFreeCostMsgCheck();
	    homepage1.NHSFreePrescriptionCheck();
	    homepage1.NHSFreeDentalTreamentsCheck();
	    homepage1.NHSFreeSighttests();
	    homepage1.NHSFreeFabricWigs();
	    homepage1.NHSMoneyoffGlassesContactlenses();
	    homepage1.NHSMoneyoffReplaceGlassesContactlenses();
	}
	
	@And("I enter Patients date of birth {string}, {string},{string}")
	public void i_enter_Patients_date_of_birth_oversixty(String string, String string2, String string3) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions

	   homepage1=	PageFactory.initElements(driver, NHSHompage.class);
	    
	    homepage1.NHSPatientDOB(string, string2, string3);
	   
	}

	
	@And("I select living with Partner info {string}")
	public void I_select_living_with_Partner_info(String string)
	{
       homepage1=PageFactory.initElements(driver, NHSHompage.class);
	   
	   homepage1.LivingWithPartner(string);
	}
	
	@And("I select Benefits and Tax Credit info {string}")
	public void I_select_Benefits_and_Tax_Credit_info(String string)
	{
		   homepage1=PageFactory.initElements(driver, NHSHompage.class);
		   homepage1.BenefitsTaxCredit(string);
	}
	
	
	@And("I select Injury info when serving in Armed forces {string}")
	public void I_select_Injury_info_when_serving_in_Armed_forces(String string)
	{
		  homepage1=PageFactory.initElements(driver, NHSHompage.class);
		  homepage1.InjuryArmedForces(string);
	}
	
	@And("I select Permanently living in carehome info {string}")
	public void I_select_Permanently_living_in_carehome_info(String string) {
	
		 homepage1=PageFactory.initElements(driver, NHSHompage.class);
		 homepage1.PermanentlivingCareHome(string);
	}
	
	@And("I select info of my savings over sixteen thousand {string}")
	public void I_select_info_of_my_savings_over_sixteen_Thousand(String string) {
		homepage1=PageFactory.initElements(driver, NHSHompage.class);
		homepage1.OverSixteensaving(string);
	}
	
	@Then("the patient gets help with NHS Cost based on the selection")
	public void the_patient_gets_help_with_NHS_Cost_based_on_the_selection()
	{   //This method uses annotations to verify elements in result page
		homepage1=PageFactory.initElements(driver, NHSHompage.class);
	    homepage1.PrescriptionTick();
	    homepage1.SightTestTick();
	    homepage1.DentalExamTick();
	}
	
	@And("I enter above sixteen full time education students date of birth {string}, {string},{string}")
	public void i_enter_Patients_date_of_birth_collegeUniversity_Student(String string, String string2, String string3) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
	    homepage1=	PageFactory.initElements(driver, NHSHompage.class);
	    
	    homepage1.NHSPatientDOB(string, string2, string3);
	   
	}	
	
	@And("I enter Full Time Education info {string}")
	public void I_enter_full_time_education_info(String string) {
		homepage1=PageFactory.initElements(driver, NHSHompage.class);
		homepage1.FullTimeEducation(string);
	}
	
	@Then("the Student gets details of help with NHS Cost")
	public void the_Student_gets_help_with_NHS_Cost() {
	    // Write code here that turns the phrase above into concrete actions
	    homepage1=	PageFactory.initElements(driver, NHSHompage.class);
	    homepage1.NHSFreeCostMsgCheck();
	    homepage1.NHSFreePrescriptionCheck();
	    homepage1.NHSFreeDentalTreamentsCheck();
	    homepage1.NHSFreeSighttests();
	    homepage1.NHSFreeFabricWigs();
	    homepage1.NHSMoneyoffGlassesContactlenses();
	    homepage1.NHSMoneyoffReplaceGlassesContactlenses();
	}
	
	
	@And("I enter thirty two years old adults date of birth {string}, {string},{string}")
	public void i_enter_32_year_old_adults_date_of_birth(String string, String string2, String string3) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
	    homepage1=	PageFactory.initElements(driver, NHSHompage.class);
	    
	    homepage1.NHSPatientDOB(string, string2, string3);
	}
	
	 
	 @And("I enter living with Partner info for the adult  {string}")
		public void I_enter_living_with_Partner_info(String string)
		{
	       homepage1=PageFactory.initElements(driver, NHSHompage.class);
		   
		   homepage1.LivingWithPartner(string);
		}
		
		@And("I enter Benefits and Tax Credit info for the adult {string}")
		public void I_enter_Benefits_and_Tax_Credit_info(String string)
		{
			   homepage1=PageFactory.initElements(driver, NHSHompage.class);
			   homepage1.BenefitsTaxCredit(string);
		}
		
		
		@And("I enter Pregnancy details of the adult {string}")
		public void I_enter_Pregnancy_details_of_the_adult(String string)
		{
			   homepage1=PageFactory.initElements(driver, NHSHompage.class);
			   homepage1.Pregnant(string);
		}
		
		@And("I enter Injury info when serving in Armed forces for the adult {string}")
		public void I_enter_Injury_info_when_serving_in_Armed_forces(String string)
		{
			  homepage1=PageFactory.initElements(driver, NHSHompage.class);
			  homepage1.InjuryArmedForces(string);
		}
		
		@And("I enter Diabetic info about the adult {string}")
		public void I_enter_Diabetic_info_about_the_adult(String string)
		{
			  homepage1=PageFactory.initElements(driver, NHSHompage.class);
			  homepage1.Diabetic(string);
		}
		
		@And("I enter Glaucoma info about the adult {string}")
		public void I_enter_Glaucoma_info_about_the_adult(String string)
		{
			  homepage1=PageFactory.initElements(driver, NHSHompage.class);
			  homepage1.Gloucoma(string);
		}
		
		
		@And("I enter Permanently living in carehome info {string}")
		public void I_enter_Permanently_living_in_carehome_info(String string) {
		
			 homepage1=PageFactory.initElements(driver, NHSHompage.class);
			 homepage1.PermanentlivingCareHome(string);
		}
		
		@And("I enter info of my savings over sixteen thousand{string}")
		public void I_enter_info_of_my_savings_over_sixteen_Thousand(String string) {
			homepage1=PageFactory.initElements(driver, NHSHompage.class);
			homepage1.OverSixteensaving(string);
		}
	
	
		@Then("the 32 year old Adult is displayed results page providing detains of NHS Health")
		public void the_thiry_two_year_old_Adult_is_displayed_result_details_of_NHS_Health()
		{   //This method uses annotations to verify elements in result page
			homepage1=PageFactory.initElements(driver, NHSHompage.class);
		    homepage1.PrescriptionTick();
		    homepage1.DentalExamTick();
		    homepage1.Dentaltreatments();
		}
		
		
@After
public void cleardown(){
    driver.quit();
	driver=null;
}

}








