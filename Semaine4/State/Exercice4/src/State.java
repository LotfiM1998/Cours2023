public abstract class  State {
    public   void rendreMonnaie(MachineACafe machine){
        machine.afficherRetour();
        machine.setMontantEnCours(0);
        machine.setBoisson(null);
        machine.setState(new StateInactif());
    };





    public abstract void selectionnerBoisson(MachineACafe machine, ToucheBoisson boisson, int montantEnCours);

    public  void entreMonnaie(MachineACafe machine, Piece montant){
        machine.setMontantEnCours(machine.getMontantEnCours() + montant.getValeur());
        machine.afficherMontant();
        if (machine.getBoisson().getPrix()> machine.getMontantEnCours()){
            machine.setState(new StatePasAssez());
            machine.afficherPasAssez(machine.getBoisson());
        }
        else{
            machine.setMontantEnCours(machine.getMontantEnCours() -machine.getBoisson().getPrix());
            machine.afficherBoisson(machine.getBoisson());
            machine.setBoisson(null);
            machine.afficherMontant();
            if (machine.getMontantEnCours() == 0){
                machine.setState(new StateInactif());
            }
            else{
                machine.setState(new StateCollecte());
            }
        }
    };
}
