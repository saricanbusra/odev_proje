import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstPage extends BasePage{

   // By shippingOptionLocator=By.id("sp-price-discountPrice");
   By shippingOptionLocator=By.id("gt-category-browse-navigation-title");
    By openSecondPage = By.xpath("//div[@class='pagination']//a[text()='2']");

    public FirstPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnFirstPage() {
        return isDisplayed(shippingOptionLocator);
    }

    public void selectsecondPage() {
        driver.get("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
       // click(openSecondPage);
   }

  //  public boolean isOnSecondPage() {
    //    return isDisplayed(openSecondPage);
    //}
}
