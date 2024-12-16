package validation;

import domaine.AmEx;
import domaine.CarteDeCredit;

import java.util.Calendar;

public class AmExGenerateur extends Generateur {

    public AmExGenerateur(Generateur successeur) {
        super(successeur);
    }

    @Override
    public boolean valider(String numero) {
        return numero.length()==15 &&(numero.startsWith("34") || numero.startsWith("37"));
    }

    @Override
    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        if (valider(numero)) {
            return new AmEx(numero, dateExpiration, nom);
    }
    return super.creerCarte(numero, dateExpiration, nom);
    }

}
