package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc1Page {
    WebDriver driver;

    // Localizador simple que se puede utilizar para verificar que la página se haya cargado
    By pageLoadedIndicator = By.xpath("//div[contains(text(),'Caso de Prueba')]");

    public tc1Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageLoaded() {
        // Verifica si el indicador de carga está presente en la página
        return driver.findElements(pageLoadedIndicator).size() > 0;
    }
}