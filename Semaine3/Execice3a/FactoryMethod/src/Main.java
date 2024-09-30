public class Main {
    public static void main(String[] args) {
        Magasin magasinDVD = new MagasinDeDVD();
        magasinDVD.ajouterProduit("test1", 2000);
        magasinDVD.ajouterProduit("test2", 2001);

        Magasin magasinLivre = new MagasinDeLivre();
        magasinLivre.ajouterProduit("test3", 2002);
        magasinLivre.ajouterProduit("test4", 2003);
    }
}
