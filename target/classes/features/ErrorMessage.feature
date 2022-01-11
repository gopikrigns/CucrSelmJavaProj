Feature: Calculator And Tools Funtions
 
  
  Scenario: Calculator error message funtion
   
 
   Given enter the url "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/" 
   And click on menu item 
   And click on how much i borrow link
   And enter only the living expense field
   Then click on the how much i borrow button
   And Then User can view error  message "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500" 
   And close browser
   
   
   

