package rmiClient;

import metier.Compte;
import rmiService.IBanque;

import javax.naming.InitialContext;

public class BanqueClient {
    static void main() {
        try {
            InitialContext ctx = new InitialContext();
            IBanque stub = (IBanque) ctx.lookup("Banque");
            System.out.println(stub.creerCompte(new Compte(1,500)));
            System.out.println(stub.getInfoCompte(1));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
