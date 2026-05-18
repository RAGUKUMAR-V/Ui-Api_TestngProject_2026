package DriverManager;

import Constants.Constant;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

//    private static DriverFactory driverfactoryInstance=null;
//
//    private DriverFactory(){}
//
//    public static DriverFactory getDriverFactoryInstance(){
//        if(driverfactoryInstance==null){
//            driverfactoryInstance=new DriverFactory();
//        }
//
//        return driverfactoryInstance;
//
//    }



    private static WebDriver driver =null;

    public static void browserStart(){

        if(Constant.BROWSER.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
        }else if(Constant.BROWSER.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }else{
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }




}
