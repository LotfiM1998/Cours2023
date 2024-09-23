package Composite;

import Strategy.Strategy;

public class AND implements Strategy {
    private Strategy s[];

    public AND(Strategy ...s) {
        this.s = s;
    }

    @Override
    public boolean estValide(String mot) {
        for (Strategy strategy : s) {
            if (!strategy.estValide(mot)) return false;
        }
        return true;
    }
}
