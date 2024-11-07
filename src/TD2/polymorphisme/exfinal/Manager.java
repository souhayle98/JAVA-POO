package TD2.polymorphisme.exfinal;

class Manager extends Employe {
    private int nombreDeSubordonnes;

    public Manager(String nom, int salaire, int nombreDeSubordonnes) {
        super(nom, salaire);
        this.nombreDeSubordonnes = nombreDeSubordonnes;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Manager: " + getNom() + ", Salaire: " + getSalaire() + ", Subordonnés: " + nombreDeSubordonnes);
    }

    public void gererEquipe() {
        System.out.println("Le manager gère son équipe de " + nombreDeSubordonnes + " subordonnés.");
    }
}

