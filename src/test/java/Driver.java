import io.appium.java_client.android.AndroidDriver;

public class Driver extends DriverSetup{
    protected AndroidDriver androidDriver;

    protected Driver() {
        this.androidDriver = super.getAndroidDriver();
    }
}
