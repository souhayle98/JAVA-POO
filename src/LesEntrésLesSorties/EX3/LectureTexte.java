package LesEntrésLesSorties.EX3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureTexte {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("livres.txt"))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne); // Affiche chaque ligne
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

