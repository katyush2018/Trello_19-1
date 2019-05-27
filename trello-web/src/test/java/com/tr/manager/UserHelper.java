package com.tr.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class UserHelper  extends HelperBase{
  public UserHelper(WebDriver wd) {
    super(wd);
  }

  public void clickOnAvatar() {
    click(By.cssSelector("[class=member]"));
    }

  public void clickProfileFromDropDown() {
    click(By.cssSelector("a.js-profile"));
  }


  public void clickChangePhoto() {
    WebElement profileAvatar = waitForElement(10, wd.findElement(By.cssSelector(".profile-image-initials")));
    WebElement changePic =  wd.findElement(By.cssSelector(".profile-image-change-text"));
    new Actions(wd).moveToElement(profileAvatar).pause(5).click(changePic).perform();

  }

    public void attachPicture(File file) {
    attach(By.cssSelector(".js-upload-avatar"), file);
    }
}
