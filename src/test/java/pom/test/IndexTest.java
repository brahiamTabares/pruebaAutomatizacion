package pom.test;


import org.junit.jupiter.api.Test;
import pom.test.pages.IndexPage;
import pom.steps.IndexSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)

public class IndexTest {
    IndexPage indexPage;
    @Managed
    WebDriver driver;
    @Steps
    public IndexSteps indexSteps;
    @Test
    void validateIndexElements(){
        driver.get("http://automationpractice.com/");
        indexPage = new IndexPage(driver);
        indexSteps.opens_the_search_page(indexPage);
        indexSteps.validate_some_elements(indexPage);
    }
}
