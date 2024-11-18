package LesEntrésLesSorties.EX4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EcritureTexte {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("livres.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("sortie.txt"))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                bw.write(ligne);
                bw.newLine(); // Ajoute un retour à la ligne
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
