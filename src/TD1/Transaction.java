package TD1;

import java.util.Date;

class Transaction {
    private String type;
    private double montant;
    private Date date;

    public Transaction(String type, double montant, Date date) {
        this.type = type;
        this.montant = montant;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public double getMontant() {
        return montant;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
            "type='" + type + '\'' +
            ", montant=" + montant +
            ", date=" + date +
            '}';
    }
}
