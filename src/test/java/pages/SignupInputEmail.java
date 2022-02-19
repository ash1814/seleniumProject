package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupInputEmail {

    public static void emailInput(WebDriver driver){

        WebElement element;


        element = driver.findElement(By.cssSelector("#email_create"));
        element.sendKeys("talk2ashiq@gmail.com");

    }


    public static void clickSignup(WebDriver driver){
        WebElement element;

        element = driver.findElement(By.cssSelector("body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.row div.col-xs-12.col-sm-6:nth-child(1) form.box div.form_content.clearfix div.submit:nth-child(4) button.btn.btn-default.button.button-medium.exclusive:nth-child(2) > span:nth-child(1)"));
        element.click();
    }

}
