package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import sun.jvm.hotspot.runtime.Thread;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;

import java.util.concurrent.TimeUnit;

public class app {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/natali/driver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-save-password-bubble");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);

        open("https://dev.n7lanit.ru/");
        $(By.xpath("//div[@class='nav nav-guest']/button[@class='btn navbar-btn btn-default btn-sign-in']")).click();
        $(By.xpath("//div[@class='control-input']/input[@id='id_username']")).val("portman");
        TimeUnit.SECONDS.sleep(1);
        $(By.xpath("//div[@class='control-input']/input[@id='id_password']")).val("aznikol98").pressEnter();
        TimeUnit.SECONDS.sleep(1);
        $(By.xpath("//div[@id='user-menu-mount']//li[@class='dropdown']/a/img")).shouldBe(Condition.visible);
        TimeUnit.SECONDS.sleep(3);
        //клик по заголовку темы - кажется, что очень плохой xpath
        $$(By.xpath("//ul[@class='list-group']/li/div[@class='row thread-row']/div/div/div/a[@class='item-title thread-title']")).get(1).click();
        //клик по кнопке ответить
        TimeUnit.SECONDS.sleep(2);
        $(By.xpath("//div[@class='col-sm-4 hidden-xs']/button[@class='btn btn-primary btn-block btn-outline']")).click();
        //клик в поле ввода текста
        TimeUnit.SECONDS.sleep(2);
        $(By.xpath("//div/textarea[@id='editor-textarea']")).click();
        //ввод текста
        $(By.xpath("//div/textarea[@id='editor-textarea']")).sendKeys("Пьеса 'Как сложно быть серьезным' была " +
                "написана летом 1894 года, а опубликована в 1899 году с посвящением английскому литературному " +
                "критику Роберту Россу (1869-1918) - другу, а впоследствии и литературному душеприказчику Уайльда.");
        TimeUnit.SECONDS.sleep(2);
        //Кнопка отправки записи на сайт
        $(By.xpath("//div[@class='editor-footer']/button[@class='btn btn-primary btn-sm pull-right']")).click();
        //А тут будет задержка
        TimeUnit.SECONDS.sleep(4);
        //Проверка записи (xpath скорее всего неверный)
        $(By.xpath("(//ul[@class='posts-list ui-ready']/li[@class='post'])[last()]")).shouldBe(Condition.visible);
        //Клик по вкладке "Темы"
        $(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        //Тут нужно сделать повтор шагоd c 3-7
        //клик по заголовку темы - кажется, что очень плохой xpath
        $$(By.xpath("//ul[@class='list-group']/li/div[@class='row thread-row']/div/div/div/a[@class='item-title thread-title']")).get(4).click();
        //клик по кнопке ответить
        TimeUnit.SECONDS.sleep(2);
        $(By.xpath("//div[@class='col-sm-4 hidden-xs']/button[@class='btn btn-primary btn-block btn-outline']")).click();
        //клик в поле ввода текста
        TimeUnit.SECONDS.sleep(2);
        $(By.xpath("//div/textarea[@id='editor-textarea']")).click();
        //ввод текста
        $(By.xpath("//div/textarea[@id='editor-textarea']")).sendKeys("Правила Киргофа — соотношения, которые выполняются между токами и напряжениями на участках любой электрической цепи.\n" +
                "Решения систем линейных уравнений, составленных на основе правил Кирхгофа, позволяют найти все токи и напряжения в электрических цепях постоянного, переменного и квазистационарного тока.\n" +
                "Имеют особое значение в электротехнике из-за своей универсальности, так как пригодны для решения многих задач в теории электрических цепей и практических расчётов сложных электрических цепей.\n" +
                "Применение правил Кирхгофа к линейной электрической цепи позволяет получить систему линейных уравнений относительно токов или напряжений и, соответственно, при решении этой системы найти значения токов на всех ветвях цепи и все межузловые напряжения.\n" +
                "Сформулированы Густавом Кирхгофом в 1845 году.");
        TimeUnit.SECONDS.sleep(2);
        //Кнопка отправки записи на сайт
        $(By.xpath("//div[@class='editor-footer']/button[@class='btn btn-primary btn-sm pull-right']")).click();
        //А тут будет задержка
        TimeUnit.SECONDS.sleep(4);
        //Проверка записи (xpath скорее всего неверный)
        $(By.xpath("(//ul[@class='posts-list ui-ready']/li[@class='post'])[last()]")).shouldBe(Condition.visible);
        //Клик по вкладке "Темы"
        $(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a[1]")).click();
    }
}
