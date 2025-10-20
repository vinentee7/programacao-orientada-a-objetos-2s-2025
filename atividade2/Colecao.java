package atividade2;

public class Colecao implements ItemEmprestavel{
    private String proprietario;
    private Integer qtItems;

    public Colecao(String proprietario, Integer qtItems) {
        this.proprietario = proprietario;
        this.qtItems = qtItems;
    }

    public String getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getQtItems() {
        return this.qtItems;
    }

    public void setQtItems(Integer qtItems) {
        this.qtItems = qtItems;
    }

    public void descricao(){
        System.out.println("Propetario: " + this.proprietario);
        System.out.println("Qt.itens: " + this.qtItems);
    }
}
