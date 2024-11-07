package TD2.Exception.ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SaisieFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre à virgule flottante : ");

        try {
            float nombre = scanner.nextFloat();
            System.out.println("Nombre saisi : " + nombre);
        } catch (InputMismatchException e) {
            System.out.println("Erreur : Vous devez entrer un nombre valide.");
        }
    }
}
