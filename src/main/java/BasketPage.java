import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasketPage extends BasePage {

    By itemNameLocator = new By.ByCssSelector("a.a-link-normal span.a-size-medium ");

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfItemAdded() {
        return getItems().size() > 0;
    }


    private List<WebElement> getItems() {
        return findAll(itemNameLocator);
    }
}
