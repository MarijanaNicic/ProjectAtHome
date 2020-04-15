package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    private final WebDriver driver;
    private final By triggerAlertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private final By results = By.id("result");
    private final By triggerConfirmButton = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private final By triggerPromptButton = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");


    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getResult() {
        return driver.findElement(results).getText();
    }

    public void triggerAlert() {
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirm() {
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerPrompt() {
        driver.findElement(triggerPromptButton).click();
    }

    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss() {
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public void alert_setInput(String text) {
        driver.switchTo().alert().sendKeys(text);
    }


}
