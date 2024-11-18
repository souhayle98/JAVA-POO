package LesEntrésLesSorties.EX5;

import java.io.Serializable;

public class Livre implements Serializable {
    private String titre;
    private String auteur;
    private int anneePublication;

    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }

    @Override
    public String toString() {
        return "Livre{" +
            "titre='" + titre + '\'' +
            ", auteur='" + auteur + '\'' +
            ", anneePublication=" + anneePublication +
            '}';
    }
}

