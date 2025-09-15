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

    public Integer getmemoriaRAMAlocada () {
        return this.memoriaRAMAlocada;
    }

    public void setmemoriaRAMAlocada (Integer memoriaRAMAlocada) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
    }
    
    public Integer getSSDOcupado () {
        return this.SSDOcupado;
    }

    public void seSSDOcupado (Integer SSDOcupado) {
        this.SSDOcupado = SSDOcupado;
    }

    public Integer getnucleos () {
        return this.nucleos;
    }

    public void setnucleos (Integer nucleos) {
        this.nucleos = nucleos;
    }

    public Integer getquantidadeOperacoes () {
        return this.quantidadeOperacoes;
    }

    public void setquantidadeOperacoes (Integer quantidadeOperacoes) {
        this.quantidadeOperacoes = quantidadeOperacoes;
    }
}