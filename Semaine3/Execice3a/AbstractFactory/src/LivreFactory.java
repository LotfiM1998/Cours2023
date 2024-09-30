public class LivreFactory implements AbstractFactory {
    @Override
    public Produit createProduit(String name, int anneeDeParution) {
        return new Livre(name, anneeDeParution);
    }
}
