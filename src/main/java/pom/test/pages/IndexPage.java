package pom.test.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage {

    @FindBy(id = "header_logo")
    private WebElement logoIndex;

    @FindBy(id = "search_query_top")
    private WebElement inputSearch;

    @FindBy(name = "submit_search")
    private WebElement buttonSubmit;

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public boolean logoIndex() {
        return existElement(logoIndex);
    }

    public boolean isDisplayedSomeElements() {
        return existElement(inputSearch) && existElement(buttonSubmit);
    }
    }