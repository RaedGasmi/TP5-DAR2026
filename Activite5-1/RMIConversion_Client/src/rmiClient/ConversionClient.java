package rmiClient;

import rmiService.IConversion;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ConversionClient {
    static void main() {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost",1099);
            IConversion stub = (IConversion) reg.lookup("Conversion");
            double montant = stub.convertirMontant(500);
            System.out.println("Montant converti(de 500): " + montant);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
