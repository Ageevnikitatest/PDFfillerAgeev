package courseJava.interFace;


import courseJava.InterFace;
import courseJava.User;
import imap.BeforeAfter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;



public class RegForm5 extends BeforeAfter implements InterFace {



    public RegForm5(WebDriver driver){
        this.driver = driver;
    }


    private By maleBtn = By.cssSelector("label[for='iam-boy']");
    private By femaleBtn = By.cssSelector("label[for='iam-girl']");

    private By searchMaleBtn = By.cssSelector("label[for='find-boy']");
    private By searchFemaleBtn = By.cssSelector("label[for='find-girl']");

    private By nameFld = By.id("user-reg-myname");
    private By emailFld = By.id("user-reg-myemail");
    private By passwordFld = By.id("user-reg-mypass");

    private By submitBtn = By.cssSelector("#block-last[style='display: block;'] .submit");


    private By nextBtn = By.cssSelector("#block-first .submit");

    @Step
    public void clickNextButton(){ driver.findElement(nextBtn).click();
    }

    @Step
    @Override
    public void selectGender(char gender) {
        if(gender == 'm'){
            driver.findElement(maleBtn).click();
        } else if(gender == 'f'){
            driver.findElement(femaleBtn).click();
        }
    }

    @Step
    @Override
    public void selectSearchGender(char searchGender) {

    }

    @Step
    @Override
    public void typeName(String name) {
        driver.findElement(nameFld).clear();
        driver.findElement(nameFld).sendKeys(name);
    }

    @Step
    @Override
    public void typeEmail(String email) {
        driver.findElement(emailFld).clear();
        driver.findElement(emailFld).sendKeys(email);
    }

    @Step
    @Override
    public void typePassword(String password) {
        driver.findElement(passwordFld).clear();
        driver.findElement(passwordFld).sendKeys(password);

    }

    @Override
    public void clickSumbit() {
            driver.findElement(submitBtn).click();
        }




    @Step
    @Override
    public void registerNewUser(User user) {

        selectGender(user.gender);
        typeName(user.name);
        clickNextButton();
        driver.findElement(submitBtn).isDisplayed();
        typeEmail(user.email);
        typePassword(user.password);
        clickSumbit();

    }
}
