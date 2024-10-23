public class StateInactif extends State{
    @Override
    public void SelectionnerBoisson(MachineACafe machine, ToucheBoisson boisson, int montantEnCours){
       machine.afficherPasAssez(boisson);
    }


    @Override
    public void selectionnerBoisson(MachineACafe machine, ToucheBoisson boisson, int montantEnCours) {

    }

    @Override
    public void rendreMonnaie(MachineACafe machine) {
        machine.setState(new StateInactif());
    }
}
