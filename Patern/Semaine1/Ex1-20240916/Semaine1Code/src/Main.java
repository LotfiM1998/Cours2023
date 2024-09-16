import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class  Main {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteurAvecBuffer = null;
        try {
            lecteurAvecBuffer = new BufferedReader(new FileReader("./Semaine1Code/resources/text.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Erreur d'ouverture");
        }
        Observer belgique = new Belgique();
        Observer ligne = new Ligne();
        Observer mot = new Mot();
        Observer palindrome = new Palindrome();
        AnalyseurDeTexte analyseurDeTexte=new AnalyseurDeTexte();
        analyseurDeTexte.addObserver(belgique);
        analyseurDeTexte.addObserver(ligne);
        analyseurDeTexte.addObserver(mot);
        analyseurDeTexte.addObserver(palindrome);
        if (lecteurAvecBuffer != null) {
            analyseurDeTexte.lireFichier(lecteurAvecBuffer);
        }else{
            System.out.println("Erreur de lecture");
        }


}}
