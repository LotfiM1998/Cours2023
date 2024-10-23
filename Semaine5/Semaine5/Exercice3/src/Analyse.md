Composite:
    IComponent:Partie
        operation():demande(),gteNiveau()
    leaf:Valeur
    composite:Groupe
Visitor :
Client = Main
Element = Partie
accept() = demande()
ConcreteElement = Valeur, Groupe
Visitor = Traitement
visit() = traiteValeur(), traiteGroupe()
ConcreteVisitor = Listeur, Totaliseur, ListeurNombre
