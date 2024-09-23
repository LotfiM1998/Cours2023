package Composite;

import Strategy.Strategy;

public class OR implements Strategy {
    private Strategy s[];

    public OR(Strategy ...s) {
        this.s = s;
    }

    @Override
    public boolean estValide(String mot) {
        for (Strategy strategy : s) {
            if (strategy.estValide(mot)) return true;
        }
        return false;
    }
}
