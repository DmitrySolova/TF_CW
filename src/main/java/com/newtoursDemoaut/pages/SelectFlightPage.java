/**
 * Класс, который описывает страницу по ссылка - http://newtours.demoaut.com/mercuryreservation2.php .
 *
 * @author Дмитрий JavaRin
 * @version 1.0 29.11.2019
 */
package com.newtoursDemoaut.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlightPage {

    /** ChromeDriver. */
    private WebDriver driver;

    /** Radiobutton DEPART. */
    @FindBy (xpath = "((//input[contains(@name, 'outFlight')][contains(@value, 'Blue Skies Airlines')])[2])")
    private WebElement departRadio; //Blue Skies Airlines 361

    /** Radiobutton RETURN. */
    @FindBy (xpath = "//input[contains(@name, 'inFlight')][contains(@value, 'Unified Airlines')]")
    private WebElement returnRadio; //Unified Airlines 633

    /** Кнопка CONTINUE. */
    @FindBy(xpath = "//input[@name='reserveFlights']")
    private WebElement continueButton;

    /** Конструктор с инициализацией PageFactory.
     * @param webDriver - ChromeDriver  */
    public SelectFlightPage(final WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    /** Кликаем на Radiobutton DEPART. */
    private void clickOnBSA361() {
        departRadio.click();
    }

    /** Кликаем на Radiobutton RETURN. */
    private void clickOnUA633() {
        returnRadio.click();
    }

    /** Кликаем на кнопку CONTINUE. */
    private void clickOnContinueButton() {
        continueButton.click();
    }

    /** Делаем все действия на страничке. */
    public void setFlight() {
        clickOnBSA361();
        clickOnUA633();
        clickOnContinueButton();
    }

}
