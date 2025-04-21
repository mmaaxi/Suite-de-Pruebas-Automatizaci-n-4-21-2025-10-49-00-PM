package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.tc1Page;
import org.junit.Assert;

public class tc1Steps {
    WebDriver driver = new ChromeDriver();
    tc1Page googleSheetsPage;

    @Given("^el usuario abre el navegador en la URL del Google Sheets$")
    public void abrirURLGoogleSheets() {
        // Actualiza con la URL real del Google Sheets
        driver.get("https://example.com/google-sheets-url");
        googleSheetsPage = new tc1Page(driver);
    }

    @Then("^la plantilla de Google Sheets se carga correctamente y muestra los casos de prueba$")
    public void verificarCargaGoogleSheets() {
        Assert.assertTrue("La plantilla de Google Sheets no se cargó correctamente.", googleSheetsPage.isPageLoaded());
        driver.quit();
    }
}