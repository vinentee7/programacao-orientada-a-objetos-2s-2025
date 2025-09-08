package sistema_radar;

public class Radar {
    public String localizacao;
    public Integer limiteVelocidade;

    public Radar(String localizacao, Integer limiteVelocidade) {
        this.localizacao = localizacao;
        this.limiteVelocidade = limiteVelocidade;
    }

    public void emitirnotificacao(String placa, Integer velocidadeobservada) {
        System.out.println("Placa: "+placa);
        System.out.println("Veloidade observada: "+velocidadeobservada+" Km/h");
        System.out.println("Localização: "+this.localizacao);
        System.out.println("Velocidade da via: "+this.limiteVelocidade+" Km/h");
    }

    public void avaliarVelociade(Carro carro){
        if(carro.velocidade > this.limiteVelocidade) {
            emitirnotificacao(carro.placa, carro.velocidade);
        } else {
            System.out.println("Velocidade: "+carro.velocidade+" Km/h");
        }
    }
}
