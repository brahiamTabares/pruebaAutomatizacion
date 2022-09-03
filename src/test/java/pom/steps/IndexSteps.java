package pom.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pom.test.pages.IndexPage;

public class IndexSteps {

    @Step("Validar cargue de la página")
    public void opens_the_search_page(IndexPage indexPage) {
        Assert.assertTrue("no se encontró el logo en el index", indexPage.logoIndex());
    }

    @Step("Validar cargue de los elementos de búsqueda")
    public void validate_some_elements(IndexPage indexPage) {
        Assert.assertTrue("No está desplegado el campo de búsqueda", indexPage.isDisplayedSomeElements());
    }

}
