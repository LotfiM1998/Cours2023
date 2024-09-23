package Decorator;

import Strategy.Strategy;

public class Compteur implements Strategy {
    private final Strategy s;
    private int compteur = 0;

    public Compteur(Strategy s) {
        this.s = s;
    }

    @Override
    public boolean estValide(String mot) {
        boolean b=s.estValide(mot);
        if (b)compteur++;
        System.out.println("Compteur: "+compteur);
        return b;
    }

}
