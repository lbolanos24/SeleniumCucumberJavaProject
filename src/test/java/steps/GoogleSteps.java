package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps{
    
    GooglePage google= new GooglePage();

    @Given("^I am in the Google search page$")
    public void navigateToGoogle(){
        google.navigateToGoogle();
    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){

    }

    @And("^click on the search button$")
    public void clickSearchButton(){

    }

    @Then("^the results match the criteria$")
    public void validateResults(){

    }

}