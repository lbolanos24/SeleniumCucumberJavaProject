package pages;

import java.nio.file.NotLinkException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

public class ListPage extends BasePage{
    
    private String searchField = "//li[normalize-space()='Filter for a city']";//"//body/form[1]/input[1]";
    private String SearchResults = "name";
       
    public ListPage(){
        super(driver);
    }

    public void navigateToListPage() throws NotLinkException{
        navigateTo("https://codepen.io/lindakovacs/full/gZBWPe");
    }//-    https://andreidbr.github.oi/JS30/06AjaxTypeAhead/index.html

    public void enterSearchCriteria(String state) throws InterruptedException{
        try{
            Thread.sleep(600);
            write(searchField, state);
        }catch(NoSuchElementException e){
            System.out.println("The WebElement Search Field couldn't be found");
            e.printStackTrace();
        }
    }

    public List<String> getAllSearchResults(){
        List<WebElement> list = bringMeAllElements(SearchResults);
        List<String> stringsFromList = new ArrayList<String>();
        for(WebElement e:list){
            stringsFromList.add(e.getText());
        }
        return stringsFromList;
    }
}
