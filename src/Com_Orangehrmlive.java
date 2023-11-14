import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Com_Orangehrmlive {

    static String browser = "Chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        //1. Setup chrome browser.
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        } else {
            System.out.println("Wrong Browser name");
        }
        //2. Open URL
        driver.get(baseUrl);

        //3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        //4. Print the current url.
        System.out.println("Get the current URL : " + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("This is the Page source" + driver.getPageSource());

        //6. Click on ‘Forgot your password?’ link.
//        WebElement forgotPw = driver.findElement(By.linkText("Forgot your password"));
//        forgotPw.click();

        //7. Print the current url.
        System.out.println(driver.getCurrentUrl());

        //8. Navigate back to the login page.
        String loginPage = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";
        driver.navigate().to(loginPage);

        //9. Refresh the page.
        driver.navigate().refresh();

        //10. Enter the email to email field

        //10. Enter the email to email field.
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("Admin");

        //11. Enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");


        //12. Click on Login Button.
        WebElement loginClick = driver.findElement(By.xpath("(//button[@type='submit'])"));
        loginClick.click();


        //13. Close the browser
        driver.quit();

    }
}