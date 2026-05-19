package Tests;

import POM.DashboardPage;
import POM.LoginPage;
import Retry.RetryAnalyser;
import hooks.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Hooks  {

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void verifyLogin(){

        LoginPage.login();
        Assert.assertEquals(DashboardPage.verifyDashboardHeader(),"Dashboard1");


    }



}
