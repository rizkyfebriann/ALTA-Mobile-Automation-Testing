package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class ListPageSteps extends BaseTest {

  @And("user do scroll")
  public void userDoScroll() {
    listPage.swipeList();
  }

  @Given("user see list ke{int} button")
  public void userSeeListKeButton(int listke59) {
    //sudah terbackup dg function scroll ke list ke-60
  }

  @And("user press list ke{int} button for few seconds")
  public void userPressListKeButtonForFewSeconds(int listke59) {
    listPage.LongPress();
  }

  @Then("list ke{int} button must be pressed")
  public void listKeButtonMustBePressed(int listke59) {
    //belum tau cara assert beda warna tombol ketika ditekan
  }

  @And("user tap multiple times on list ke{int} button")
  public void userTapMultipleTimesOnListKeButton(int listke59) {
    listPage.TapBtnMultipleTimes();
  }

  @Then("user see notification list ke{int} on bottom")
  public void userSeeNotificationListKeOnBottom(int nomorlist) {
    String notifToast = "List ke" + nomorlist;
    Assertions.assertEquals(notifToast, listPage.notificationtoast());;
  }
}
