package ws;

import java.util.Date;

public class Compte {
    private int code;
    private double sole;
    private Date dateCreation;

    public Compte() {
    }

    public Compte(int code, double sole, Date dateCreation) {
        this.code = code;
        this.sole = sole;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSole() {
        return sole;
    }

    public void setSole(double sole) {
        this.sole = sole;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
