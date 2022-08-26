import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class BalancePage extends  Driver {
    public void clickUSDType() throws InterruptedException {
        WebElement usdBalance = androidDriver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup"));
        usdBalance.click();
        Thread.sleep(1000);
    }

    public void clickBitcoinType() throws InterruptedException {
        WebElement bitcoinBalance = androidDriver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.view.ViewGroup"));
        bitcoinBalance.click();
        Thread.sleep(1000);
    }

    public void clickTransferMoney() throws InterruptedException {
        WebElement transferMoneyButton = androidDriver.findElement(By.id("com.payeer:id/button_transfer"));
        transferMoneyButton.click();
        Thread.sleep(1000);
    }

    public void clickExchangeMoney() throws InterruptedException {
        WebElement exchangeMoneyButton = androidDriver.findElement(By.id("com.payeer:id/button_exchange"));
        exchangeMoneyButton.click();
        Thread.sleep(1000);
    }

    public void clickPayeerPaymentSystem() throws InterruptedException {
        WebElement payeerPaymentSystem = androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup"));
        payeerPaymentSystem.click();
        Thread.sleep(1000);
    }

    public void equalsPageTitle(String rusTitle, String engTitle) throws InterruptedException {

    }

    public void thisIsChoosePaymentSystemPage () throws InterruptedException {
        String hintName = androidDriver.findElement(By.id("com.payeer:id/hint")).getAttribute("text");
       if (hintName.equals("ВЫБЕРИТЕ ПЛАТЕЖНУЮ СИСТЕМУ")|hintName.equals("CHOOSE PAYMENT SYSTEM")) {
           System.out.println("Тест пройден");
       } else {
           System.out.println("Тест провален");
       }
    }

    public void thisIsBTCCurrency () throws InterruptedException {
        String currencyName = androidDriver.findElement(By.id("com.payeer:id/text_destination_account")).getAttribute("text");
        if (currencyName.equals("Bitcoin\n" +
                "BTC")) {
            clickBackButton();
            String balanceSource = androidDriver.findElement(By.id("com.payeer:id/text_balance_source")).getAttribute("text");
            if (balanceSource.equals("Payeer BTC Баланс")|balanceSource.equals("Payeer BTC Balance")) {
                System.out.println("Тест пройден");
            } else {
                System.out.println("Тест провален на 2ой проверке");
            }
        } else {
            System.out.println("Тест провален на 1ой проверке");
        }

    }

    public void clickAndInputTransferAmount(String minUSDAmount) throws InterruptedException {
        WebElement amountInputField = androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
        amountInputField.click();
        amountInputField.sendKeys(minUSDAmount);
        Thread.sleep(1000);
    }

    public void clickAndInputPayeerAccount(String payeerAccountNumber) throws InterruptedException {
        WebElement payeerAccountInputField = androidDriver.findElement(By.id("com.payeer:id/edit_account_value"));
        payeerAccountInputField.click();
        payeerAccountInputField.sendKeys(payeerAccountNumber);
        androidDriver.hideKeyboard();
        Thread.sleep(1000);
    }

    public void clickTransferButton() throws InterruptedException {
        WebElement transferButton = androidDriver.findElement(By.id("com.payeer:id/button_next_step"));
        transferButton.click();
        Thread.sleep(1000);
    }

    public void clickConfirmButton() throws InterruptedException {
        WebElement confirmButton = androidDriver.findElement(By.id("com.payeer:id/button_send_money"));
        confirmButton.click();
        Thread.sleep(1000);
    }

    public void clickCloseButton() throws InterruptedException {
        WebElement closeButton = androidDriver.findElement(By.id("com.payeer:id/button_close"));
        closeButton.click();
        Thread.sleep(1000);
    }

    public void clickBackButton() throws InterruptedException {
        WebElement backButton = androidDriver.findElement(By.id("com.payeer:id/toolbar_back_button"));
        backButton.click();
        Thread.sleep(1000);
    }

    public void clickBalanceButton() throws InterruptedException {
        WebElement balanceButton = androidDriver.findElement(By.id("com.payeer:id/page_balance"));
        balanceButton.click();
        Thread.sleep(1000);
    }

    public void balancePageisSelected() {
        WebElement accountNoText = androidDriver.findElement(By.xpath("" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]"));
        String accountNo = accountNoText.getAttribute("text");
        if (accountNo.equals("Account No.") | accountNo.equals("№ счета")) {
            System.out.println("Тест пройден");
        } else {
            System.out.println("Тест провален");
        }
    }

    public void currencyCarousel() throws InterruptedException {
        WebElement rightButtonClick = androidDriver.findElement(By.id("com.payeer:id/navigation_right_button"));
        WebElement leftButtonClick = androidDriver.findElement(By.id("com.payeer:id/navigation_left_button"));
        WebElement currentTitle = androidDriver.findElement(By.id("com.payeer:id/text_balance_source"));

        MobileElement start = (MobileElement) androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[11]/android.widget.ImageView"));
        MobileElement end = (MobileElement) androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ImageView"));

        for (int i = 1; i <= 6; i++) {
            rightButtonClick.click();
            swipeByElements(start, end);
            Thread.sleep(500);
        }
        String titleEnd = currentTitle.getAttribute("text");
        if (titleEnd.equals("Payeer TRX Balance")|titleEnd.equals("Payeer TRX Баланс")) {
            System.out.println("Первая часть теста пройдена");
        }
        //Доработать сравнение
        String titleStart = currentTitle.getAttribute("text");
        for (int i = 1; i <= 6; i++) {
            leftButtonClick.click();
            swipeByElements(end, start);
            Thread.sleep(500);
        }
        System.out.println(titleStart);
        if (titleStart.equals("Payeer USD Balance")|titleEnd.equals("Payeer USD Баланс")) {
            System.out.println("Вторая часть теста пройдена");
        } else {
            System.out.println("Тест провален");
        }
    }

    public void swipeByElements(MobileElement startElement, MobileElement endElement) throws InterruptedException {
        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);

        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);

        new TouchAction(androidDriver)
                .press(point(startX, startY))
                .waitAction(waitOptions(ofMillis(500)))
                .moveTo(point(endX, endY))
                .release().perform();
    }
}
