package TD1;

class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(String numeroCompte, String titulaire, double tauxInteret) {
        super(numeroCompte, titulaire);
        this.tauxInteret = tauxInteret;
    }

    public void calculerInteret() {
        double interet = getSolde() * tauxInteret / 100;
        deposer(interet);
    }
}

