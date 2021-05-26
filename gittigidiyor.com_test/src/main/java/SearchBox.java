import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

   // By searchBoxLocator=new By.ByCssSelector("sc-4995aq-0 sc-14oyvky-0 gHqOYK");
    private By searchBoxLocator=By.name("k");
   // By submitButtonLocator=new By.ByCssSelector("bttuon.qjixn8-0 sc-1bydi5r-0 hKfdXF");
   private By submitButtonLocator=By.cssSelector("button[data-cy='search-find-button']");




    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator,text);
        click(submitButtonLocator);

    }
}
