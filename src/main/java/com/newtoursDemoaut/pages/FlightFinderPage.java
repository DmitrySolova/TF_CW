/**
 * Класс, который описывает страницу по ссылка - http://newtours.demoaut.com/mercuryreservation.php .
 *
 * @author Дмитрий JavaRin
 * @version 1.0 29.11.2019
 */
package com.newtoursDemoaut.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinderPage {

    /** ChromeDriver. */
    private WebDriver driver;

    /** Radiobutton Type. */
    @FindBy (xpath = "//body//b//input[2]")
    private WebElement typeOneWay;

    /** select Passengers. */
    @FindBy (xpath = "//select[@name='passCount']")
    private WebElement passengersWE;

    /** select Departing From. */
    @FindBy (xpath = "//select[@name='fromPort']")
    private WebElement departingFromWE;

    /** select On. */
    @FindBy (xpath = "//select[@name='fromMonth']")
    private WebElement departingMonthWE;


    @FindBy (xpath = "//select[@name='fromDay']")
    private WebElement departingDayWE;

    /** select Arriving In. */
    @FindBy (xpath = "//select[@name='toPort']")
    private WebElement arrivingInWE;

    /** select Returning. */
    @FindBy (xpath = "//select[@name='toMonth']")
    private WebElement returningMonthWE;

    @FindBy (xpath = "//select[@name='toDay']")
    private WebElement returningDayWE;

    /** Radiobutton Service Class. */
    @FindBy (xpath = "//input[@value='First']")
    private WebElement serviceClassFirst;

    /** select Airline. */
    @FindBy (xpath = "//select[@name='airline']")
    private WebElement airlineWE;

    /** Кнопка CONTINUE. */
    @FindBy (xpath = "//input[@name='findFlights']")
    private WebElement continueButton;

    /** Конструктор с инициализацией PageFactory.
     * @param webDriver - ChromeDriver  */
    public FlightFinderPage(final WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    /** Преобразуем все нужные select'ы и задаем их. */
    private void selectOnAllSelects() {
        Select passengers = new Select(passengersWE);
        Select departingFrom = new Select(departingFromWE);
        Select departingMonth = new Select(departingMonthWE);
        Select departingDay = new Select(departingDayWE);
        Select arrivingIn = new Select(arrivingInWE);
        Select returningMonth = new Select(returningMonthWE);
        Select returningDay = new Select(returningDayWE);
        Select airline = new Select(airlineWE);

        passengers.selectByVisibleText("3");
        departingFrom.selectByVisibleText("New York");
        departingMonth.selectByVisibleText("May");
        departingDay.selectByVisibleText("9");
        arrivingIn.selectByVisibleText("New York");
        returningMonth.selectByVisibleText("June");
        returningDay.selectByVisibleText("22");
        airline.selectByVisibleText("Blue Skies Airlines");
    }

    /** Кликаем на Radiobutton typeOneWay. */
    private void clickOnTypeOneWay() {
        typeOneWay.click();
    }

    /** Кликаем на Radiobutton serviceClassFirst. */
    private void clickOnServiceClassFirst() {
        serviceClassFirst.click();
    }

    /** Кликаем на кнопку CONTINUE. */
    private void clickOnContinueButton() {
        continueButton.click();
    }

    /** Делаем все действия на страничке. */
    public void setFlightFinder() {
        clickOnTypeOneWay();
        selectOnAllSelects();
        clickOnServiceClassFirst();
        clickOnContinueButton();
    }
}
