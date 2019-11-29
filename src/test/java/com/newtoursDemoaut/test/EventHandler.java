/**
 * Класс wrapper - прослушка для логгирования .
 *
 * @author Дмитрий JavaRin
 * @version 1.0 29.11.2019
 */
package com.newtoursDemoaut.test;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventHandler implements WebDriverEventListener {

    public void beforeAlertAccept(WebDriver webDriver) {
        System.out.println("[?] Ждем подтверждение Alert");
    }

    public void afterAlertAccept(WebDriver webDriver) {
        System.out.println("[+] Подтверждение Alert - OK");
    }

    public void afterAlertDismiss(WebDriver webDriver) {

    }

    public void beforeAlertDismiss(WebDriver webDriver) {

    }

    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("[?] Заходим на страницу - " + s);
    }

    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("[+] Зашли на страницу");
    }

    public void beforeNavigateBack(WebDriver webDriver) {

    }

    public void afterNavigateBack(WebDriver webDriver) {

    }

    public void beforeNavigateForward(WebDriver webDriver) {

    }

    public void afterNavigateForward(WebDriver webDriver) {

    }

    public void beforeNavigateRefresh(WebDriver webDriver) {

    }

    public void afterNavigateRefresh(WebDriver webDriver) {

    }

    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("[?] Ищем элемент - " + by);
    }

    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("[+] Нашли элемент");
    }

    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("[?] Ждем клик на элемент - " + webElement);
    }

    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("[+] Успешно кликнули на элемент - " + webElement);
    }

    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    public void beforeScript(String s, WebDriver webDriver) {

    }

    public void afterScript(String s, WebDriver webDriver) {

    }

    public void beforeSwitchToWindow(String s, WebDriver webDriver) {

    }

    public void afterSwitchToWindow(String s, WebDriver webDriver) {

    }

    public void onException(Throwable throwable, WebDriver webDriver) {

    }

    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

    }

    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

    }

    public void beforeGetText(WebElement webElement, WebDriver webDriver) {

    }

    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {

    }
}
