public class Belgique implements Observer {
    private int nbrBelgique = 0;

    public void update(String ligne) {
        if (ligne==null){
            displayStatistique();
            return;
        }
        if (ligne.contains("Belgique")) {
            nbrBelgique++;
        }
    }

    @Override
    public void displayStatistique() {
        System.out.println("Nombre de fois que le mot Belgique apparait: " + nbrBelgique);
    }

    public int getNbrBelgique() {
        return nbrBelgique;
    }
}
