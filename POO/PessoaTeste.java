package Aulas.POO;

public class PessoaTeste {
    public static void main(String[] args) {
        // new => constrói um NOVO objeto de Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Gaby"; // obj.atributo
        pessoa1.sobrenome = "Carlos";
        pessoa1.idade = 29;
        pessoa1.peso = 55.0;
        pessoa1.altura = 1.65;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa("Pedro", "Gomes", 35, 1.75, 30.5);

        Pessoa pessoa5 = new Pessoa("Carlos", "José", 22, 1.9, 77.0);

        Pessoa recemNascido = new Pessoa("Enzo", "Pereira");

        System.out.println(recemNascido.altura);
        recemNascido.idade++; // envelhecer
        recemNascido.dizOla();

        // Chamada de métodos
        pessoa4.dizOla();
        pessoa4.mostrarImc();
        double imcPessoa4 = pessoa4.calculaImc();
        System.out.println(imcPessoa4);

        pessoa4.comer("Batata");

        // Exemplo pessoas
        Pessoa pedro = new Pessoa("Pedro", "José", 29, 1.8, 80);

        Pessoa joao = new Pessoa("João", "Carlos", 30, 1.75, 90);
        System.out.println("================");

        pedro.cumprimentar(joao);
        pedro.cumprimentar(joao);
        pedro.comer("Batata");


} }
