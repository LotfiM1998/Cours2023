public class DVDFactory extends Magasin {
    @Override
    public Produit createProduit(String name, int anneeDeParution) {
        return new DVD(name, anneeDeParution);
    }
}
