package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro();
        opala.ano = 76;
        opala.modelo = "Comodoro";
        opala.placa = "ACLR200";
        opala.velocidade = 0;

        Radar radar = new Radar();
        radar.localizacao = "Pistão Sul";
        radar.limiteVelocidade = 60;

        radar.avaliarVelociade(opala);

        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();

        radar.avaliarVelociade(opala);
    }
}   
