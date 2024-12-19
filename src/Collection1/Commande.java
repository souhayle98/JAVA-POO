package Collection1;

import java.util.Date;
import java.util.Objects;

public class Commande implements Comparable<Commande> {
    private int NumCommande;
    private Date DateCommande;
    private String NomFournisseur;

    public Commande(int NumCommande, Date DateCommande, String NomFournisseur) {
        this.NumCommande = NumCommande;
        this.DateCommande = DateCommande;
        this.NomFournisseur = NomFournisseur;
    }

    public int getNumCommande() {
        return NumCommande;
    }

    public void setNumCommande(int NumCommande) {
        this.NumCommande = NumCommande;
    }

    public Date getDateCommande() {
        return DateCommande;
    }

    public void setDateCommande(Date DateCommande) {
        this.DateCommande = DateCommande;
    }

    public String getNomFournisseur() {
        return NomFournisseur;
    }

    public void setNomFournisseur(String NomFournisseur) {
        this.NomFournisseur = NomFournisseur;
    }

    @Override
    public String toString() {
        return "Collection1.Commande{" +
            "NumCommande=" + NumCommande +
            ", DateCommande=" + DateCommande +
            ", NomFournisseur='" + NomFournisseur + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Commande commande = (Commande) obj;
        return NumCommande == commande.NumCommande;
    }

    @Override
    public int compareTo(Commande cmd) {
        return this.DateCommande.compareTo(cmd.DateCommande);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NumCommande);
    }
}

