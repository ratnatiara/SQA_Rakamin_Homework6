package saucedemo.cucumber.stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
    WebDriver driver;
    String baseURL = "https://www.saucedemo.com/";

    @Given("Halaman Login saucedemo")
    public void halamanLoginSaucedemo(){
        driver = new ChromeDriver();
        driver.get(baseURL);

        //Assertion
        String loginPageAssert = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).getText();
        Assert.assertEquals(loginPageAssert, "Swag Labs");
        
    }
    @When("input username")

    

    @And ("input password")



    @And("User menekan tombol login")

    
    @Then("User sukses login dan redirect ke halaman utama")
    
}
