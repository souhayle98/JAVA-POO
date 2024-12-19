package Collection1;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Créer des commandes
        Commande cmd1 = new Commande(1, new Date(), "Fournisseur A");
        Commande cmd2 = new Commande(2, new Date(), "Fournisseur B");
        Commande cmd3 = new Commande(3, new Date(), "Fournisseur C");

        // Créer des clients
        Client client1 = new Client("C001", "Alice", "Casablanca", "0612345678");
        Client client2 = new Client("C002", "Bob", "Rabat", "0698765432");

        // Ajouter des commandes aux clients
        client1.EnregistrerCommande(cmd1);
        client1.EnregistrerCommande(cmd2);
        client2.EnregistrerCommande(cmd3);

        // Stocker les clients dans une liste
        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        // Trier les commandes d'un client
        Collections.sort(client1.getListeCommandes());

        // Utiliser un Set pour éviter les doublons
        Set<Commande> commandesSet = new HashSet<>(client1.getListeCommandes());
        commandesSet.add(cmd3);

        // Utiliser une Map pour associer chaque client à son codeClient
        Map<String, Client> clientMap = new HashMap<>();
        clientMap.put(client1.CodeClient, client1);
        clientMap.put(client2.CodeClient, client2);

        // Écrire les informations des clients dans un fichier texte
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("clients.txt"))) {
            for (Client client : clients) {
                writer.write(client.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture du fichier: " + e.getMessage());
        }

        // Lire et afficher le contenu du fichier
        try (BufferedReader reader = new BufferedReader(new FileReader("clients.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier: " + e.getMessage());
        }
    }
}



