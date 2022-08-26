import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverSetup {
    private DesiredCapabilities testEnvironment = new DesiredCapabilities();
    private static AndroidDriver androidDriver;
    private String testURL = "http://127.0.0.1:4723/wd/hub";

    public void initialAndroidDriver() throws MalformedURLException {
        testEnvironment = new DesiredCapabilities();
        testEnvironment.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        testEnvironment.setCapability("platformName", "Android");
        testEnvironment.setCapability("appium:platformVersion", "10");
        testEnvironment.setCapability("appium:appPackage", "com.payeer");
        testEnvironment.setCapability("appium:appActivity", ".SplashActivity");
        testEnvironment.setCapability("appium:noReset", true);
        androidDriver = new AndroidDriver(new URL(testURL), testEnvironment);
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public AndroidDriver getAndroidDriver() {
        return androidDriver;
    }

    @BeforeClass
    public void setUp() throws MalformedURLException {
        initialAndroidDriver();
    }
    @AfterClass
    public void driverTearDown() {
        androidDriver.quit();
    }
}
