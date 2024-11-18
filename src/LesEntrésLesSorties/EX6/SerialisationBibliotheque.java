package LesEntrésLesSorties.EX6;

import LesEntrésLesSorties.EX5.Livre;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialisationBibliotheque {
    public static void main(String[] args) {
        List<Livre> livres = new ArrayList<>();
        livres.add(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943));
        livres.add(new Livre("1984", "George Orwell", 1949));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bibliotheque.ser"))) {
            oos.writeObject(livres); // Sauvegarde la liste d'objets
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

