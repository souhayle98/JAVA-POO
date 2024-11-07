package TD2.polymorphisme.exfinal;

public class TestEmploye {
    public static void main(String[] args) {
        Employe[] employes = new Employe[3];
        employes[0] = new Developpeur("Alice", 60000, "Java");
        employes[1] = new Manager("Bob", 75000, 5);
        employes[2] = new Developpeur("Charlie", 50000, "Python");

        for (Employe employe : employes) {
            employe.afficherInfos();
        }

        Employe emp = new Developpeur("David", 70000, "C++");

        // Affichage des informations de l'employé via upcasting
        emp.afficherInfos();


        Employe emp1 = new Developpeur("Eve", 65000, "JavaScript");
        Employe emp2 = new Manager("Frank", 80000, 3);

        if (emp1 instanceof Developpeur) {
            Developpeur dev = (Developpeur) emp1;
            dev.afficherLangage();
        }

        if (emp2 instanceof Manager) {
            Manager mgr = (Manager) emp2;
            mgr.gererEquipe();
        }


    }
}
