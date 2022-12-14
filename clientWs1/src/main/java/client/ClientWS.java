package client;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy=new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDh(5000));
        Compte compte=proxy.getCompte(9);
        System.out.println("-----------------------------------------------");
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
        List<Compte> comptes=proxy.listComptes();
        comptes.forEach(cp->{
            System.out.println("-----------------------------------------------");
            System.out.println(cp.getCode());
            System.out.println(cp.getSolde());
        });


    }
}
