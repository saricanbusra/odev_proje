import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Product_Test {
    WebDriver driver;

    @BeforeAll
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");    //istenilen sayfayı açtı
        driver.manage().window().maximize();            //sayfayı büyüttü
    }
  //  @AfterAll       // her şey bittikten sonra sayfayı kapattı.
  //  public  void  tearDown(){
   //     driver.quit();
    //}
}
