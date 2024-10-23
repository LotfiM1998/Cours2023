public class StatePasAssez extends State {
    @Override
    public void SelectionnerBoisson(MachineACafe machine, ToucheBoisson boisson, int montantEnCours) {
        throw new IllegalStateException();
    }

    @Override
    public void entreMonnaie(MachineACafe machine, Piece montant) {
        machine.setState(new StateCollecte());
        super.entreMonnaie(machine, montant);
    }
}