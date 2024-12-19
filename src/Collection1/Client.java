package Collection1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    String CodeClient;
    private String NomClient;
    private String AdrClient;
    private String TelClient;
    private List<Commande> ListCommandes;

    public Client(String CodeClient, String NomClient, String AdrClient, String TelClient) {
        this.CodeClient = CodeClient;
        this.NomClient = NomClient;
        this.AdrClient = AdrClient;
        this.TelClient = TelClient;
        this.ListCommandes = new ArrayList<>();
    }

    public boolean EnregistrerCommande(Commande cmd) {
        return ListCommandes.add(cmd);
    }

    public boolean SupprimerCommande(int numCommande) {
        return ListCommandes.removeIf(cmd -> cmd.getNumCommande() == numCommande);
        //(parameters) -> { body } FONCTION LAMBDA
    }

    public List<Commande> getListeCommandes() {
        return ListCommandes;
    }

    @Override
    public String toString() {
        return "Client{" +
            "CodeClient='" + CodeClient + '\'' +
            ", NomClient='" + NomClient + '\'' +
            ", AdrClient='" + AdrClient + '\'' +
            ", TelClient='" + TelClient + '\'' +
            ", ListCommandes=" + ListCommandes +
            '}';
    }
}
