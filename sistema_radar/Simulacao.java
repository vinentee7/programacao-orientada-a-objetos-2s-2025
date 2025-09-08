package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro("ACLR200", 0, 76, "Comodoro");

        Radar radar = new Radar("Pistão Sul", 60);

        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        
        opala.setVelocidade(-60);
        
        radar.avaliarVelociade(opala);
    }
}   
