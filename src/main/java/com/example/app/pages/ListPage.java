package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.example.app.drivers.AndroidDriverInit.driver;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class ListPage extends BasePageObject {

  By notificationtoastaftertap = MobileBy.xpath("/hierarchy/android.widget.Toast");

  public void swipeList() {
    TouchAction action = new TouchAction(getDriver());
    AndroidElement containerList = find(MobileBy.id("recycler_view"));
    Point coordinate = containerList.getCenter();
    PointOption start = PointOption.point(coordinate);
    PointOption end = PointOption.point(coordinate.getX(), coordinate.getY() + -1000);
    //builder
    action
        .press(start)
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
        .moveTo(end)
        .release()
        .perform();

    AndroidElement element = find(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"List ke-60\"))"));
  }

  public void LongPress(){
    TouchAction action = new TouchAction(getDriver());
//    By listke60Btn = MobileBy.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView");
    WebElement listke59btn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.TextView"));
    action.longPress(element(listke59btn))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(15)))
            .release()
            .perform()
            ;
  }

  public void TapBtnMultipleTimes(){
    TouchAction action = new TouchAction(getDriver());
    WebElement listke60Button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.TextView"));
    action.tap(TapOptions.tapOptions().withTapsCount(10)
            .withElement(ElementOption.element(listke60Button)))
            .perform()
            ;
  }

  public String notificationtoast () {
    WebDriverWait waitForToast = new WebDriverWait(driver, 25);

    waitForToast.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.Toast")));

    String toastMessage = driver.findElement((By.xpath("/hierarchy/android.widget.Toast"))).getText();

    return toastMessage;
  }
}
