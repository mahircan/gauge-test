package org.base;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class BasePage extends BaseTest {

    Random random = new Random();


    @Step("<wait> saniye bekle")
    public void waitForsecond(int wait) throws InterruptedException {
        Thread.sleep(1000*wait);
        logger.info(wait + "saniye bekledi !!!!");
    }

    @Step("<waitLocator> elementi <waitTime> süre içinde görünmesini bekler")
    public void wait(By waitLocator, long waitTime){
        WebDriverWait wait = new WebDriverWait(appiumDriver,waitTime);
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitLocator));
        logger.info(waitLocator + " adlı elementi " + waitTime + " kadar bekledi");
    }

    @Step("<selectorid> id'li elemente tıkla")
    public void clickByid(String selectorid){
        BaseTest.appiumDriver.findElement(By.id(selectorid)).click();
        logger.info(selectorid + "Elementine tıklandır !!!");
    }

    @Step("<locator> id'li elemente <loginText> yazılır")
    public void loginSendkeys(String locator, String loginText){
        BaseTest.appiumDriver.findElement(By.id(locator)).sendKeys(loginText);
        logger.info(locator + " Elementine " + loginText + " yazar!!!");
    }

    @Step("<xpathid> xpath'li elemente tıkla")
    public void clickByxpath(String xpathid){
        BaseTest.appiumDriver.findElementByXPath(xpathid).click();
        logger.info(xpathid + " Elementine tıklandır !!!");
    }

    @Step("baslangic <x> ve <y> ve <endx> ve <endy>")
    public void scrollDown(int x, int y, int endx , int endy) throws InterruptedException {
        for (int i = 1; i < 3; i++) {
            TouchAction touchAction = new TouchAction(BaseTest.appiumDriver);
            touchAction.press(PointOption.point(x, y)).
                    moveTo(PointOption.point(endx, endy)).release().perform();
            Thread.sleep(1000);
        }
        logger.info(x+ " ve " + y +" başlangıç noktalarından " + endx + " ve " + endy + " noktalarına scrool edildi " );
    }



    @Step("<key> id'li element <keyword> text değerini içerdiğni kontrol et")
    public void textContol(String key,String keyword){
        Assert.assertFalse("Elementi içermiyor", appiumDriver.findElement(By.id(key)).getText().contains(keyword));
        logger.info(key + " id'li element ile " + keyword + " text değerini ekrana yazar");
    }

    @Step("<startKey> id'li elementin sayfada bulunup bulunmadığını kontrol et")
    public void elementIdContol(String starKey){
        Assert.assertTrue("Elementi içermiyor ", appiumDriver.findElement(By.id(starKey)).isDisplayed());
    }

    @Step("<key> xpathli'li elementin sayfada bulunup bulunmadığını kontrol et")
    public void elementXPathContol(String key){
        Assert.assertTrue("Elementi içermiyor ", appiumDriver.findElement(By.xpath(key)).isDisplayed());
    }




}
