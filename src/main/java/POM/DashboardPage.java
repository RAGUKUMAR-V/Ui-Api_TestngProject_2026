package POM;

import BasePackage.Baseclass;
import DriverManager.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage {


    private final static By dashboardheader= By.xpath("//h6[text()='Dashboard']");


    public static String verifyDashboardHeader(){

        Baseclass.getBaseclassInstance().getWaits()
                .until(ExpectedConditions.visibilityOfElementLocated(dashboardheader));
        return DriverFactory.getDriver().findElement(dashboardheader).getText();

    }

}




