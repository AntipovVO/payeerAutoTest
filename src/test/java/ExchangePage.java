import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExchangePage extends Driver {
    public void clickExchangeMoney() throws InterruptedException {
        WebElement transferMoney = androidDriver.findElement(By.id("com.payeer:id/text_view_exchange"));
        transferMoney.click();
        Thread.sleep(3000);
    }
    public void clickAndInputExchangeAmount(String minUSDAmount) throws InterruptedException {
        WebElement amountInputField = androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
        amountInputField.click();
        amountInputField.sendKeys(minUSDAmount);
        androidDriver.hideKeyboard();
        Thread.sleep(3000);
    }

    public void clickPerformExchange() throws InterruptedException {
        WebElement performExchange = androidDriver.findElement(By.id("com.payeer:id/button_next_step"));
        performExchange.click();
        Thread.sleep(3000);
    }
}