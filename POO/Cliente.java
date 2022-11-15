package Aulas.POO;

import java.time.LocalDate;

public class Cliente {  public int id; // acessado por todos
    private String nome; // acessível apenas dentro da classe
    private String sobrenome;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    Cliente(int id, String nome, String sobrenome, LocalDate dataNascimento, double altura, double peso) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public void crescer() {
        this.altura += 0.2;
    }

    // Getter => possibilitam a leitura dos atributos
    // Customizar a leitura dos valores
    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    // Setter => serve para alterar o valor
    // COMO o valor é alterado
    // Validar o novo valor e ver se "faz sentido"
    public void setAltura(double altura) {
        if (altura > 0 && altura < 2.51) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida. Atributo não modificado.");
        }
    }

    public void setPeso(double novoPeso) {
        this.peso = novoPeso;
    }
}
