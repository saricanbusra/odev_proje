import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    SearchBox searchBox;
    By cartCountLocator=new By.ByCssSelector("span.notify-user basket-item-count");
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox= new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCarCount()>0;
    }

    public void goToCart() {
        click(cartCountLocator);
    }

    private int getCarCount(){
        String count=find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }
}
