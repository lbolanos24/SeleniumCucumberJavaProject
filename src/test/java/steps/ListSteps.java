package steps;

import java.nio.file.NotLinkException;
import java.util.List;

import io.cucumber.java.en.*;
import pages.ListPage;

public class ListSteps {

    ListPage list = new ListPage();

    @Given ("^I navigate to the list page$")
    public void navigateToListPage() throws NotLinkException{
        list.navigateToListPage();
    }

    @When ("^I search the list$")
    public void searchTheList() throws InterruptedException{
        list.enterSearchCriteria();
    }
    
    @Then("^I can findthe text in the list$")
    public void theTableIsThere(){
        List<String> lista = list.getAllSearchResults();
        boolean textIsThere = lista.contains("Seattle, Washington");

        if (textIsThere){
            System.out.println("The text is on the list: PASSED");
        }else{
            throw new Error("The text is not in the list: FAILED!");
        }
    }
}
