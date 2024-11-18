package LesEntrésLesSorties.EX7;

import LesEntrésLesSorties.EX5.Livre;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserialisationBibliotheque {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bibliotheque.ser"))) {
            List<Livre> livres = (List<Livre>) ois.readObject();
            for (Livre livre : livres) {
                System.out.println(livre); // Affiche chaque livre
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

