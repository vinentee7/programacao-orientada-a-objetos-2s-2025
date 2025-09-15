public class SistemaOperacional {

    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public Computador getcomputador () {
        return this.computador;
    }

    public void setcomputador (Computador computador) {
        this.computador = computador;
    }


    public Boolean executarPrograma (Programa p) {
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("erro na instalação do programa");
            return false;
        } else if (p.getmemoriaRAMAlocada() > computador.getmemoriaRam()) {
            System.out.println("erro na execução do programa");
            return false;
        } else {
            System.out.println("tempo de execução: " + (p.getquantidadeOperacoes() % (computador.getoperacaoesPorSegundo() * computador.getnucleos())));
            System.out.println("programa executado com sucesso");
            return true;
        }
    }
}