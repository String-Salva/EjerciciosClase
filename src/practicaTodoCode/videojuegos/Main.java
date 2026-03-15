package practicaTodoCode.videojuegos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public  static void main(String[] args) {
        VideoJuego videoJuego = new VideoJuego(123,"Age of Empires","Nintendo 64",3123132);
        VideoJuego videoJuego2 = new VideoJuego(1234,"GTA San Andreas","Play Station 2",123123123);
        VideoJuego videoJuego3 = new VideoJuego(12345,"Fifa 23","Nintendo 64",2);
        VideoJuego videoJuego4 = new VideoJuego(123456,"Ark Survival Evolved","PC",200000);
        VideoJuego videoJuego5 = new VideoJuego(1234567,"Spiderman","Nintendo 64",1231);

        List<VideoJuego> videojuegos = new ArrayList<>();

        videojuegos.add(videoJuego);
        videojuegos.add(videoJuego2);
        videojuegos.add(videoJuego3);
        videojuegos.add(videoJuego4);
        videojuegos.add(videoJuego5);

        for (VideoJuego videojuego : videojuegos) {
            System.out.println(videojuego.toString());
        }


        System.out.println("He hecho algunos cambios");

        videoJuego.setTitulo("World of warcraft");
        videoJuego.setCantidadJugadores(2);

        videoJuego5.setTitulo("Hulk");
        videoJuego5.setCantidadJugadores(6);

        for (VideoJuego x : videojuegos) {
            System.out.println(x.toString());
        }

        System.out.println("Mostraré por pantalla solamente los que sean de la Nintendo 64");

        for (VideoJuego videojuego : videojuegos) {
            if (videojuego.getConsola() == "Nintendo 64") {
                System.out.println(videojuego.toString());
            }
        }


    }
}
