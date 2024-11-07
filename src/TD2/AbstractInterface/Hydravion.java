package TD2.AbstractInterface;

class Hydravion extends Vehicule implements Volant, Flottant {
    public Hydravion(String nom, String typeCarburant) {
        super(nom, typeCarburant);
    }

    @Override
    public void demarrer() {
        System.out.println("L'hydravion démarre.");
    }

    @Override
    public void arreter() {
        System.out.println("L'hydravion s'arrête.");
    }

    @Override
    public void voler() {
        System.out.println("L'hydravion vole.");
    }

    @Override
    public void flotter() {
        System.out.println("L'hydravion flotte.");
    }
}
