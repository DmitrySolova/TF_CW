/**
 * Класс, который описывает страницу по ссылка - http://newtours.demoaut.com/mercurypurchase.php .
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

public class BookAFlightPage {

    /** ChromeDriver. */
    private WebDriver driver;

    /** поле First Name 1 пассажира. */
    @FindBy (xpath = "//input[@name='passFirst0']")
    private WebElement firstNamePass1;

    /** поле Last Name 1 пассажира. */
    @FindBy (xpath = "//input[@name='passLast0']")
    private WebElement lastNamePass1;

    /** select Meal 1 пассажира. */
    @FindBy (xpath = "//select[@name='pass.0.meal']")
    private WebElement mealPass1;

    /** поле First Name 2 пассажира. */
    @FindBy (xpath = "//input[@name='passFirst1']")
    private WebElement firstNamePass2;

    /** поле Last Name 2 пассажира. */
    @FindBy (xpath = "//input[@name='passLast1']")
    private WebElement lastNamePass2;

    /** select Meal 2 пассажира. */
    @FindBy (xpath = "//select[@name='pass.1.meal']")
    private WebElement mealPass2;

    /** поле First Name 3 пассажира. */
    @FindBy (xpath = "//input[@name='passFirst2']")
    private WebElement firstNamePass3;

    /** поле Last Name 3 пассажира. */
    @FindBy (xpath = "//input[@name='passLast2']")
    private WebElement lastNamePass3;

    /** select Meal 3 пассажира. */
    @FindBy (xpath = "//select[@name='pass.2.meal']")
    private WebElement mealPass3;

    /** select Card Type. */
    @FindBy (xpath = "//select[@name='creditCard']")
    private WebElement cardType;

    /** поле Number. */
    @FindBy (xpath = "//input[@name='creditnumber']")
    private WebElement ccNumber;

    /** select Expiration. */
    @FindBy (xpath = "//select[@name='cc_exp_dt_mn']")
    private WebElement ccExpirationMonth;

    @FindBy (xpath = "//select[@name='cc_exp_dt_yr']")
    private WebElement ccExpirationYear;

    /** поле First Name cardholder'а. */
    @FindBy (xpath = "//input[@name='cc_frst_name']")
    private WebElement ccFirstName;

    /** поле Middle Name cardholder'а. */
    @FindBy (xpath = "//input[@name='cc_mid_name']")
    private WebElement ccMiddleName;

    /** поле Last Name cardholder'а. */
    @FindBy (xpath = "//input[@name='cc_last_name']")
    private WebElement ccLastName;

    /** поле Billing Address. */
    @FindBy (xpath = "//input[@name='billAddress1']")
    private WebElement billingAddress;

    /** поле Billing City. */
    @FindBy (xpath = "//input[@name='billCity']")
    private WebElement billingCity;

    /** поле Billing State/Province. */
    @FindBy (xpath = "//input[@name='billState']")
    private WebElement billingState;

    /** поле Billing Postal Code. */
    @FindBy (xpath = "//input[@name='billZip']")
    private WebElement billingZip;

    /** поле Billing Country. */
    @FindBy (xpath = "//select[@name='billCountry']")
    private WebElement billingCountry;

    /** поле Delivery Address. */
    @FindBy (xpath = "//input[@name='delAddress1']")
    private WebElement deliveryAddress;

    /** поле Delivery City. */
    @FindBy (xpath = "//input[@name='delCity']")
    private WebElement deliveryCity;

    /** поле Delivery State/Province. */
    @FindBy (xpath = "//input[@name='delState']")
    private WebElement deliveryState;

    /** поле Delivery Postal Code. */
    @FindBy (xpath = "//input[@name='delZip']")
    private WebElement deliveryZip;

    /** поле Delivery Country. */
    @FindBy (xpath = "//select[@name='delCountry']")
    private WebElement deliveryCountry;

    /** Кнопка SECURE PURCHASE. */
    @FindBy (xpath = "//input[@name='buyFlights']")
    private WebElement buyFlightsButton;

    /** Конструктор с инициализацией PageFactory.
     * @param webDriver - ChromeDriver  */
    public BookAFlightPage(final WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    /** Очистка всех заполненный по умолчанию полей. */
    private void clearAllFields() {
        billingAddress.clear();
        billingCity.clear();
        billingState.clear();
        billingZip.clear();

        deliveryAddress.clear();
        deliveryCity.clear();
        deliveryState.clear();
        deliveryZip.clear();
    }

    /** Задаем Passengers. */
    private void setPassengers() {
        firstNamePass1.sendKeys("Angel");
        lastNamePass1.sendKeys("Hall");
        Select sMealPass1 = new Select(mealPass1);
        sMealPass1.selectByVisibleText("Diabetic");

        firstNamePass2.sendKeys("Sergio");
        lastNamePass2.sendKeys("Medina");
        Select sMealPass2 = new Select(mealPass2);
        sMealPass2.selectByVisibleText("Muslim");

        firstNamePass3.sendKeys("Olive");
        lastNamePass3.sendKeys("Strickland");
        Select sMealPass3 = new Select(mealPass3);
        sMealPass3.selectByVisibleText("Low Cholesterol");
    }

    /** Задаем Credit Card. */
    private void setCreditCard() {
        Select sCardType = new Select(cardType);
        sCardType.selectByVisibleText("Visa");

        ccNumber.sendKeys("4548024210013208");

        Select sCCExpirationMonth = new Select(ccExpirationMonth);
        sCCExpirationMonth.selectByVisibleText("04");

        Select sCCExpirationYear = new Select(ccExpirationYear);
        sCCExpirationYear.selectByVisibleText("2010");

        ccFirstName.sendKeys("Lora");
        ccMiddleName.sendKeys("Me");
        ccLastName.sendKeys("Walker");
    }

    /** Задаем Billing Address. */
    private void setBillingAddress() {
        billingAddress.sendKeys("2847 Harley Brook Lane");
        billingCity.sendKeys("Huntingdon");
        billingState.sendKeys("PA");
        billingZip.sendKeys("16652");

        Select sBillingCountry = new Select(billingCountry);
        sBillingCountry.selectByVisibleText("ALBANIA");
    }

    /** Задаем Delivery Address. */
    private void setDeliveryAddress() {
        deliveryAddress.sendKeys("3056 Woodrow Way");
        deliveryCity.sendKeys("Huntsville");
        deliveryState.sendKeys("TX");
        deliveryZip.sendKeys("77340");

        Select sDeliveryCountry = new Select(deliveryCountry);
        sDeliveryCountry.selectByVisibleText("CHINA");

        /** подтверждаем всплывающий alert. */
        driver.switchTo().alert().accept();
    }

    /** Нажимаем на кнопку. */
    private void clickOnBuyFlightsButton() {
        buyFlightsButton.click();
    }

    /** Делаем все действия на страничке. */
    public void setBookAFlight() {
        clearAllFields();
        setPassengers();
        setCreditCard();
        setBillingAddress();
        setDeliveryAddress();
        clickOnBuyFlightsButton();
    }
}
