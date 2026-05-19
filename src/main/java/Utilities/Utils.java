package Utilities;

import Constants.Constant;
import DriverManager.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;

public class Utils {


    public static void loadproperty() {


        Properties property=new Properties();
        try{

            property.load(Utils.class.getResourceAsStream("/config.properties"));

        }
        catch(Exception e){
            e.printStackTrace();
        }


        Constant.URL=property.getProperty("url");
        Constant.USERNAME=property.getProperty("username");
        Constant.PASSWORD=property.getProperty("password");
        Constant.BROWSER=property.getProperty("browser");

    }


    public static String takescreenshot(WebDriver driver, String testName) throws IOException {

        String timeStamp =
                new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        String screenshotDir =
                System.getProperty("user.dir") + "/Screenshots/";

        File directory = new File(screenshotDir);

        if (!directory.exists()) {
            directory.mkdirs();
        }

        String path =
                screenshotDir + testName + "_" + timeStamp + ".png";

       File file= ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);

       FileUtils.copyFile(file,new File(path));

        System.out.println("Current Project Path : " + System.getProperty("user.dir"));

        System.out.println("Creating directory : " + screenshotDir);

        System.out.println("Directory exists : " + directory.exists());

       return path;


    }



}
