package TD2.AbstractInterface;

class Voiture extends Vehicule implements Roulant {
    public Voiture(String nom, String typeCarburant) {
        super(nom, typeCarburant);
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture démarre.");
    }

    @Override
    public void arreter() {
        System.out.println("La voiture s'arrête.");
    }

    @Override
    public void rouler() {
        System.out.println("La voiture roule.");
    }
}

