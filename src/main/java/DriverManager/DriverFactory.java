package DriverManager;

import Constants.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
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
            //WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
            driver.manage().window().maximize();
        }else if(Constant.BROWSER.equals("edge")){
           // WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
            driver.manage().window().maximize();
        }else{
           // WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }




}
