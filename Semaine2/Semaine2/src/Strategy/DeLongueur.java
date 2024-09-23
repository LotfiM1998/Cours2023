package Strategy;

public class DeLongueur implements Strategy {
    public int longueur;
    @Override
    public boolean estValide(String mot) {
        return mot.length() == longueur;
    }
    public DeLongueur(int longueur) {
        this.longueur = longueur;
    }
}
