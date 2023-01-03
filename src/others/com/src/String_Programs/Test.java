package others.com.src.String_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();


        System.setProperty("webdriver.chrome.driver", "src/String_Programs/chromedriver.exe");
        driver.get("https://www.makemytrip.com/flight/traveller/?itineraryId=a30d4bd55c00f472972c05c99073c60b31cb95ee&crId=73f04477-b5d3-4d7f-841e-324e865bfc13&cur=INR");
        driver.findElement(By.linkText("+ ADD INFANT")).click();


    }

}
