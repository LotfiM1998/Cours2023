package validation;

import domaine.CarteDeCredit;
import domaine.MasterCard;

import java.util.Calendar;

public class MasterCardGenerateur extends Generateur{
    public MasterCardGenerateur(Generateur successeur) {
        super(successeur);
    }

    @Override
    public boolean valider(String numero) {
        return numero.length() == 16 && (numero.startsWith("51") || numero.startsWith("55"));
    }
    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        if (valider(numero)) {
            return new MasterCard(numero, dateExpiration, nom);
        }
        return super.creerCarte(numero, dateExpiration, nom);
    }
}
