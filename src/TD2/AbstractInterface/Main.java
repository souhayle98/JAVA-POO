package TD2.AbstractInterface;

// Utilisation du polymorphisme
public class Main {
    public static void main(String[] args) {
        Vehicule[] vehicules = {
            new Voiture("Voiture1", "Essence"),
            new Bateau("Bateau1", "Diesel"),
            new Hydravion("Hydravion1", "Kérosène")
        };

        // Démarrage et arrêt des véhicules
        for (Vehicule v : vehicules) {
            v.demarrer();
            v.afficherInfos();
            v.arreter();
        }

        // Vérification des interfaces et appel des méthodes spécifiques
        for (Vehicule v : vehicules) {
            if (v instanceof Roulant) {
                ((Roulant) v).rouler();
            }
            if (v instanceof Flottant) {
                ((Flottant) v).flotter();
            }
            if (v instanceof Volant) {
                ((Volant) v).voler();
            }
        }
    }
}
