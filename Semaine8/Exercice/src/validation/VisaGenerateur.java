package validation;

import domaine.CarteDeCredit;
import domaine.Visa;

import java.util.Calendar;

public class VisaGenerateur extends Generateur {
    public VisaGenerateur(Generateur successeur) {
        super(successeur);
    }

    public boolean valider(String numero) {
        return numero.length() == 16 && numero.charAt(0) == '4';
    }

    @Override
    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        if (valider(numero)) {
            return new Visa(numero, dateExpiration, nom);
        }else {
        return super.creerCarte(numero, dateExpiration, nom);
    }}

}
