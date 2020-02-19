package com.NHS.Pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Utils.TestBase;

//Given below is NHSHomepage file implementing various functionalities of Step Definitions and it also extends Test Base Class which is used to intialize webdrivers 
public class NHSHompage extends TestBase {
String NHSMsg,NHSPrs,NHSDcheck,NHSFreeSightTest,NHSFreeFrabricWig,NHSMoneyOffNewGlasseslenses,NHSMoneyOffRepairGlasseslenses, NHSPaidTravel,NHSPresTick,
SightTestTick1,DentalExamTick1,DentalTreatment;
 int i=0;
 SoftAssert FrNHSCost =new SoftAssert();
 SoftAssert FrNHSPres =new SoftAssert();
 SoftAssert FrNHSDChkTreat=new SoftAssert();
 SoftAssert FrNHSSightTest=new SoftAssert();
 SoftAssert FrNHSFabricWig=new SoftAssert();
 SoftAssert MOffNHSGlasseslenses=new SoftAssert();
 SoftAssert MOffNHSRepairGlasslenses=new SoftAssert();
 SoftAssert PaidNHSTravel=new SoftAssert();
 SoftAssert PrescriptionTick=new SoftAssert();
 SoftAssert SightTestTick=new SoftAssert();
 SoftAssert DentalExamTick=new SoftAssert();
 SoftAssert DentalTreatmnt=new SoftAssert();

	//In this class various elements from Wales User Journey are declared

	@FindBy(id="next-button")
    public static WebElement NHSHomePgNextButton;
	public static WebElement NHSHelpDetails;
	//Declaring elements of Country Selection Page
	@FindBy(id="label-england")
	public static WebElement CountryEngland;
	@FindBy(id="label-scotland")
	public static WebElement CountryScotland;
	@FindBy(id="label-wales")
	public static WebElement Countrywales;
	@FindBy(id="label-nire")
	public static WebElement CountryNorthernireland;
	//Declaring elements of DOB page
	@FindBy(id="dob-day")
	public static WebElement NHSPatientday;
	@FindBy(id="dob-month")
	public static WebElement NHSPatientmonth;
	@FindBy(id="dob-year")
	public static WebElement NHSPatientyear;
	//Declaring elements in Results Page when the patient is below 16 years
	@FindBy(xpath="//*[@id='content']/div[2]/div/div[2]/h2")
	public static WebElement NHSFreecost;
	@FindBy(xpath="//*[@id='content']/div[2]/div/ul[1]/li[1]")
	public static WebElement NHSPrescription;
	@FindBy(xpath="//*[@id='content']/div[2]/div/ul[1]/li[2]")
	public static WebElement NHSDentalChecksTreatments;
	@FindBy(xpath="//*[@id='content']/div[2]/div/ul[1]/li[3]")
	public static WebElement NHSSightests;
	@FindBy(xpath="//*[@id='content']/div[2]/div/ul[1]/li[4]")
	public static WebElement NHSFabricWigs;
	@FindBy(xpath="//*[@id='content']/div[2]/div/ul[2]/li[1]")
	public static WebElement NewGlassesContactlenses;
	@FindBy(xpath="//*[@id='content']/div[2]/div/ul[2]/li[2]")
	public static WebElement RepairReplaceGlassesContactlenses;
	@FindBy(xpath="//*[@id=content]/div[2]/div/ul[3]/li")
	public static WebElement travelNHStreatment;
	
	
	 @FindBy(id="label-no")
	//*[@id="label-no"]
	 public static WebElement NoRadiobutton;
	 @FindBy(id="label-yes")
     public static WebElement YesRadiobutton;
	
    //Declaring elements in Over sixty years results page
	 @FindBy(id="prescription-tick")
	 public static WebElement NHSPrescriptionTick;
	 @FindBy(id="sight-test-tick")
	 public static WebElement NHSSightTestTick;	
	 @FindBy(id="dental-exam-tick")
	 public static WebElement NHSDentalExamTick;
	 @FindBy(id="dental-treatment-tick")
	 public static WebElement NHSDentalTreatmentTick;
	 
 public void Country(String ss) {
	
	//click on next button and select country based on user selection

	NHSHomePgNextButton.click();
	if (ss.equals("Wales")) {
	//if.Countrywales.equals(True)then
	Countrywales.click();
	NHSHomePgNextButton.click();
	}
	else if(ss.equals("England")) {
	CountryEngland.click();
	NHSHomePgNextButton.click();
	}
	else if(ss.equals("Scotland")) {
	CountryScotland.click();
	NHSHomePgNextButton.click();
	}
	else if(ss.equals("Northern Ireland")){
	CountryNorthernireland.click();
	NHSHomePgNextButton.click();	
	}
 }
  
	public void NHSPatientDOB(String d ,  String mm ,  String yyyy)
	
	{   
		System.out.println(d);
		System.out.println(mm);
		System.out.println(yyyy);
		Logger.getLogger("Tester");
		NHSPatientday.sendKeys(d);
		NHSPatientmonth.sendKeys(mm);
		NHSPatientyear.sendKeys(yyyy);
		NHSHomePgNextButton.click();
		
       
	}

	public void NHSFreeCostMsgCheck()
	{
		NHSMsg=NHSFreecost.getText();
        FrNHSCost.assertTrue(NHSMsg.contains("You get help with NHS costs"));
        FrNHSCost.assertAll();
	}
	public void NHSFreePrescriptionCheck()
	 {  
		 NHSPrs=NHSPrescription.getText();
		 FrNHSPres.assertTrue(NHSPrs.contains("NHS prescriptions"));
	 	 FrNHSPres.assertAll();
	 }
	 
	public void NHSFreeDentalTreamentsCheck()
	{
	    NHSDcheck=NHSDentalChecksTreatments.getText();
	    FrNHSDChkTreat.assertTrue(NHSDcheck.contains("NHS dental check-ups and treatment"));
        FrNHSDChkTreat.assertAll();
	}
	
	public void NHSFreeSighttests()
	{
		NHSFreeSightTest=NHSSightests.getText();
	    FrNHSSightTest.assertTrue(NHSFreeSightTest.contains("sight tests"));
	    FrNHSSightTest.assertAll();
	}
	
	public void NHSFreeFabricWigs()
	{
		NHSFreeFrabricWig =NHSFabricWigs.getText();
		FrNHSFabricWig.assertTrue(NHSFreeFrabricWig.contains("NHS wigs and fabric supports")); 
		FrNHSFabricWig.assertAll();
	}
	
	public void NHSMoneyoffGlassesContactlenses() {

		NHSMoneyOffNewGlasseslenses =NewGlassesContactlenses.getText();
		
		MOffNHSGlasseslenses.assertTrue(NHSMoneyOffNewGlasseslenses.contains("new glasses or contact lenses"));
		MOffNHSGlasseslenses.assertAll();
		
	}
	
	public void NHSMoneyoffReplaceGlassesContactlenses()
	{
		NHSMoneyOffRepairGlasseslenses =RepairReplaceGlassesContactlenses.getText();
		
		MOffNHSRepairGlasslenses.assertTrue(NHSMoneyOffRepairGlasseslenses.contains("repairing or replacing your glasses or contact lenses"));
		MOffNHSRepairGlasslenses.assertAll();
	}
	
	public void NHSPayedTravel()
	{
		NHSPaidTravel=travelNHStreatment.getText();
		PaidNHSTravel.assertTrue(NHSPaidTravel.contains("travel for NHS treatment"));
		PaidNHSTravel.assertAll();
	}	
	

	public void LivingWithPartner(String livinginfo)
	{
		if(livinginfo.equals("Yes")) { 
			YesRadiobutton.click();
		    NHSHomePgNextButton.click();
		}
		    if(livinginfo.equals("No")) {
		    	NoRadiobutton.click();		
		    NHSHomePgNextButton.click();
	     }
		}
	
	public void PrescriptionTick()
	{
		NHSPresTick=NHSPrescriptionTick.getText();
		PrescriptionTick.assertTrue(NHSPresTick.contains("NHS prescriptions"));
		PrescriptionTick.assertAll();
	
	}


   public void SightTestTick()
   {
	   SightTestTick1=NHSSightTestTick.getText();
	   SightTestTick.assertTrue(SightTestTick1.contains("sight tests"));
   
   }
   
   public void DentalExamTick()
   {
	       DentalExamTick1=NHSDentalExamTick.getText();
           DentalExamTick.assertTrue(DentalExamTick1.contains("NHS dental check ups"));
            		
   }

      public void Dentaltreatments()
   {
    	  DentalTreatment=NHSDentalTreatmentTick.getText();
    	  DentalTreatmnt.assertTrue(DentalTreatment.contains("NHS dental treatment"));
  	}
 public void BenefitsTaxCredit(String BenefitsTaxCredit) {
	if(BenefitsTaxCredit.equals("Yes")) { 
		YesRadiobutton.click();
	    NHSHomePgNextButton.click();
	}
	    if(BenefitsTaxCredit.equals("No")) {
		NoRadiobutton.click();		
	    NHSHomePgNextButton.click();
     }
	
}

public void InjuryArmedForces(String InjuryArmedForces) {
	if(InjuryArmedForces.equals("Yes")) { 
		YesRadiobutton.click();
	    NHSHomePgNextButton.click();
	}
	    if(InjuryArmedForces.equals("No")) {
		NoRadiobutton.click();		
	    NHSHomePgNextButton.click();
     }
	
}

public void PermanentlivingCareHome(String PermlivingCareHome) {
	
	if(PermlivingCareHome.equals("Yes")) { 
		YesRadiobutton.click();
	    NHSHomePgNextButton.click();
	}
	    if(PermlivingCareHome.equals("No")) {
		NoRadiobutton.click();		
	    NHSHomePgNextButton.click();
     }
}

public void OverSixteensaving(String OverSixteenSavings) {
	if(OverSixteenSavings.equals("Yes")) { 
		YesRadiobutton.click();
	    NHSHomePgNextButton.click();
	}
	    if(OverSixteenSavings.equals("No")) {
		NoRadiobutton.click();		
	    NHSHomePgNextButton.click();
     }
}	
public void FullTimeEducation(String FullTimeEdu) {

	if(FullTimeEdu.equals("Yes")) { 
		YesRadiobutton.click();
	    NHSHomePgNextButton.click();
	}
	    if(FullTimeEdu.equals("No")) {
		NoRadiobutton.click();		
	    NHSHomePgNextButton.click();
     }
}
	    public void Pregnant(String Prena) {

	    	if(Prena.equals("Yes")) { 
	    		YesRadiobutton.click();
	    	    NHSHomePgNextButton.click();
	    	}
	    	    if(Prena.equals("No")) {
	    		NoRadiobutton.click();		
	    	    NHSHomePgNextButton.click();
	    	    }
	    	    
	    }

       public void Diabetic(String Diabe){
       
           	   if(Diabe.equals("Yes")) { 
	    		YesRadiobutton.click();
	    	    NHSHomePgNextButton.click();
	    	}
	    	    if(Diabe.equals("No")) {
	    		NoRadiobutton.click();		
	    	    NHSHomePgNextButton.click();
	         }
       }    
       
	    public void Gloucoma(String Glouco){
	    	        
	            	if(Glouco.equals("Yes")) { 
	 	    		YesRadiobutton.click();
	 	    	    NHSHomePgNextButton.click();
	 	    	   }
	 	    	   if(Glouco.equals("No")) {
	 	    		NoRadiobutton.click();		
	 	    	    NHSHomePgNextButton.click();
	 	         }
       
       }   
	    
  
}



