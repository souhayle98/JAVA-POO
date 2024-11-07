package TD2.Exception.ex6;

import java.util.InputMismatchException;
import java.util.Scanner;

// Classe principale pour tester les exceptions
public class GestionCompteAvecExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Compte compte = new Compte(500);  // Solde initial

        System.out.print("Entrez un montant à retirer : ");

        try {
            double montant = scanner.nextDouble();
            compte.retirer(montant);
            System.out.println("Retrait effectué avec succès. Solde restant : " + compte.getSolde());
        } catch (InputMismatchException e) {
            System.out.println("Erreur : Vous devez entrer un nombre valide.");
        } catch (MontantNegatifException e) {
            System.out.println(e.getMessage());
        } catch (SoldeInsuffisantException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Opération terminée.");
        }
    }
}
