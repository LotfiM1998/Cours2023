import java.util.HashMap;
import java.util.Map;

public class Magasin {
    private Map<String,Produit> bac= new HashMap<String,Produit>();
public void ajouterProduit(String name, int anneeDeParution,AbstractFactory factory){
        Produit produit=factory.createProduit(name, anneeDeParution);
        bac.put(name,produit);
    }
    public Produit retourneProduit(String name){
        return bac.get(name);
    }

}
