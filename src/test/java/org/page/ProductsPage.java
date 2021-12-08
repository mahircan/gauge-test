package org.page;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.base.BasePage;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class ProductsPage extends BasePage {

    Random random = new Random();
    By productsPicturesLocator = By.xpath("//*/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout");

    public void scrollDownProductsPage() throws InterruptedException {
        scrollDown(537,1860,540,315);
    }

    @Step("rastgele ürün seçilir")
    public void clickRandomProduct(){                        //productsı random almak için
        List<MobileElement> womanProducts = findAll(productsPicturesLocator);
        int a = random.nextInt(womanProducts.size());
        womanProducts.get(a).click();
        logger.info("gelişi güzel bir sekilde ürün seçer");
    }

    public List<MobileElement> findAll(By locator){
        return appiumDriver.findElements(locator);

    }
}
