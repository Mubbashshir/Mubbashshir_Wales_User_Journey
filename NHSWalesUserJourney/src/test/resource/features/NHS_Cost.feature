

Feature: 
  As a NHS-Wales User I want to identify the cost for treatment

  Background: 
    Given I am on the NHS Cost Checker Tool and click Start button
    And I select Country as "Wales"

  #Written by Mubbashshir Mohiuddin
  #Positive Scenarios for NHS Help
  Scenario Outline: NHS Help Checker for children under sixteen years
    And I enter below sixteen chidren date of birth "<Day>", "<Month>","<Year>"
    Then the Patients gets help with NHS Cost

    Examples: 
      | Day | Month | Year |
      |  03 |    12 | 2005 |

  Scenario Outline: NHS Help Checker for Over 60
    And I enter Patients date of birth "<Day>", "<Month>","<Year>"
    And I select living with Partner info "<LivingwithPartner>"
    And I select Benefits and Tax Credit info "<BenefitsTaxCredit>"
    And I select Injury info when serving in Armed forces "<ArmedforcesInjuryinfo>"
    And I select Permanently living in carehome info "<PermanentCareHome>"
    And I select info of my savings over sixteen thousand "<Over16KSavinginfo>"
    Then the patient gets help with NHS Cost based on the selection

    Examples: 
      | Day | Month | Year | LivingwithPartner | BenefitsTaxCredit | ArmedforcesInjuryinfo | PermanentCareHome | Over16KSavinginfo |
      |  03 |    12 | 1940 | No                | No                | No                    | No                | No                |

  Scenario Outline: NHS Help Checker for children over sixteen years and full time education
    And I enter above sixteen full time education students date of birth "<Day>", "<Month>","<Year>"
    And I enter Full Time Education info "<Full Time Education>"
    Then the Patients gets help with NHS Cost

    Examples: 
      | Day | Month | Year | Full Time Education |
      |  03 |    12 | 2003 | Yes                 |

  Scenario Outline: NHS Help Checker for 32 years old Adult without a Partner, not claiming benefits and is pregnant
    And I enter thirty two years old adults date of birth "<Day>", "<Month>","<Year>"
    And I enter living with Partner info for the adult "<LivingwitPartner>"
    And I enter Benefits and Tax Credit info for the adult "<BenefitsTaxCredit>"
    And I enter Pregnancy details of the adult "<PregnancyDetails>"
    And I enter Injury info when serving in Armed forces for the adult "<ArmedforcesInjuryinfo>"
    And I enter Diabetic info about the adult "<Diabeticinfo>"
    And I enter Glaucoma info about the adult "<Glaucoma>"
    And I enter Permanently living in carehome info "<PermCareHome>"
    And I enter info of my savings over sixteen thousand "<Over16KSaveinfo>"
    Then the Adult is displayed results page providing detains of NHS Health

    Examples: 
      | Day | Month | Year | LivingwitPartner | BenefitsTaxCredit | PregnancyDetails | ArmedforcesInjuryinfo | Diabeticinfo | Glaucoma | PermCareHome | Over16KSaveinfo|
      |  10 |    07 | 1987 | No               | No                | Yes              | No                    | No           | No       | No           | No             |
