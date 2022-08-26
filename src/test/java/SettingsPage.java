import io.appium.java_client.MobileElement;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SettingsPage extends Driver {
    WebDriverWait wait = new WebDriverWait(androidDriver,5);
//    WebElement toolbarTitle = androidDriver.findElement(By.id("com.payeer:id/toolbar_title"));

    public void clickGoToSettingPage() {
        WebElement settingPage = androidDriver.findElement(By.id("com.payeer:id/buttonSettings"));
        settingPage.click();
//        try {
//            wait.until(ExpectedConditions.attributeContains(toolbarTitle, "elementId", "00000000-0000-05c3-ffff-ffff00000142"));
//        }
//        catch (TimeoutException exception) {
//            Assert.fail("Test is FAIL");
//        }
    }

    public void checkingGoToSetting() {
        WebElement pageTitle = androidDriver.findElement(By.id("com.payeer:id/toolbar_title"));
        String title = pageTitle.getAttribute("text");
        if (title.equals("Setting")){
            Assert.assertEquals(pageTitle.getAttribute("text"),"Settings");
        }
        if (title.equals("Настройки")){
            Assert.assertEquals(pageTitle.getAttribute("text"),"Настройки");
        } else {
            Assert.fail("Test is FAIL");
        }
    }

    public void clickEditProfile() {
        WebElement editProfile = androidDriver.findElement(By.id("com.payeer:id/container_pref_my_account"));
        editProfile.click();
//        try {
//            wait.until(ExpectedConditions.attributeContains(toolbarTitle, "elementId", "00000000-0000-05c5-ffff-ffff0000018e"));
//        }
//        catch (TimeoutException exception) {
//            Assert.fail("Test is FAIL");
//        }
    }

    public void checkingGoToAccountSetting() throws InterruptedException {
        WebElement pageTitle = androidDriver.findElement(By.id("com.payeer:id/toolbar_title"));
        if (pageTitle.getAttribute("text").equals("Account Info")|pageTitle.getAttribute("text").equals("Мой аккаунт")) {
            System.out.println("Тест пройден");
        } else {
            System.out.println("Тест провелен");
        }
        Thread.sleep(2000);
    }

    public void switchLanguage() throws InterruptedException {
        WebElement switchCurrentLanguageButton = androidDriver.findElement(By.id("com.payeer:id/pref_current_language"));
        String getLanguageName = switchCurrentLanguageButton.getAttribute("text");
        switchCurrentLanguageButton.click();
        if (getLanguageName.equals("English") | getLanguageName.equals("System language")) {
            WebElement switchToRussian = androidDriver.findElement(By.xpath("" +
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
            System.out.println("Был Английский или системный язык меняем на русский");
            switchToRussian.click();
        } else {
            WebElement switchToEnglish = androidDriver.findElement(By.xpath("" +
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
            System.out.println("Был Русский язык меняем на английский");
            switchToEnglish.click();
        }
        WebElement okButton = androidDriver.findElement(By.id("android:id/button1"));
        okButton.click();
    }

    public void switchVisualTheme() throws InterruptedException {
        WebElement switchVisualTheme = androidDriver.findElement(By.id("com.payeer:id/pref_current_theme"));
        String getVisualTheme = switchVisualTheme.getAttribute("text");
        switchVisualTheme.click();
        Thread.sleep(2000);
        WebElement switcherChooseTheme = androidDriver.findElement(By.id("com.payeer:id/switcher"));
        String getSwitcherPosition = switcherChooseTheme.getAttribute("text");
        switcherChooseTheme.click();
        Thread.sleep(2000);
        if (getSwitcherPosition.equals(androidDriver.findElement(By.id("com.payeer:id/switcher")))) {
            System.out.println("Положение свичера не изменилось");
        }
        else {
            WebElement doneButton = androidDriver.findElement(By.id("com.payeer:id/button"));
            doneButton.click();
            Thread.sleep(2000);
        }
    }
}
