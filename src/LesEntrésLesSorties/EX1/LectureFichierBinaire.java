package LesEntrésLesSorties.EX1;

import java.io.FileInputStream;
import java.io.IOException;

public class LectureFichierBinaire {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("fichier.binaire")) {
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                System.out.printf(String.valueOf(byteRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

