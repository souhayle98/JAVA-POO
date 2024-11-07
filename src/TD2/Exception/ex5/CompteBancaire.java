package TD2.Exception.ex5;

class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant) throws MontantNegatifException {
        if (montant < 0) {
            throw new MontantNegatifException("Erreur : Le montant à déposer ne peut pas être négatif.");
        }
        solde += montant;
    }

    public void retirer(double montant) throws MontantNegatifException {
        if (montant < 0) {
            throw new MontantNegatifException("Erreur : Le montant à retirer ne peut pas être négatif.");
        }
        solde -= montant;
    }

    public double getSolde() {
        return solde;
    }
}
