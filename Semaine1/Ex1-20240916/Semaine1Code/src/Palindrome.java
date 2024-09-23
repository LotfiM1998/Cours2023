public class Palindrome implements  Observer{
    private int nbrPalindromes = 0;
    public void update(String ligne) {
        if (ligne==null){
            displayStatistique();
            return;
        }
        for (String mot : ligne.trim().split(" ")) {
            StringBuffer temp = new StringBuffer(mot);
            if (mot.equals(temp.reverse().toString())) {
                nbrPalindromes++;
            }
        }
    }

    @Override
    public void displayStatistique() {
        System.out.println("Nombre de palindromes: " + nbrPalindromes);
    }

    public int getNbrPalindromes() {
        return nbrPalindromes;
    }
}
