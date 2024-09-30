import java.util.HashMap;
import java.util.Map;

public class MagasinDeLivre extends Magasin {
	public  Produit createProduit(String name, int anneeDeParution){
		return new Livre(name, anneeDeParution);
	}
}
