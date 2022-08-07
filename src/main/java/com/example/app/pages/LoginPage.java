package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {

  public void inputUsername(String username) {
//    By locator = MobileBy.id("username");
//    AndroidElement tfUsername = driver.findElement(locator);
//    tfUsername.clear();
//    tfUsername.sendKeys(username);
    type(MobileBy.id("com.isl.simpleapp:id/username"), username);
  }

  public void inputPassword(String password) {
//    By locator = MobileBy.id("password"); -> menentukan locator berdasarkan apa
//    AndroidElement tfPassword = driver.findElement(locator); -> bikin object baru dari locator yg ditentukan
//    tfPassword.clear(); -> manggil object untuk clear
//    tfPassword.sendKeys(password); -> manggil object untuk input pass
    type(MobileBy.id("com.isl.simpleapp:id/password"), password);
    //function type dipanggil dari BasePageObject untuk clear & sendkeys nya
  }

  public void clickLoginBtn() {
//    By locator = MobileBy.id("login");
//    AndroidElement btnLogin = driver.findElement(locator);
//    btnLogin.click();
    click(MobileBy.id("com.isl.simpleapp:id/login"));
    //manggil function click dari BasePageObject untuk click
  }

}
