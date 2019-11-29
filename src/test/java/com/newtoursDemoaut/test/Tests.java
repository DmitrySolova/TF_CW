/**
 * Класс, который описывает тест-кейс заказа билетов с сайта - http://newtours.demoaut.com/ .
 *
 * @author Дмитрий JavaRin
 * @version 1.0 29.11.2019
 */
package com.newtoursDemoaut.test;

import com.newtoursDemoaut.pages.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import java.util.concurrent.TimeUnit;

public class Tests {

    /** Наш основной вебдрайвер - ChromeDriver. */
    private static WebDriver driver;

    /** Подготовка к тесту. */
    @BeforeClass
    public static void setUp() {

        /* Указываем путь до chromedriver. */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KingSolo\\Desktop\\chromedriver.exe");

        /* Инициализируем WebDriver. */
        WebDriver chromeDriver = new ChromeDriver();

        /* Ставим логгирование. */
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(chromeDriver);
        EventHandler handler = new EventHandler();
        eventDriver.register(handler);

        driver = eventDriver;

        /* Ставим Waiting. */
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        /* Заходим на страницу. */
        driver.get("http://newtours.demoaut.com/");
    }

    /** Тестируем тест-кейс */
    @Test
    public void Test1() {

        HomePage HomePage = new HomePage(driver);
        HomePage.login("test1", "test1");

        FlightFinderPage FlightFinderPage = new FlightFinderPage(driver);
        FlightFinderPage.setFlightFinder();

        SelectFlightPage SelectFlightPage = new SelectFlightPage(driver);
        SelectFlightPage.setFlight();

        BookAFlightPage BookAFlightPage = new BookAFlightPage(driver);
        BookAFlightPage.setBookAFlight();
    }

    /** Закрытие окна после завершения теста. */
    @AfterClass
    public static void exit() {
        driver.close();
    }
}
