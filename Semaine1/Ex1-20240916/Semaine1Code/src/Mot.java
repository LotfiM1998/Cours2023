public class Mot implements Observer{
    private int nbrMots = 0;
    public void update(String ligne) {
        if (ligne==null){
            displayStatistique();
            return;
        }
        for (String mot : ligne.trim().split(" ")) {
            nbrMots++;
        }
    }

    @Override
    public void displayStatistique() {
        System.out.println("Nombre de mots: " + nbrMots);
    }

    private int getNbrMots() {
        return nbrMots;
    }


}
