import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_gittigidiyor extends Product_Test{

    HomePage homePage;
    FirstPage firstPage;
    SecondPage secondPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;


    @Test
    @Order(1)
    public void search_product(){       //ürünü ara
        homePage=new HomePage(driver);
        firstPage=new FirstPage(driver);
        homePage.searchBox().search("bilgisayar");
        Assertions.assertTrue(firstPage.isOnFirstPage(),
                "Yanlıs sayfada>");
    }

    @Test
    @Order(2)


    public void second_search_product(){       //2. sayfada ürünü ara
        secondPage=new SecondPage(driver);
       firstPage.selectsecondPage();
      //  Assertions.assertTrue(firstPage.isOnSecondPage(),
        //    "İkinci sayfa açılmadı>");
    }
    @Test
    @Order(3)
    public void select_product(){       // ürünü seç
        productDetailPage=new ProductDetailPage(driver);
        secondPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
            "Ürün seçilmedi");
    }


    @Test
    @Order(4)
    public void add_product_to_cart(){          //ürünü sepete ekle
        productDetailPage.addToCart();
       Assertions.assertTrue(homePage.isProductCountUp(),
            "ürün sepete eklenmemiş");
    }


    @Test
    @Order(5)
    public void go_to_cart(){           //sepete git
        cartPage =new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkprice(),
            "Fiyatı aynı değil!"); //fiyatlar aynı mı diye kontrol edecek

    }


}
