package TD1;
import java.util.ArrayList;
import java.util.Date;

class CompteBancaire {
    private String numeroCompte;
    private double solde;
    private String titulaire;
    private ArrayList<Transaction> transactions;

    public CompteBancaire(String numeroCompte, String titulaire) {
        this.numeroCompte = numeroCompte;
        this.titulaire = titulaire;
        this.solde = 0;
        this.transactions = new ArrayList<>();
    }

    public void deposer(double montant) {
        solde += montant;
        transactions.add(new Transaction("Crédit", montant, new Date()));
    }

    public void retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
            transactions.add(new Transaction("Débit", montant, new Date()));
        } else {
            System.out.println("Solde insuffisant.");
        }
    }

    public void afficherSolde() {
        System.out.println("Solde du compte " + numeroCompte + ": " + solde);
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
