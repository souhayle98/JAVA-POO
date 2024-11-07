package TD2.Exception.ex3;

class Compte {
    private double solde;

    public Compte(double solde) {
        this.solde = solde;
    }

    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Erreur : Solde insuffisant !");
        }
        solde -= montant;
    }

    public double getSolde() {
        return solde;
    }
}
