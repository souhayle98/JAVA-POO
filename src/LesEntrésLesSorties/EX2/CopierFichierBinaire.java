package LesEntrésLesSorties.EX2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopierFichierBinaire {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("sourcebinaire.txt");
             FileOutputStream fos = new FileOutputStream("destinationbinaire.txt")) {
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write((char)byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

