package TD1;

class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(String numeroCompte, String titulaire, double decouvertAutorise) {
        super(numeroCompte, titulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirer(double montant) {
        if (getSolde() + decouvertAutorise >= montant) {
            super.retirer(montant);
        } else {
            System.out.println("Retrait refusé : dépasse le découvert autorisé.");
        }
    }
}
