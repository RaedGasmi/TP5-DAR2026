package rmiServer;

import rmiService.ConversionImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ConversionServer {
    static void main() {
        try {
            Registry reg = LocateRegistry.createRegistry(1099);
            ConversionImpl service = new ConversionImpl();
            reg.rebind("Conversion",service);
            System.out.println("Serveur RMI prêt");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
