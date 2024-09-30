public class DVDFactory implements AbstractFactory {
    @Override
    public Produit createProduit(String name, int anneeDeParution) {
        return new DVD(name, anneeDeParution);
    }
}
