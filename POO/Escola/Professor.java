package Aulas.POO.Escola;

public class Professor extends Pessoa{ private String formacao;

    public Professor(String nome, String email, String cpf, String formacao) {
        super(nome, email, cpf);
        this.formacao = formacao;
    }

    @Override // indica que há sobrescrita
    public void seApresentar() {
        super.seApresentar();
        System.out.println("Eu sou um professor com formacao em " + this.formacao);
    }

    public String getFormacao() {
        return this.formacao;
    }
}
