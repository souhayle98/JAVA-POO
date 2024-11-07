package TD1;

import java.util.ArrayList;

class Banque {
    private ArrayList<CompteBancaire> comptes;
    private static int nombreComptes = 0;

    public Banque() {
        this.comptes = new ArrayList<>();
    }

    public void ajouterCompte(CompteBancaire compte) {
        comptes.add(compte);
        nombreComptes++;
    }

    public CompteBancaire chercherCompte(String numeroCompte) {
        for (CompteBancaire compte : comptes) {
            if (compte.getNumeroCompte().equals(numeroCompte)) {
                return compte;
            }
        }
        return null;
    }

    public void transfert(String numeroSource, String numeroDest, double montant) {
        CompteBancaire source = chercherCompte(numeroSource);
        CompteBancaire dest = chercherCompte(numeroDest);

        if (source != null && dest != null && source.getSolde() >= montant) {
            source.retirer(montant);
            dest.deposer(montant);
        } else {
            System.out.println("Transfert impossible.");
        }
    }

    public static void afficherNombreComptes() {
        System.out.println("Nombre total de comptes : " + nombreComptes);
    }
}

