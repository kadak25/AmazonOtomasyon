import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_Basket extends BaseTest {

    HomePage homePage;
    ItemsPage itemsPage;
    ItemDetailsPage itemDetailsPage;
    BasketPage basketPage;

    @Test
    @Order(1)
    public void searchItem() {
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        itemsPage = new ItemsPage(driver);
        homePage.searchBar().search("Laptop");
        Assertions.assertTrue(itemsPage.isOnItemsPage(), " Not on items page !");

    }

    @Test
    @Order(2)
    public void selectItem() {
        itemDetailsPage = new ItemDetailsPage(driver);
        itemsPage.select_item(2);
        Assertions.assertTrue(itemDetailsPage.isOnItemDetailsPage(), " Not on item detail page !");

    }

    @Test
    @Order(3)
    public void addItemToBasket() {
        itemDetailsPage.addToBasket();
        Assertions.assertTrue(homePage.isItemCountUp(), "Item count did not increase");

    }

    @Test
    @Order(4)
    public void goToBasket() {
        basketPage = new BasketPage(driver);
        homePage.goBasket();
        Assertions.assertTrue(basketPage.checkIfItemAdded(), " Item was not added to basket !");

    }


}
