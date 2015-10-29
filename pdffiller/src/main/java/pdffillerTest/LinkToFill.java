package pdffillerTest;

import imap.BeforeAfter;
import imap.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by ANS on 20/10/15.
 */


   public class LinkToFill extends BeforeAfter {





    private By firstTextField = By.xpath("//div[@class='form-group small']/input[@id='embed_text']");
    private By linkStyleLeft = By.xpath(("(//div[@class='btn-slider__left ng-binding'])[1]"));
    private By linkStyleRight = By.xpath(("(//div[@class='btn-slider__right ng-binding'])[1]"));
    private By useIcon = By.xpath("//div[@class='form-group-checkbox ltf-use-icon']//a[@class='checked']");
    private By textColorField = By.xpath("//input[@class='colorpicker-view ng-scope ng-pristine ng-valid']");
    private By textColor = By.xpath("(//div[@class='input-group-addon ng-scope']/i[@ng-style='{backgroundColor: color}'])[2]");
    private By backgroundColor = By.xpath("(//div[@class='input-group-addon ng-scope']/i[@ng-style='{backgroundColor: color}'])[3]");
    private By getBackgroundColorField = By.xpath("(//input[@ng-mousedown='mousedown($event)'])[2]");
    private By useLargeButton = By.xpath("//div[@class='form-group-checkbox make-large-btn']//a[@class='checked']");
    private By editingPermissionFull = By.xpath("(//div[@class='form-group ltf-style-link-slider']//div[@class='btn-slider__left ng-binding'])[1]");
    private By editingPermissionSignature = By.xpath("(//div[@class='form-group ltf-style-link-slider']//div[@class='btn-slider__right ng-binding'])[2]");
    private By requireEmailAddress = By.xpath("//div[label='Require email address']/a");
    private By requireName = By.xpath("//div[label='Require name']/a");
    private By notifyMeVia = By.xpath("//div[label='Notify me via email when a completed form is submitted']/a");
    private By addEmailPlaceholder = By.xpath("//div[@class='emailInputWrap']/input[@placeholder='Add Email Address']");
    private By messageSendKeys = By.xpath("//div[@class='form-group l2f__msg']/textarea[@class='form-control-textarea ng-pristine ng-valid']");
    private By privateSwitch = By.xpath("(//div[@class='btn-slider__left ng-binding'])[3]");
    private By publicSwitch = By.xpath("(//div[@class='btn-slider__right ng-binding'])[3]");
    private By yesButtonOnPopUp = By.xpath("(//div[@class='col-12 text-left']/button[@class='btn btn-sm btn--orange'])[1]");
    private By shortUrl = By.xpath("//div[@class='form-group small']/input[@id='short_url']");






    public void linkOrButtonTextSendKeys (){

        driver.findElement(firstTextField).clear();
        driver.findElement(firstTextField).sendKeys("Button Test");
    }


    public void styleLinkClick (){

        driver.findElement(linkStyleLeft).click();
    }


    public void styleButtonClick (){

        driver.findElement(linkStyleRight).click();
    }


    public void useIconClick (){

        driver.findElement(useIcon).click();
    }

    public void checkColor () throws InterruptedException {
        driver.findElement(textColor).click();
        driver.findElement(textColorField).clear();
        driver.findElement(textColorField).sendKeys("#8426cf");
        Thread.sleep(1000);
        driver.findElement(backgroundColor).click();
        driver.findElement(getBackgroundColorField).clear();
        driver.findElement(getBackgroundColorField).sendKeys("#378f55");
    }

    public void useLargeButton (){

        driver.findElement(useLargeButton).click();
    }

    public void EditingPermissionFUll() {

        driver.findElement(editingPermissionFull).click();
    }

    public void setEditingPermissionSign (){

        driver.findElement(editingPermissionSignature).click();
    }

    public void requireEmailAddressClick(){
        driver.findElement(requireEmailAddress).click();
    }

    public void requireNameClick (){
        driver.findElement(requireName).click();
    }

    public  void notifyMeViaEmailClick (){
        driver.findElement(notifyMeVia).click();
    }

    public void notifyEmailSendKeys (String email){
        driver.findElement(addEmailPlaceholder).click();
        driver.findElement(addEmailPlaceholder).sendKeys(email);
    }

    public void messageFieldSendKeys (String message){
        driver.findElement(messageSendKeys).clear();
        driver.findElement(messageSendKeys).sendKeys(message);
    }

    public void privateButton (){
        driver.findElement(privateSwitch).click();
    }

    public void puplickButton () {
        driver.findElement(publicSwitch).click();
        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {

        }
        driver.findElement(yesButtonOnPopUp).click();
        }

    public String urlGet (){

        String url = driver.findElement(shortUrl).getText();
        return url ;
    }





















}










