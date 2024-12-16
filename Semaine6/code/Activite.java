public abstract class Activite {
	private Cellule cellule;

	public Activite(Cellule cellule) {
		this.cellule = cellule;
	}

	// Envoyer la requ?te sauv?e (vit ou meurt) ? la cellule. 
	public abstract void activer();
	public Cellule getCellule() {
		return cellule;
	}
}
