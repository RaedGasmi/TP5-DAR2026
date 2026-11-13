package rmiServer;

import rmiService.BanqueImpl;

import javax.naming.InitialContext;
import java.rmi.registry.LocateRegistry;

public class BanqueServer {
    static void main() {
        try {
            LocateRegistry.createRegistry(1099);
            InitialContext ctx = new InitialContext();
            ctx.rebind("Banque",new BanqueImpl());
            System.out.println("Serveur JNDI pret");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
