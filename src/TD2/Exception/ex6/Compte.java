package TD2.Exception.ex6;
class Compte {
    private double solde;

    public Compte(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public void retirer(double montant) throws SoldeInsuffisantException, MontantNegatifException {
        if (montant < 0) {
            throw new MontantNegatifException("Erreur : Le montant à retirer ne peut pas être négatif.");
        }
        if (montant > solde) {
            throw new SoldeInsuffisantException("Erreur : Solde insuffisant !");
        }
        solde -= montant;
    }

    public double getSolde() {
        return solde;
    }
}
