package com.e2eTests.automatedTests.achatenligne;

import com.e2eTests.automatedTests.utilis.CommonMethods;

import com.e2eTests.automatedTests.utilis.BasePage;
import com.e2eTests.automatedTests.utilis.Log;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class AchatEnLignePageObject extends BasePage {


    public AchatEnLignePageObject() throws IOException {
        PageFactory.initElements(driver, this);

    }




    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
                                                     Locators
     -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    final static String ARTICLE_TOKYO_TALKIES = "//*[contains(text(),'Tokyo Talkies')]";
    final static String COULER = "color";
    final static String TAILLE = "size";
    final static String ADD_TO_CART = "//*[normalize-space(.)='Add to cart']";
    final static String MESSAGE_SUCCES = "//*[text()=' “Tokyo Talkies” has been added to your cart.\t']";
    final static String VIEW_CART = "//*[text()='View cart']";
    final static String PRIX_PANIER = "//*[text()='Cart(1)']";
    final static String NAME_PANIER = "//td[@class='product-name']";
    final static String PROCEED_TO_CHECKOUT = "//a[@class='checkout-button button alt wc-forward']";
    final static String DETAILS_DE_LA_FACTURATION = "//h3[text()='Billing details']";
    final static String PRENOM = "billing_first_name";
    final static String NOM = "billing_last_name";
    final static String PAYS = "//input[@class='select2-search__field']";
    final static String CLICK_REGION = "select2-billing_country-container";
    final static String ADRESSE = "billing_address_1";
    final static String VILLE = "billing_city";
    final static String ETAT = "billing_state";
    final static String CODE_POSTAL = "billing_postcode";
    final static String TELEPHONE = "billing_phone";
    final static String ADRESSEMAIL = "billing_email";
    final static String CONFIRAMTION_PAIEMENT = "//input[@id='terms']";
    final static String PASSER_LA_COMMANDE = "//button[@id='place_order']";
    final static String COMMANDE_RECUE = "//p[text()='Thank you. Your order has been received.']";
    final static String SCROLE = "//*[@class='fa fa-angle-up']";

     /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
                                         @FindBy
      -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/


    @FindBy(how = How.XPATH, using = ARTICLE_TOKYO_TALKIES)
    public static WebElement articletikyotalkies;
    @FindBy(how = How.ID, using = COULER)
    public static WebElement couleur;
    @FindBy(how = How.ID, using = TAILLE)
    public static WebElement taille;
    @FindBy(how = How.XPATH, using = ADD_TO_CART)
    public static WebElement addtocard;

    @FindBy(how = How.XPATH, using = MESSAGE_SUCCES)
    public static WebElement messagesucces;
    @FindBy(how = How.XPATH, using = VIEW_CART)
    public static WebElement viewcart;
    @FindBy(how = How.XPATH, using = PRIX_PANIER)
    public static WebElement prixpanier;
    @FindBy(how = How.XPATH, using = NAME_PANIER)
    public static WebElement namepanier;
    @FindBy(how = How.XPATH, using = PROCEED_TO_CHECKOUT)
    public static WebElement proceedtocheckout;
    @FindBy(how = How.XPATH, using = DETAILS_DE_LA_FACTURATION)
    public static WebElement detailsfacturation;


    @FindBy(how = How.ID, using = PRENOM)
    public static WebElement prenom;
    @FindBy(how = How.ID, using = NOM)
    public static WebElement nom;
    @FindBy(how = How.XPATH, using = PAYS)
    public static WebElement pays;
    @FindBy(how = How.ID, using = ADRESSE)
    public static WebElement adresse;
    @FindBy(how = How.ID, using = CLICK_REGION)
    public static WebElement clickregion;
    @FindBy(how = How.ID, using = VILLE)
    public static WebElement ville;
    @FindBy(how = How.ID, using = ETAT)
    public static WebElement etat;
    @FindBy(how = How.ID, using = CODE_POSTAL)
    public static WebElement codepostale;
    @FindBy(how = How.ID, using = TELEPHONE)
    public static WebElement telephone;
    @FindBy(how = How.ID, using = ADRESSEMAIL)
    public static WebElement adressemail;
    @FindBy(how = How.XPATH, using = CONFIRAMTION_PAIEMENT)
    public static WebElement confirmationpaiement;
    @FindBy(how = How.XPATH, using = PASSER_LA_COMMANDE)
    public static WebElement passerlacommande;
    @FindBy(how = How.XPATH, using = COMMANDE_RECUE)
    public static WebElement commanderecue;
    @FindBy(how = How.XPATH, using = SCROLE)
    public static WebElement scrole;


    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
                                         @Methods
     -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/


    public void clickSurArticle() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        articletikyotalkies = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ARTICLE_TOKYO_TALKIES)));
        articletikyotalkies.click();
    }

    public void selectDropDownListByValue(WebElement couleur, String value) throws InterruptedException {
        Select dropDownList = new Select(couleur);
        dropDownList.selectByValue(value);
    }

    public void addToCard() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        addtocard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ADD_TO_CART)));
        addtocard.click();
    }

    public void assertTrue(WebElement messagesucces, String text) {
        String messageDeSuccès = AchatEnLignePageObject.messagesucces.getText();
        Assert.assertTrue(messageDeSuccès.contains(text));

    }

    public void viewCart() {
        viewcart.click();

    }

    public void assertTruePanier(WebElement prixpanier, String text) {
        String messageDeSuccès = AchatEnLignePageObject.prixpanier.getText();
        Assert.assertTrue(messageDeSuccès.contains(text));

    }

    public void assertTrueNamePanier(WebElement namepanier, String text) {
        String messageDeSuccès = AchatEnLignePageObject.namepanier.getText();
        Assert.assertTrue(messageDeSuccès.contains(text));

    }

    public void procedToCheckout() {
        proceedtocheckout.click();
    }

    public void assertTrueFacturation(WebElement detailsfacturation, String text) {
        String messageDeSuccès = AchatEnLignePageObject.detailsfacturation.getText();
        Assert.assertTrue(messageDeSuccès.contains(text));

    }

    public void waitForPageToLoad(String PageName) {
        String pageLoadStatus;
        JavascriptExecutor js;

        do {
            js = (JavascriptExecutor) driver;
            pageLoadStatus = (String) js.executeScript("return document.readyState");
            Log.info(".");
        } while (!pageLoadStatus.equals("complete"));
        Log.info(PageName + " page loaded successfully");
    }

    public void saisiDonnerFromulaire(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10) throws InterruptedException {

        prenom.sendKeys(arg1);
        nom.sendKeys(arg2);
        clickregion.click();
        pays.click();
        pays.sendKeys(arg3);
        pays.sendKeys(Keys.ENTER);
        adresse.sendKeys(arg4);
        ville.sendKeys(arg5);
        etat.sendKeys(arg6);
        codepostale.sendKeys(arg7);
        telephone.sendKeys(arg8);
        adressemail.sendKeys(arg9);
        scrole.click();
        this.waitForPageToLoad(arg10);

    }

    public void clickChecBox() throws InterruptedException {
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        confirmationpaiement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CONFIRAMTION_PAIEMENT)));
        confirmationpaiement.click();

    }

    public void valideCommande() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        passerlacommande = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PASSER_LA_COMMANDE)));
        passerlacommande.click();

    }

    public void assertTrueDetailsCommande(WebElement commanderecue, String text) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        commanderecue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(COMMANDE_RECUE)));
        String messageDeSuccès = AchatEnLignePageObject.commanderecue.getText();
        Assert.assertTrue(messageDeSuccès.contains(text));

    }

}
