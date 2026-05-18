package BasePackage;


import DriverManager.DriverFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Baseclass  {

       private static Baseclass BaseclassInstance=null;

    private Baseclass(){}

    public static Baseclass getBaseclassInstance(){
        if(BaseclassInstance==null){
           BaseclassInstance=new Baseclass();
        }

        return BaseclassInstance;

    }

   private WebDriverWait wait;
   public WebDriverWait getWaits(){
      if(wait == null){
         wait = new WebDriverWait(
                 DriverFactory.getDriver(),
                 Duration.ofSeconds(10));
      }

      return wait;

   }







}