import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondPage extends BasePage{

    By productNameLocator=By.id("item-info-block-576248467");

    public SecondPage(WebDriver driver) {
        super(driver);
    }



    public void selectProduct(int i) {
        click(productNameLocator);

    }
}
