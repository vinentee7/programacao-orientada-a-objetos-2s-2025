public class SistemaOperacional {

    private Computador computador;

    public Commputador(Computador computador) {
        this.computador = computador
    }

    public void getcomputador () {
        return this.computador;
    }

    public setcomputador (Computador computador) {
        this.computador = computador;
    }


    public Boolean executarPrograma (Programa p) {
        if (getSSDOcupado(p) > getSSD(computador)) {
            System.out.println("erro na instalação do programa");
            return false;
        } else if (getmemoriaRAMAlocada(p) > getmemoriaRam(computador)) {
            System.out.println("erro na execução do programa");
            return false;
        } else {
            System.out.println("tempo de execução: " + (getquantidadeOperacoes(p) % (getoperacaoesPorSegundo(computador) * getnucleos(computador))))
            System.out.println("programa executado com sucesso");
            return true;
        }
    }
}