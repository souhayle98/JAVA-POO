package TD2.polymorphisme.ex1;



class Voiture extends Vehicule {
    @Override
    public void seDeplacer() {
        System.out.println("La voiture roule sur la route.");
    }
}
