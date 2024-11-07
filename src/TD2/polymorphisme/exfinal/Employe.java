package TD2.polymorphisme.exfinal;

class Employe {
    private String nom;
    private int salaire;

    public Employe(String nom, int salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public void afficherInfos() {
        System.out.println("Employé: " + nom + ", Salaire: " + salaire);
    }

    public String getNom() {
        return nom;
    }

    public int getSalaire() {
        return salaire;
    }
}
