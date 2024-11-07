package TD2.GestionStock;

class ProduitAlimentaire implements Produit {
    private double prixUnitaire;
    private int quantite;

    public ProduitAlimentaire(double prixUnitaire, int quantite) {
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
    }

    @Override
    public double calculerValeurStock() {
        return prixUnitaire * quantite;
    }
}
