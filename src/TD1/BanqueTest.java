package TD1;

public class BanqueTest {
    public static void main(String[] args) {
        Banque banque = new Banque();

        // Création de comptes courants et épargne
        CompteCourant compteCourant = new CompteCourant("101", "Alice", 200);
        CompteEpargne compteEpargne = new CompteEpargne("102", "Bob", 2.5);

        banque.ajouterCompte(compteCourant);
        banque.ajouterCompte(compteEpargne);

        // Opérations
        compteCourant.deposer(1000);
        compteCourant.retirer(1100);  // Dépasse le solde, mais autorisé par le découvert
        compteEpargne.deposer(500);
        compteEpargne.calculerInteret();

        // Affichage des informations des comptes
        compteCourant.afficherSolde();
        compteEpargne.afficherSolde();

        Banque.afficherNombreComptes();


        // Affichage des transactions pour chaque compte
        System.out.println("Historique des transactions du compte courant:");
        for (Transaction t : compteCourant.getTransactions()) {
            System.out.println(t);
        }

        System.out.println("Historique des transactions du compte épargne:");
        for (Transaction t : compteEpargne.getTransactions()) {
            System.out.println(t);
        }
    }
}


