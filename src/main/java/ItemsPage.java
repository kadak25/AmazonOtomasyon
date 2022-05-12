import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ItemsPage extends  BasePage{

    By freeShippingLocator = By.id("p_n_free_shipping_eligible-title");
    By itemsNameLocator = new By.ByCssSelector("span.a-size-base-plus");

    public ItemsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnItemsPage() {
        return isDisplayed(freeShippingLocator);
    }

    public void select_item(int i) {
        getAllItems().get(i).click();
    }


    private List<WebElement> getAllItems(){
        return  findAll(itemsNameLocator);
    }
}
