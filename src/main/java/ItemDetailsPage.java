import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemDetailsPage extends BasePage{

    By addBasketButtonLocator = By.id("add-to-cart-button");


    public ItemDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnItemDetailsPage() {
        return  isDisplayed(addBasketButtonLocator);
    }

    public void addToBasket() {
        click(addBasketButtonLocator);
    }
}
