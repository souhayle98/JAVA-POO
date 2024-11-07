package TD2.AbstractInterface;

abstract class Vehicule {
    protected String nom;
    protected String typeCarburant;

    public Vehicule(String nom, String typeCarburant) {
        this.nom = nom;
        this.typeCarburant = typeCarburant;
    }

    public abstract void demarrer();
    public abstract void arreter();

    public void afficherInfos() {
        System.out.println("Nom: " + nom + ", Type de Carburant: " + typeCarburant);
    }
}
