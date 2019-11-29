/**
 * Класс, который описывает логиррование на странице по ссылка - http://newtours.demoaut.com/ .
 *
 * @author Дмитрий JavaRin
 * @version 1.0 29.11.2019
 */
package com.newtoursDemoaut.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    /** ChromeDriver. */
    private WebDriver driver;

    /** поле User Name. */
    @FindBy (xpath = "//input[@name='userName']")
    private WebElement userName;

    /** поле Password. */
    @FindBy (xpath = "//input[@name='password']")
    private WebElement password;

    /** Кнопка Sing-In. */
    @FindBy (xpath = "//input[@name='login']")
    private WebElement loginButton;

    /** Конструктор с инициализацией PageFactory.
     * @param webDriver - ChromeDriver  */
    public HomePage(final WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    /** Задаем поле User Name.
     * @param str - Имя пользователя. */
    private void setUserName(final String str) {
        userName.sendKeys(str);
    }

    /** Задаем поле Password.
     * @param str - Пароль. */
    private void setPassword(final String str) {
        password.sendKeys(str);
    }

    /** Кликаем на кнопку Sing-In. */
    private void clickOnLoginButton() {
        loginButton.click();
    }

    /** Делаем все действия на страничке.
     * @param strUserName - Имя пользователя.
     * @param strPassword - Пароль. */
    public void login(final String strUserName, final String strPassword) {
        setUserName(strUserName);
        setPassword(strPassword);
        clickOnLoginButton();
    }
}
