import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
    public static WebDriver driver;
    public static void main(String[] args){
        invokeChromeBrowser();
        driver.get("http://facebook.com");
        driver.findElement(By.name("firstname")).sendKeys("Zhannat");
        driver.findElement(By.name("lastname")).sendKeys("Yerezhepova");

    }

    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zhanna\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
}
