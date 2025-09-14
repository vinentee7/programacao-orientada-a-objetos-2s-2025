public class Computador {
    private Integer memoriaRam;
    private Integer SSD;
    private Integer nucleos;
    private Float operacoesPorSegundo;

    public Computador (Integer memoriaRam, Integer SSD, Integer nucleos, Float operacoesPorSegundo) {
        this.memoriaRam = memoriaRam;
        this.SSD = SDD;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    public void getmemoriaRam () {
        return this.memoriaRam;
    }

    public Integer setmemoriaRam (Integer memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void getSSD () {
        return this.SDD;
    }

    public Integer setSDD (Integer SDD) {
        this.SSD = SDD;
    }
    
    public void getnucleos () {
        return this.nucleos;
    }

    public Integer setnucleos (Integer nucleos) {
        this.nucleos = nucleos;
    }

    public void getoperacaoesPorSegundo () {
        return this.operacoesPorSegundo;
    }

    public Float setoperacoesPorSegundo (Float operacoesPorSegundo) {
        this.operacoesPorSegundo = operacoesPorSegundo;
    }
    
}