import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    By productNameLocator=By.id("seller-group-12670553");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkprice() {
        return isDisplayed(productNameLocator);

    }
}
