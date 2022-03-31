$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AchatEnLigne.feature");
formatter.feature({
  "line": 2,
  "name": "Tester l\u0027achat sur la plateforme SHOPTOOLSQA",
  "description": "ETQ utlisateur je souhaite acheter un article la plateforme SHOPTOOLSQA",
  "id": "tester-l\u0027achat-sur-la-plateforme-shoptoolsqa",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@achatenligne"
    }
  ]
});
formatter.before({
  "duration": 2797721100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Je me connecte sur l\u0027application SHOPTOOLSQA",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.jeMeConnecteSurLApplicationSHOPTOOLSQA()"
});
formatter.result({
  "duration": 16293777000,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Tester l\u0027achat sur la plateforme SHOPTOOLSQA",
  "description": "",
  "id": "tester-l\u0027achat-sur-la-plateforme-shoptoolsqa;tester-l\u0027achat-sur-la-plateforme-shoptoolsqa",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@achat"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Je selectionner l\u0027article",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Je choisir une option de couleur\"Black\"et une option taille \"M\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Je clique sur le bouton ADD TO CART",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Je vérifie l\u0027affichage de message de succès \"“Tokyo Talkies” has been added to your cart.\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Je clique sur le bouton Wiew cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Je vérifie l\u0027ajout de larticle dans le panier \"TOKYO TALKIES\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Je vérifie l\u0027affiche de prix total dans le panier \"100\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Je clique sur le bouton Proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Je vérifie la redirection vers le formulaire de payement \"BILLING DETAILS\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Je remplir les champs prénom \"Raissi\" et nom \" Zied\" et pays \"Tunisia\"et l’adresse \" LA sokra 2043\"et ville \"La Marsa \" et etat \"achat en ligne\"  et code postale \"1003\" et numéro de téléphone \"+21658999862\" et l’adresse mail \"raissi.zied0108@gmail.com\"\"\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Je cocher la case  I HAVE READ ANDAGREE TO THE WEBSITE TERMS AND CONDITIONS",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Je clique sur le bouton PLACE ORDER",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Je vérifie l\u0027achat de la commande \"Thank you. Your order has been received\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AchatEnLigeStepDefinitions.jeSelectionnerLArticle()"
});
formatter.result({
  "duration": 4437088200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Black",
      "offset": 33
    },
    {
      "val": "M",
      "offset": 61
    }
  ],
  "location": "AchatEnLigeStepDefinitions.jeChoisirUneOptionDeCouleurEtUneOptionTaille(String,String)"
});
formatter.result({
  "duration": 242791000,
  "status": "passed"
});
formatter.match({
  "location": "AchatEnLigeStepDefinitions.jeCliqueSurLeBoutonADDTOCART()"
});
formatter.result({
  "duration": 1191989200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "“Tokyo Talkies” has been added to your cart.",
      "offset": 45
    }
  ],
  "location": "AchatEnLigeStepDefinitions.jeVérifieLAffichageDeMessageDeSuccès(String)"
});
formatter.result({
  "duration": 28362000,
  "status": "passed"
});
formatter.match({
  "location": "AchatEnLigeStepDefinitions.jeCliqueSurLeBoutonWiewCart()"
});
formatter.result({
  "duration": 1549455600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TOKYO TALKIES",
      "offset": 47
    }
  ],
  "location": "AchatEnLigeStepDefinitions.jeVérifieLAjoutDeLarticleDansLePanier(String)"
});
formatter.result({
  "duration": 33485700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 51
    }
  ],
  "location": "AchatEnLigeStepDefinitions.jeVérifieLAfficheDePrixTotalDansLePanier(String)"
});
formatter.result({
  "duration": 22446000,
  "status": "passed"
});
formatter.match({
  "location": "AchatEnLigeStepDefinitions.jeCliqueSurLeBoutonProceedToCheckout()"
});
formatter.result({
  "duration": 1399761500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BILLING DETAILS",
      "offset": 58
    }
  ],
  "location": "AchatEnLigeStepDefinitions.jeVérifieLaRedirectionVersLeFormulaireDePayement(String)"
});
formatter.result({
  "duration": 23520200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Raissi",
      "offset": 30
    },
    {
      "val": " Zied",
      "offset": 46
    },
    {
      "val": "Tunisia",
      "offset": 62
    },
    {
      "val": " LA sokra 2043",
      "offset": 84
    },
    {
      "val": "La Marsa ",
      "offset": 109
    },
    {
      "val": "achat en ligne",
      "offset": 129
    },
    {
      "val": "1003",
      "offset": 163
    },
    {
      "val": "+21658999862",
      "offset": 193
    },
    {
      "val": "raissi.zied0108@gmail.com",
      "offset": 226
    },
    {
      "val": "",
      "offset": 253
    }
  ],
  "location": "AchatEnLigeStepDefinitions.jeRemplirLesChampsPrénomEtNomEtPaysEtLAdresseEtVilleEtEtatEtCodePostaleEtNuméroDeTéléphoneEtLAdresseMail(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 875328200,
  "status": "passed"
});
formatter.match({
  "location": "AchatEnLigeStepDefinitions.jeCocherLaCaseIHAVEREADANDAGREETOTHEWEBSITETERMSANDCONDITIONS()"
});
formatter.result({
  "duration": 1087611000,
  "status": "passed"
});
formatter.match({
  "location": "AchatEnLigeStepDefinitions.jeCliqueSurLeBoutonPLACEORDER()"
});
formatter.result({
  "duration": 90100800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank you. Your order has been received",
      "offset": 35
    }
  ],
  "location": "AchatEnLigeStepDefinitions.jeVérifieLAchatDeLaCommande(String)"
});
formatter.result({
  "duration": 2279759300,
  "status": "passed"
});
formatter.after({
  "duration": 661949500,
  "status": "passed"
});
});