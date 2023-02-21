import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class Client {
    public static void main(String[] args) {

        BanqueService stub=new BanqueWS().getBanqueServicePort();

        System.out.println(stub.convertion(7800));

        System.out.println("****************************");
        Compte cp=stub.getCompte(2);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        System.out.println(cp.getCreatDate());
        System.out.println("****************************");

        List<Compte> compteList=stub.listComptes();
        compteList.forEach(ac->{
            System.out.println(ac.getCode());
            System.out.println(ac.getSolde());
            System.out.println(ac.getCreatDate());
        });

    }

}

