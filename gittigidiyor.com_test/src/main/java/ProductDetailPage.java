import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{

    By addToCartButtonLocation=By.id("sp-addbasket-button");
    By kaldir=new By.ByCssSelector("img.wis-clsbtn-96753");
    private By sonuc = By.xpath("//a[@class='control-button gg-ui-button plr10 gg-ui-btn-default']");
    By addToCartButtonLocatorr=By.id("add-to-cart-button");



    public ProductDetailPage(WebDriver driver) {

        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocation);
    }

    public void addToCart() {
        click(kaldir);//cerezi kaldirdi
        click(addToCartButtonLocation); //calısmadı
        click(sonuc);                   //calısmadı
        click(addToCartButtonLocatorr);

    }
}
