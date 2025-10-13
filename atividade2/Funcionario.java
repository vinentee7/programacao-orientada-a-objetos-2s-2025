package atividade2;

public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario (String nome, String email, String cargo) {
        super(nome, email);
        this.cargo = cargo;
    }

    public String getcargo() {
        return this.cargo;
    }

    public void setcargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Cargo: " + this.cargo);
    }
    
}

