package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.Keys.ENTER;

public class NavigateSignInButtonHomepage {



    public static void clickSignInButton(WebDriver driver){

        WebElement element;


       element = driver.findElement(By.cssSelector("body.index.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.nav:nth-child(2) div.container div.row nav:nth-child(1) div.header_user_info:nth-child(1) > a.login"));
        element.sendKeys(ENTER);
    }


}
