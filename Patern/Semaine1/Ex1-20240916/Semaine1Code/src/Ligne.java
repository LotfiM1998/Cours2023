public class Ligne implements Observer {
    private int nbrLignes = 0;
    public void update(String ligne) {
        if (ligne==null){
            displayStatistique();
            return;
        }
        nbrLignes++;

    }

    @Override
    public void displayStatistique() {
        System.out.println("Nombre de lignes: " + nbrLignes);
    }

    public int getNbrLignes() {
        return nbrLignes;
    }
}
