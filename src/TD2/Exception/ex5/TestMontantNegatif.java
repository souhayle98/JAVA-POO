package TD2.Exception.ex5;

public class TestMontantNegatif {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire(500);

        try {
            compte.deposer(-100);
        } catch (MontantNegatifException e) {
            System.out.println(e.getMessage());
        }
    }
}
