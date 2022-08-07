package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {

  By dropdownBtn = MobileBy.id("com.isl.simpleapp:id/spinner_1");
  By multiplyOperator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
  By dividerOperator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
  By subtractionOperator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
  By firstNumberField = MobileBy.id("com.isl.simpleapp:id/et_1");
  By secondNumberField = MobileBy.id("com.isl.simpleapp:id/et_2");
  By btnEqual = MobileBy.id("com.isl.simpleapp:id/acb_calculate");
  By calcResult = MobileBy.id("com.isl.simpleapp:id/tv_result");

  public String getTitle() {
//    By locator = MobileBy.xpath(
//        "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
//    AndroidElement labelTitle = driver.findElement(locator);
//    return labelTitle.getText();
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }

  public boolean checkHamburgerBtnAppear() {
//    By locator = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement hamburgerBtn = driver.findElement(locator);
//    return hamburgerBtn.isDisplayed();

    //explicit wait
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

  public void ChangeOperatorToMultiply () {
    click(dropdownBtn);
    click(multiplyOperator);
  }

  public void ChangeOperatorToDivider () {
    click(dropdownBtn);
    click(dividerOperator);
  }

  public void ChangeOperatorToSubtraction () {
    click(dropdownBtn);
    click(subtractionOperator);
  }

  public void inputFirstNumber (String firstNumber) {
    type(firstNumberField, firstNumber);
  }

  public void inputSecondNumber (String secondNumber) {
    type(secondNumberField, secondNumber);
  }

  public void clickEqualBtn () {
    click(btnEqual);
  }

  public String resultIs () {
    return getText(calcResult);
  }

}
