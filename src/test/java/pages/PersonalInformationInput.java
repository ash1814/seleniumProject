package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersonalInformationInput {

//    public static void genderInput(WebDriver driver){
//
//        WebElement element;
//
//        element = driver.findElement(By.cssSelector("#id_gender1"));
//        element.click();
//
//    }
    public static void firstName(WebDriver driver){

        WebElement firstName = driver.findElement(By.cssSelector("#customer_firstname"));
        firstName.sendKeys("Ashiqur");

    }
    public static void lastName(WebDriver driver){

        WebElement element;

        element = driver.findElement(By.cssSelector("#customer_lastname"));
        element.sendKeys("Rahman");

    }
    public static void passwordInput(WebDriver driver){

        WebElement element;

        element = driver.findElement(By.cssSelector("#passwd"));
        element.sendKeys("Hello@World");

    }
//    public static void birthDate(WebDriver driver){
//
//        WebElement element;
//
//        element = driver.findElement(By.cssSelector("#days"));
//        element.sendKeys("30");
//
//    }
//    public static void birthMonth(WebDriver driver){
//
//        WebElement element;
//
//        element = driver.findElement(By.cssSelector("#months"));
//        element.sendKeys("September");
//
//    }
//    public static void birthYear(WebDriver driver){
//
//        WebElement element;
//
//        element = driver.findElement(By.cssSelector("#year"));
//        element.sendKeys("1995");
//
//    }
    public static void addressFirstName(WebDriver driver){

        WebElement element;

        element = driver.findElement(By.cssSelector("#firstname"));
        element.sendKeys("Ashiqur");

    }

    public static void addressLastName(WebDriver driver){

        WebElement element;

        element = driver.findElement(By.cssSelector("#lasttname"));
        element.sendKeys("Rahman");

    }

    public static void address(WebDriver driver){

        WebElement element;

        element = driver.findElement(By.cssSelector("#address1"));
        element.sendKeys("91 Church Avenue,Brooklyn,NY");

    }
    public static void countryInput(WebDriver driver){

        WebElement element;

        element = driver.findElement(By.cssSelector("#id_country"));
        element.sendKeys("New York");



    }

    public static void cityInput(WebDriver driver){

        WebElement element;

        element = driver.findElement(By.cssSelector("#city"));
        element.sendKeys("New York");


    }
    public static void stateInput(WebDriver driver){

        WebElement element;

        element = driver.findElement(By.cssSelector("#id_state"));
        element.sendKeys("New York");



    }

    public static void postalCode(WebDriver driver){

        WebElement element;

        element = driver.findElement(By.cssSelector("#postcode"));
        element.sendKeys("11218");



    }

    public static void contactNumber(WebDriver driver){

        WebElement element;

        element = driver.findElement(By.cssSelector("#phone_mobile"));
        element.sendKeys("6463382028");



    }

    public static void referenceMail(WebDriver driver){

        WebElement element;

        element = driver.findElement(By.cssSelector("#alias"));
        element.sendKeys("ashiqdt.ar@gmail.com");



    }

    public static void clickRegister(WebDriver driver){
        WebElement element;

        element = driver.findElement(By.cssSelector("body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div:nth-child(1) form.std.box div.submit.clearfix:nth-child(4) button.btn.btn-default.button.button-medium:nth-child(4) > span:nth-child(1)"));
        element.click();
    }



}
