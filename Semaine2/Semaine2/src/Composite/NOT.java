package Composite;
import Strategy.Strategy;

public class NOT implements Strategy {
    private Strategy s;

    public NOT(Strategy s) {
        this.s = s;
    }

    public boolean estValide(String mot) {
        return !s.estValide(mot);
    }
}
