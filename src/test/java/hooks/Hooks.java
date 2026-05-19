package hooks;

import Constants.Constant;
import DriverManager.DriverFactory;
import Utilities.Utils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Hooks {

    @BeforeSuite
    public void startBrowser(){

        Utils.loadproperty();

        if(DriverFactory.getDriver()==null){
         DriverFactory.browserStart();
        }

    }

//    @AfterSuite
//    public void tearDown(){
//        DriverFactory.getDriver().quit();
//    }



}
