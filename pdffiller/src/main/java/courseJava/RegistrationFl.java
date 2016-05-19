package courseJava;
import imap.BeforeAfter;
import imap.Listener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;


/**
 * Created by ANS on 24/03/16.
 */

@Listeners({Listener.class})
@Features({"RegistrationFl"})   // для  построения отчета с помощью фреймворка  Allure

public class RegistrationFl  extends BeforeAfter {


    @Stories({"RegistrationFl"}) // для  построения отчета с помощью фреймворка  Allure



    @Test

    @Parameters({"Gender"})

    public static void registr (@Optional("Man") String gender){  // Задать параметр Girl  or  Man


        // Использование TimeStamp для генерации каждый раз нового имейла
        long timestamp = System.currentTimeMillis();

        // Параметры девушек
        String linkAddress = "https://flirchi.com/sign/inter?fr=1&p=1232";
        String girlLadiesButton = "//div[@class='inter-select']//a[@data-next='slide-02-f']";
        String girlBlondiesButton= "//div[@class='inter-select-item right']//a[@data-next='slide-03-f']";
        String girlEyesButton = "//div[@class='inter-select-item right']//a[@data-next='slide-04-f']";
        String girlSlimButton = "//div[@class='inter-select-item right']//img[@src='https://static.phts.io/main/images/landing/landing-inter/ru/4-female-thin.jpg']";
        // не очень хороший xpath по ссылке , но во избежания жудких костылей

        // Параметры для регистрации
        String nameField = "//div[@class='land-form-row']/input[@name='name']";
        String emailField = "//div[@class='land-form-row']/input[@name='email']";
        String registerButton = "//div[@class='land-form-row']/button[@data-test='qa-sign']";
        String profName = "//div[@class='prof-info']/h3[@class='prof-name']";


        // for Man
        String nameMan = "Сергей";
        String emailMan = "blabla+" + timestamp + "@bla.com";
        String ageFieldMan = "//div[@class='form-col']//option[@value='25']";

        // for Girl
        String nameGirl = "Кира";
        String emailGirl = "Kira2211+" + timestamp + "@frfr.com";
        String ageFieldGirl = "//div[@class='form-col']//option[@value='21']";


        // Переход по ссылке
        driver.get(linkAddress);



        // Параметры девушек
        driver.findElement(By.xpath(girlLadiesButton)).click();
        driver.findElement(By.xpath(girlBlondiesButton)).click();
        driver.findElement(By.xpath(girlEyesButton)).click();
        driver.findElement(By.xpath(girlSlimButton)).click();

        // Ожидание элемента
        waitElement(nameField,5);

        // Проверяется параметр, кем будет произведена регистрация
        if(gender.equalsIgnoreCase("Man")) {


            driver.findElement(By.xpath(nameField)).clear();
            driver.findElement(By.xpath(nameField)).sendKeys(nameMan);
            driver.findElement(By.xpath(emailField)).clear();
            driver.findElement(By.xpath(emailField)).sendKeys(emailMan);
            driver.findElement(By.xpath(ageFieldMan)).click();
            driver.findElement(By.xpath(registerButton)).click();
        }

        // Проверяется параметр, кем будет произведена регистрация
        if(gender.equalsIgnoreCase("Girl")) {

            driver.findElement(By.xpath(nameField)).clear();
            driver.findElement(By.xpath(nameField)).sendKeys(nameGirl);
            driver.findElement(By.xpath(emailField)).clear();
            driver.findElement(By.xpath(emailField)).sendKeys(emailGirl);
            driver.findElement(By.xpath(ageFieldGirl)).click();
            driver.findElement(By.xpath(registerButton)).click();

        }

        // Проверка на отображение элемента после регистрации
        if (driver.findElement(By.xpath(profName)).isDisplayed()){
            System.out.println("Вход произведен успешно"+ "\n");
        }

        else {
            System.out.println("Вход не произведен. Ошибка"+ "\n");
        }
    }


        // Метод для ожидания элемента на странице
    public static WebElement waitElement (String xpath, int timeOut) {

        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

        return element;
    }
}
