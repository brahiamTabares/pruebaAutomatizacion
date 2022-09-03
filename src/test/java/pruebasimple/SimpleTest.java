package pruebasimple;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class SimpleTest {
    /**
     * Define the webdriver instance to be used for these tests
     */
    @Managed
    WebDriver driver;

    //@Test
    void searchClothes() {
        driver.get("http://automationpractice.com/");
        driver.findElement(By.id("search_query_top")).sendKeys("Blouse");
    }
}
