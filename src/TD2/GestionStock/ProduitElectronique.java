package TD2.GestionStock;

class ProduitElectronique implements Produit {
    private double prixUnitaire;
    private int quantite;

    public ProduitElectronique(double prixUnitaire, int quantite) {
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
    }

    @Override
    public double calculerValeurStock() {
        return prixUnitaire * quantite;
    }
}
