package Strategy;

public class CommencePar implements Strategy {
    private char lettre;
    @Override
    public boolean estValide(String mot) {
        return Character.toLowerCase(mot.charAt(0)) == lettre;
    }
    public CommencePar(char lettre) {
        this.lettre = Character.toLowerCase(lettre);
    }

}
