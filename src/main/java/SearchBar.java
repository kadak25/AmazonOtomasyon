import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBar extends BasePage{

    By searchBarLocator = By.id("twotabsearchtextbox");
    By submitButtonLocator = By.id("nav-search-submit-button");


    public SearchBar(WebDriver driver) {
        super(driver);
    }

    public void  search(String text) {
            type(searchBarLocator,text);
            click(submitButtonLocator);
    }

}
