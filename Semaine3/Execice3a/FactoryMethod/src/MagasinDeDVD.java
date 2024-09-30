import java.util.HashMap;
import java.util.Map;


public class MagasinDeDVD extends Magasin {

	@Override
	public Produit createProduit(String name, int anneeDeParution) {
		return new DVD(name, anneeDeParution);
	}
}
