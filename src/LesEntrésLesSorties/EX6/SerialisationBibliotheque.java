package LesEntrésLesSorties.EX6;

import LesEntrésLesSorties.EX5.Livre;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialisationBibliotheque {
    public static void main(String[] args) {
        ArrayList<Livre> livres = new ArrayList<>();
        livres.add(new Livre("PYTON", "xxx", 2010));
        livres.add(new Livre("JAVA", "yyy", 2020));

        try {
            FileOutputStream fis = new FileOutputStream("bibliotheque.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            oos.writeObject(livres); // Sauvegarde la liste d'objets
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

