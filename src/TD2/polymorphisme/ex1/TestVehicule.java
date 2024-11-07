package TD2.polymorphisme.ex1;


public class TestVehicule {
    public static void main(String[] args) {
        Vehicule voiture = new Voiture();
        Vehicule velo = new Velo();
        voiture.seDeplacer();
        velo.seDeplacer();
    }
}

