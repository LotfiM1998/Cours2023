package Strategy;

public class Palindrome implements Strategy {
    @Override
    public boolean estValide(String mot) {
        if (mot==null)
            return false;
        return mot.equals(new StringBuilder(mot).reverse().toString());
    }
}
