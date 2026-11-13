package rmiService;

import metier.Compte;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class BanqueImpl extends UnicastRemoteObject implements IBanque {
    private final List<Compte> comptes = new ArrayList<>();

    public BanqueImpl() throws RemoteException{super();}

    @Override
    public String creerCompte(Compte c) throws RemoteException {
        for (Compte compte : comptes){
            if (compte.getCode()==c.getCode()){
                return "Code deja existant";
            }
        }
        comptes.add(c);
        return "compte cree";
    }

    @Override
    public String getInfoCompte(int code) throws RemoteException {
        for (Compte compte : comptes){
            if (compte.getCode()==code){
                return "Code: "+compte.getCode()+", solde: "+compte.getSolde()
                        +", date de creation: "+compte.getCreation_date();
            }
        }
        return "compte introuvable";
    }
}
