package modules

import geb.Module
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

abstract class AbstractModule extends Module {

    protected void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) browser.driver
        js.executeScript("arguments[0].scrollIntoView(true);", element)
    }
}
