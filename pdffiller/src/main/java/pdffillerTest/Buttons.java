package pdffillerTest;

/**
 * Created by ANS on 29/07/15.
 */
public class Buttons {

    public static String SearchDocument = "//td[@class='search_document']";
    public static String Field4Search = "//div [@class='body_search']//input[@class = 'input_uploader search_uploader ui-autocomplete-input']"; // Поле для ввода запроса поиска
    public static String Search = "//div [@class='body_search']//a[text()='Search']";//public static String FillOnline = "//a[text()='Fillable Form W-9 (Rev. December 2014)'] "; FOR LIFE
    public static String FillOnline = "/html[@class=' googleChrome googleChrome']/body/div[@id='body-content-wrapper']/div[@class='wrap-inner']/div[@class='wrap']/div[@class='content-pad']/div[@id='search_web_1']/div[@id='uploader']/div[@id='body_uploader']/div[@class='body_search']/div[@id='search_main_1']/div[@id='search_results']/div[@class='item'][1]/div[@class='descr']/table/tbody/tr/td[@class='btn-wrapper']/a[@class='btn-red btn-fill']/div[@class='icon-bedit']";
    public static String FillOnline2 = "//a[text()='Fillable Form W-9'] ";
    public static String LinkEditorWait = "/project/";
    public static String LinkEditorTest = "https://www.pdffiller.com/en/export/choice.htm";
    public static String LinkChoiceWait = "choice";
    public static String EmailSmsButton = "//a/span[text()='Email / SMS'] ";
    public static String LoginPage = "https://denise.pdffiller.com/en/login.htm";
    public static String myAccount = ".//a [text()='My Account']";
    public static String AccountInformation = ".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]";
    public static String SendWithEmailSMS = "//div [@class='send-preferences radio-list']/label[text()='Send with Email/SMS']";
    public static String SaveMyAccoun = "//tr/td //a [@id = 'btn_saveSendPreferences']";
    public static String MyForms = "//div [@id = 'body-content-wrapper']//a[text()= 'My Forms']";
    public static String EmailSms_MyForms = "//div [@class='sngl-btn icon_mail']/div";
    public static String FieldEmailTo = "//div [@class='export__form-control__container']/input[@name='email_to']";
    public static String SendTo = "//div [@class='export-header__btn-container'] //span [text()='Send Email']";
    public static String dev28 = "https://root:letmein@dev28.pdffiller.com/en/login.htm";
    public static String GoToMyForms_popup = "//div//a [@href='/en/forms.htm?target=outbox_email']";
    public static String checkMark = "//td[@class='brd select contein_label']/div /input[@formid='100109021'] ";
    public static String customBranding = "//td [@class= 'support-list-box brd-right td']/img [@alt='Custom<br/>Branding']";
    public static String addNewForm = "//div[@class = 'add_new_forms_text']";
    public static String uploadCustomBranding = "//div[@class = 'browse_area upload_logo_email']//input[@name='file']";
    public static String deleteAccount = ".//div [@class='p1'] /a";
    public static String cancelSubscription = "//a [@href='/en/account/?op=cancel_bt']";
    public static String noThanksDev = "//a [@href='/en/payment/subscription_cancel.htm?v=interview']";
    public static String yesDeletesLife = "(//article [@class='delete-account-btns']//a[@class='btn -light-gray'])[2]";
    public static String cancelSubscrLinkLife = "//a [@href='/en/account/?op=payment_options']";
    public static String forgotPass = "//div [@class = 'login-offset2']/a";
    public static String registerButton = "//div//a[@class= 'btn-gray btns1']";
    public static String cusBrandTextLine = "//div[@class='row_branding_form row_text_line']/input[@class='input_branding']";
    public static String cusBrandFirstName = "(//div[@class='row_branding_form row_f_l_name']/input[@class='input_branding small_input'])[1]";
    public static String cusBrandLastName = "(//div[@class='row_branding_form row_f_l_name']/input[@class='input_branding small_input'])[2]";
    public static String cusBrandTitle = "(//div[@class='row_branding_form row_title_company']/input[@class='input_branding small_input'])[1]";
    public static String custBrandCompany = "(//div[@class='row_branding_form row_title_company']//input[@class='input_branding small_input'])[2]";
    public static String custBrandPhone = "//div[@class='row_branding_form row_phone']/input[@class='input_branding']";
    public static String custBrandFax = "//div[@class='row_branding_form row_fax']/input[@class='input_branding']";
    public static String custBrandDone = "//div[text()='Done']";
    public static String custBrandSendTestEmail = "//div[text()='Send test Email']";

}
