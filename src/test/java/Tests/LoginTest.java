package Tests;

import BasePackage.Baseclass;
import POM.LoginPage;
import hooks.Hooks;
import org.testng.annotations.Test;

public class LoginTest extends Hooks  {

    @Test
    public void verifyLogin(){

        LoginPage.login();

    }



}
