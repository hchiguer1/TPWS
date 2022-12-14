package server;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        //Endpoint.publish("http://localhost:8084",new BanqueService());//acces q'appartir de local
        String url="http://0.0.0.0:8084/";
        Endpoint.publish(url,new BanqueService());//acces den'importe quelle reseau
        System.out.println("Web service déployé sur "+url );
    }
}
