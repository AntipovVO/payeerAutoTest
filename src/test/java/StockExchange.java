import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class StockExchange extends Driver {

    public void clickGoToStockExchange() {
        WebElement stockExchange = androidDriver.findElement(By.id("com.payeer:id/stock_exchange"));
        stockExchange.click();
        WebDriverWait wait = new WebDriverWait(androidDriver,5);

        try {
//            У веб элемента selected = true
            wait.until(ExpectedConditions.elementToBeSelected(stockExchange));
//            Веб элемент содержит атрибут со значением
//            wait.until(ExpectedConditions.attributeContains(stockExchange, "selected", "true"));
//            В атрибуте элемента присутствует текст
//            wait.until(ExpectedConditions.textToBePresentInElementValue(stockExchange, "text"));
//            Ассерт сверяет атрибут содержит знаечение
            Assert.assertEquals(stockExchange.getAttribute("selected"),"true");
        } catch (TimeoutException exception) {
            Assert.fail("Test is FAIL");
        }
    }
}
