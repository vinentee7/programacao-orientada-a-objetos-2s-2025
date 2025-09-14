public class Programa {
    private Integer memoriaRAMAlocada;
    private Integer SSDOcupado;
    private Integer nucleos;
    private Integer quantidadeOperacoes;

    public Programa (Integer memoriaRAMAlocada, Integer SSDOcupado, Integer nucleos, Integer quantidadeOperacoes) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.SSDOcupado = SSDOcupado;
        this.nucleos = nucleos;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    public void getmemoriaRAMAlocada () {
        return this.memoriaRAMAlocada;
    }

    public Integer setmemoriaRAMAlocada (Integer memoriaRAMAlocada) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
    }

    public void getSSDOcupado () {
        return this.SSDOcupado;
    }

    public Integer seSSDOcupado (Integer SSDOcupado) {
        this.SSDOcupado = SSDOcupado;
    }

    public void getnucleos () {
        return this.nucleos;
    }

    public Integer setnucleos (Integer nucleos) {
        this.nucleos = nucleos;
    }

    public void getquantidadeOperacoes () {
        return this.quantidadeOperacoes;
    }

    public Integer setquantidadeOperacoes (Integer quantidadeOperacoes) {
        this.quantidadeOperacoes = quantidadeOperacoes;
    }
}