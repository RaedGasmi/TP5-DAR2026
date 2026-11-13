package metier;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {

    @Serial
    private static final long serialVersionUID=1L;

    private int code;
    private double solde;
    private Date creation_date;

    public Compte(int code,double solde){
        this.code=code;
        this.solde=solde;
        this.creation_date=new Date();
    }

    public int getCode() {return code;}
    public double getSolde() {return solde;}
    public Date getCreation_date() {return creation_date;}
}
