public class main {
    public static void main(String[] args) {
        Computador pcNasa = new Computador(12, 200, 3, 300);
        Programa silksong = new Programa(8, 100, 1, 1000);
        Programa csGo = new Programa(8, 220, 2, 1500);
        Programa valorant = new Programa(16, 190, 3, 1500);
        SistemaOperacional runGame = new SistemaOperacional(pcNasa);    

        runGame.executarPrograma(silksong);
        runGame.executarPrograma(csGo);
        runGame.executarPrograma(valorant);

    }
}