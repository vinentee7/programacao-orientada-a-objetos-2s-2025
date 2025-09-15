public class Computador {
    private Integer memoriaRam;
    private Integer SSD;
    private Integer nucleos;
    private Double operacoesPorSegundo;

    public Computador (Integer memoriaRam, Integer SSD, Integer nucleos, Double operacoesPorSegundo) {
        this.memoriaRam = memoriaRam;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    public Integer getmemoriaRam () {
        return this.memoriaRam;
    }

    public void setmemoriaRam (Integer memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public Integer getSSD () {
        return this.SSD;
    }

    public void setSDD (Integer SDD) {
        this.SSD = SDD;
    }
    
    public Integer getnucleos () {
        return this.nucleos;
    }

    public void setnucleos (Integer nucleos) {
        this.nucleos = nucleos;
    }

    public Double getoperacaoesPorSegundo () {
        return this.operacoesPorSegundo;
    }

    public void setoperacoesPorSegundo (Double operacoesPorSegundo) {
        this.operacoesPorSegundo = operacoesPorSegundo;
    }
    
}