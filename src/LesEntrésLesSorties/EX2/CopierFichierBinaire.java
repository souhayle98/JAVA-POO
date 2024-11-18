package LesEntrésLesSorties.EX2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopierFichierBinaire {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("source.binaire");
             FileOutputStream fos = new FileOutputStream("destination.binaire")) {
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

