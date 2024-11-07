package TD2.Exception.ex2;

import java.util.Scanner;

public class ConversionNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        String input = scanner.nextLine();

        try {
            int nombre = convertirEnEntier(input);
            System.out.println("Nombre converti : " + nombre);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : La saisie '" + input + "' n'est pas un nombre valide.");
        } finally {
            System.out.println("Bloc finally : Conversion terminée.");
        }
    }

    public static int convertirEnEntier(String nombre) {
        return Integer.parseInt(nombre);
    }
}

