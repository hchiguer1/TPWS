package ws;

import java.util.Date;
import java.util.List;

public class BanqueService {
    public double conversion(double mt){
        return mt*10.54;
    }
    public Compte getCompte(int code){
        return new Compte(code,Math.random()*9888,new Date());
    }
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1,Math.random()*9888,new Date()),
                new Compte(2,Math.random()*9888,new Date()),
                new Compte(3,Math.random()*9888,new Date())
        );
    }

}
