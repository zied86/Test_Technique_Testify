package com.e2eTests.automatedTests.achatenligne;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class AchatEnLigeStepDefinitions {

    private AchatEnLignePageObject achat;

    public AchatEnLigeStepDefinitions() throws IOException {
        this.achat = new AchatEnLignePageObject();
    }


    @When("^Je selectionner l'article$")
    public void jeSelectionnerLArticle() throws Throwable {
        achat.clickSurArticle();
    }

    @When("^Je choisis une option de couleur\"([^\"]*)\"et une option taille \"([^\"]*)\"$")
    public void jeChoisisUneOptionDeCouleurEtUneOptionTaille(String arg1, String arg2) throws Throwable {
        achat.selectDropDownListByValue(AchatEnLignePageObject.couleur, arg1);
        achat.selectDropDownListByValue(AchatEnLignePageObject.taille, arg2);
    }

    @When("^Je clique sur le bouton ADD TO CART$")
    public void jeCliqueSurLeBoutonADDTOCART() throws Throwable {
        achat.addToCard();
    }

    @When("^Je vérifie l'affichage de message de succès \"([^\"]*)\"$")
    public void jeVérifieLAffichageDeMessageDeSuccès(String text) throws Throwable {
        achat.assertTrue(AchatEnLignePageObject.messagesucces, text);
    }

    @When("^Je clique sur le bouton Wiew cart$")
    public void jeCliqueSurLeBoutonWiewCart() throws Throwable {
        achat.viewCart();
    }

    @When("^Je vérifie l'ajout de larticle dans le panier \"([^\"]*)\"$")
    public void jeVérifieLAjoutDeLarticleDansLePanier(String text) throws Throwable {
        achat.assertTrueNamePanier(AchatEnLignePageObject.namepanier, text);
    }

    @When("^Je vérifie l'affiche de prix total dans le panier \"([^\"]*)\"$")
    public void jeVérifieLAfficheDePrixTotalDansLePanier(String text) throws Throwable {
        achat.assertTruePanier(AchatEnLignePageObject.prixpanier, text);
    }

    @When("^Je clique sur le bouton Proceed to checkout$")
    public void jeCliqueSurLeBoutonProceedToCheckout() throws Throwable {
        achat.procedToCheckout();
    }

    @When("^Je vérifie la redirection vers le formulaire de payement \"([^\"]*)\"$")
    public void jeVérifieLaRedirectionVersLeFormulaireDePayement(String text) throws Throwable {
        achat.assertTrueFacturation(AchatEnLignePageObject.detailsfacturation, text);
    }

    @When("^Je remplis les champs prénom \"([^\"]*)\" et nom \"([^\"]*)\" et pays \"([^\"]*)\"et l’adresse \"([^\"]*)\"et ville \"([^\"]*)\" et etat \"([^\"]*)\"  et code postale \"([^\"]*)\" et numéro de téléphone \"([^\"]*)\" et l’adresse mail \"([^\"]*)\"\"([^\"]*)\"$")
    public void jeRemplisLesChampsPrénomEtNomEtPaysEtLAdresseEtVilleEtEtatEtCodePostaleEtNuméroDeTéléphoneEtLAdresseMail(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10) throws Throwable {
        achat.saisiDonnerFromulaire(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    @When("^Je cocher la case  I HAVE READ ANDAGREE TO THE WEBSITE TERMS AND CONDITIONS$")
    public void jeCocherLaCaseIHAVEREADANDAGREETOTHEWEBSITETERMSANDCONDITIONS() throws Throwable {
        achat.clickChecBox();
    }

    @When("^Je clique sur le bouton PLACE ORDER$")
    public void jeCliqueSurLeBoutonPLACEORDER() throws Throwable {
        achat.valideCommande();
    }

    @Then("^Je vérifie l'achat de la commande \"([^\"]*)\"$")
    public void jeVérifieLAchatDeLaCommande(String arg) throws Throwable {
        achat.assertTrueDetailsCommande(AchatEnLignePageObject.commanderecue, arg);
    }

}
