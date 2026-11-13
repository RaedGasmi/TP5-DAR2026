package rmiService;

import java.io.Serial;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion{

    private static final double Taux=3.4;

    @Serial
    private static final long serialVersionUID=1L;

    public ConversionImpl() throws RemoteException {
        super();
    }

    @Override
    public double convertirMontant(double mt) throws RemoteException{
        return mt*Taux;
    }
}
