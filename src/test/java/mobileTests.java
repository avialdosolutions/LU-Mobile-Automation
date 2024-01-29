import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class mobileTests {

        public static void main(String[] args) {
                //setup desired capabilities for the Android device
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a_API");
                capabilities.setCapability(MobileCapabilityType.APP, "/Users/muhammadawais/learning/apps/app-desibook-release.apk");
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

                //Create an instance of the Appium
                AppiumDriver<MobileElement> driver = null;
                try {
                        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
                } catch (MalformedURLException e) {
                        e.printStackTrace();
                }


                // Perform Actions
//                WebDriverWait wait = new WebDriverWait(driver, 30); // Adjust the timeout as needed
//                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")));

                MobileElement turnOnLocation = driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
                turnOnLocation.click();

                MobileElement closeCovidPopUp = driver.findElementByXPath("//android.webkit.WebView");
                closeCovidPopUp.click();
                //Settings Popup hide
//                MobileElement hideSettings = driver.findElementById("android:id/button1");
//                hideSettings.click();

        }
}
