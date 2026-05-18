package POM;

import BasePackage.Baseclass;
import Constants.Constant;
import DriverManager.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.xml.sax.Locator;



public class LoginPage  {


private final static By username= By.xpath("//input[@name='username']");
private final static By password=By.xpath("//input[@name='password']");
private final static By submit=By.xpath("//button[@type='submit']");


public static void login(){

    DriverFactory.getDriver().get(Constant.URL);

    Baseclass.getBaseclassInstance().getWaits().until(ExpectedConditions.visibilityOfElementLocated(username));
    DriverFactory.getDriver().findElement(username).sendKeys(Constant.USERNAME);

    Baseclass.getBaseclassInstance().getWaits().until(ExpectedConditions.visibilityOfElementLocated(password));
    DriverFactory.getDriver().findElement(password).sendKeys(Constant.PASSWORD);

    Baseclass.getBaseclassInstance().getWaits().until(ExpectedConditions.elementToBeClickable(submit));
    DriverFactory.getDriver().findElement(submit).click();


}








}
