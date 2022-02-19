package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



class CreateAccountTest {

        //Declaring all the variables
        private static WebDriver driver;

        @BeforeTest
        public static void setUpDriver() {
            //Setting up the WebDriver
            WebDriverManager.chromedriver().setup();

            //For this test, we will be using Google Chrome browser
            driver = new ChromeDriver();

            //Maximizing the browser window
            driver.manage().window().maximize();

        }


        @Test
        public static void TestSignup() throws InterruptedException{
            driver.get("http://automationpractice.com/index.php");


            NavigateSignInButtonHomepage.clickSignInButton(driver);


            Thread.sleep (2000);

            SignupInputEmail.emailInput(driver);


            SignupInputEmail.clickSignup(driver);

            PersonalInformationInput.firstName(driver);

            PersonalInformationInput.lastName(driver);

            PersonalInformationInput.passwordInput(driver);

            PersonalInformationInput.addressFirstName(driver);

            PersonalInformationInput.addressLastName(driver);

            PersonalInformationInput.address(driver);

            PersonalInformationInput.countryInput(driver);

            PersonalInformationInput.cityInput(driver);

            PersonalInformationInput.stateInput(driver);

            PersonalInformationInput.postalCode(driver);

            PersonalInformationInput.contactNumber(driver);

            PersonalInformationInput.referenceMail(driver);

            PersonalInformationInput.clickRegister(driver);













        }





    }
