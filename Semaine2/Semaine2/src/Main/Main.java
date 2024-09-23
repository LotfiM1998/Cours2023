package Main;

import Composite.*;
import Decorator.Compteur;
import Strategy.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    ListerMots l=new ListerMots("./Resources/text.txt");
    l.imprimerSi(new Compteur(new CommencePar('t')));
        System.out.println("Length");
        l.imprimerSi(new DeLongueur(4));
        System.out.println("Palindrome");
        l.imprimerSi(new Palindrome());
        System.out.println("AND");
        l.imprimerSi(new AND(new CommencePar('t'), new DeLongueur(3)));
        System.out.println("OR");
        l.imprimerSi(new OR(new DeLongueur(5), new DeLongueur(6)));
        System.out.println("NOT");
        l.imprimerSi(new NOT(new CommencePar('t')));
        System.out.println("ET");
        l.imprimerSi(new AND(new CommencePar('k'), new DeLongueur(5), new Palindrome()));
        System.out.println("OU");
        l.imprimerSi(new OR(new CommencePar('k'), new DeLongueur(5), new DeLongueur(4), new Palindrome()));
    }
}
