package com.internet.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;                       // Импорт интерфейса WebDriver — это основа Selenium,через него мы управляем браузером.
import org.openqa.selenium.chrome.ChromeDriver;             // Импорт конкретной реализации WebDriver для браузера Chrome.
import java.time.Duration;                                  // Импорт класса Duration — нужен для работы со временем (таймауты).

public class TestBase {                                      // Базовый класс для всех тестов, от него наследуются тестовые классы.

    protected WebDriver driver;                                        // Объявляем переменную driver типа WebDriver, будет хранить наш браузер.

    @BeforeEach                                              // метод с @BeforeEach выполняется перед КАЖДЫМ тестом.
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();                         // Создаём новый экземпляр ChromeDriver.В этот момент реально открывается браузер Chrome.
        driver.get("https://the-internet.herokuapp.com/");   // Открываем сайт по указанному URL.
        driver.manage().window().maximize();                 // Разворачиваем окно браузера на весь экран.
        driver.manage().timeouts()                           // Устанавливаем неявное ожидание (implicit wait).
                .implicitlyWait(Duration.ofSeconds(20));     // Selenium будет ждать до 20 секунд,если элемент не найден сразу.
    }

    //    @AfterEach                                         // метод будет выполняться ПОСЛЕ каждого теста.
    //    public void tearDown() {
    //        if (driver != null) {
    //            driver.quit();                             // Закрываем браузер и завершаем сессию WebDriver.
    //        }
    //    }
}