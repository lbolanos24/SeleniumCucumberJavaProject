package steps;

import io.cucumber.java.en.*;
import pages.TestSandBox;

public class TestSandboxSteps {

    TestSandBox sandboxPage = new TestSandBox();

    @Given ("^I navigate to the sandbox page$")
    public void navigateToTheSandboxSite(){
        sandboxPage.navigateToSanbox();
    }
    
    @And("^select a value from the dropdown$")
    public void selectState(){
        sandboxPage.selectCategory("Manual");
    }
}
