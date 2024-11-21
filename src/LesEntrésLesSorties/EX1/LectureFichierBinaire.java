package LesEntrésLesSorties.EX1;

import java.io.FileInputStream;
import java.io.IOException;

public class LectureFichierBinaire {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("fichierbinaire.java");
            int x;
            while ((x = fis.read()) != -1) {
                System.out.printf(String.valueOf((char)x));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

