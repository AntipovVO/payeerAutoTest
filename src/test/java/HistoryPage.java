import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HistoryPage extends Driver {
    public void clickGoToHistoryPage() throws InterruptedException {
        WebElement historyPage = androidDriver.findElement(By.id("com.payeer:id/page_history"));
        historyPage.click();
        Thread.sleep(2000);
    }
    public void checkingGoToHistoryPage () throws InterruptedException {
        WebElement historyPageisSelected = androidDriver.findElement(By.id("com.payeer:id/page_history"));
        if (historyPageisSelected.getAttribute("selected").equals("true")) {
            System.out.println("Тест пройден");
        }
        else {
            System.out.println("Тест провелен");
        }
        Thread.sleep(2000);
    }
}
