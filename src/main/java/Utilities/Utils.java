package Utilities;

import Constants.Constant;

import java.util.Properties;

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



}
