public class MachineACafe {
	public final int idle = 0;
	public final int collecte = 1;
	public final int pasAssez = 2;
	
	private int montantEnCours = 0;
	private int etatCourant = idle;
	private ToucheBoisson boisson = null;

	State state;

	
	public void afficherMontant() {
		System.out.println(montantEnCours + " cents disponibles");
	}
	
	public void afficherRetour() {
		System.out.println(montantEnCours + " cents rendus");
	}
	
	public void afficherPasAssez(ToucheBoisson toucheBoisson) {
		System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + boisson);
		System.out.println("Il manque encore " + (boisson.getPrix() - montantEnCours) + " cents");

	}

	public void afficherBoisson(ToucheBoisson toucheBoisson) {
		System.out.println("Voici un " + toucheBoisson);
		
	}

	public void entrerMonnaie(Piece piece) {
		state.entreMonnaie(this, piece);
		montantEnCours += piece.getValeur();
		afficherMontant();
		if ( etatCourant != pasAssez)
			setState(new StateCollecte());
		else if (boisson.getPrix() > montantEnCours) {
			setState(new StatePasAssez());
				afficherPasAssez(boisson);
		} else {
			montantEnCours -= boisson.getPrix();
			afficherBoisson(boisson);
			boisson = null;
			afficherMontant();
			if (montantEnCours == 0) {
				setState(new StateInactif());
			}else
				setState(new StateCollecte());
		}
	}

	public void selectionnerBoisson(ToucheBoisson toucheBoisson) {

		if (toucheBoisson.getPrix() > montantEnCours) {
			boisson = toucheBoisson;
			afficherPasAssez(boisson);
			boisson = toucheBoisson;
			setState(new StatePasAssez());
			return;
		}
		montantEnCours -= toucheBoisson.getPrix();
		afficherBoisson(toucheBoisson);
		afficherMontant();
		if (montantEnCours == 0)
			setState(new StateInactif());
		else
			setState(new StateCollecte());
	}

	public void rendreMonnaie() {
		state.rendreMonnaie(this);
	}

	
	public void setState(int state) {
		etatCourant = state;
	}
	public void setState(State state) {
		this.state = state;
	}

	public ToucheBoisson getBoisson() {
		return boisson;
	}

	public int getMontantEnCours() {
		return montantEnCours;
	}

	public void setMontantEnCours(int montantEnCours) {
		this.montantEnCours = montantEnCours;
	}

	public void setBoisson(ToucheBoisson boisson) {
		this.boisson = boisson;
	}
}
