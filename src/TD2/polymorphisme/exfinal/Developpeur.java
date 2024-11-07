package TD2.polymorphisme.exfinal;

class Developpeur extends Employe {
    private String langage;

    public Developpeur(String nom, int salaire, String langage) {
        super(nom, salaire);
        this.langage = langage;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Développeur: " + getNom() + ", Salaire: " + getSalaire() + ", Langage: " + langage);
    }

    public void afficherLangage() {
        System.out.println("Langage de programmation: " + langage);
    }
}

