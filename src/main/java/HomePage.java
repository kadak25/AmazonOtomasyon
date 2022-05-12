import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends BasePage{

    SearchBar searchBar;
    By basketCountLocator = By.id("nav-cart-count");
    By basketContainerLocator = By.id("nav-cart-count-container");
    By acceptCookiesLocator = By.id("sp-cc-accept");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBar = new SearchBar(driver);
    }

    public SearchBar searchBar() {
        return  this.searchBar;
    }

    public boolean isItemCountUp() {
        return getBasketCount() > 0;
    }

    public void goBasket() {
        click(basketContainerLocator);
    }

    private int getBasketCount(){
       String count = find(basketCountLocator).getText();
       return Integer.parseInt(count);
    }

    public void acceptCookies(){
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }
}
