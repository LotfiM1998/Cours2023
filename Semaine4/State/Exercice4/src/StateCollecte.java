public class StateCollecte extends State{
    @Override
    public void selectionnerBoisson(MachineACafe machine, ToucheBoisson boisson, int montantEnCours) {
        
    }
    @Override
    public void entreMonnaie(MachineACafe machine, Piece montant) {
        machine.setMontantEnCours(machine.getMontantEnCours() + montant.getValeur());
        machine.afficherMontant();

    }
}
