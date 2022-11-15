package Aulas.POO;

public class Carro { String modelo;
    String marca;
    int ano;
    boolean ehFlex;
    int qtPortas;
    double combustivelAtual;

    double consumo; // quantos km por litro

    boolean estaLigado;

    Carro(String modelo, String marca, int ano, boolean ehFlex, int qtPortas, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehFlex = ehFlex;
        this.qtPortas = qtPortas;
        this.combustivelAtual = 30.0; // todos os carros começam com 30 L
        this.consumo = consumo;
        this.estaLigado = false; // todos os carros começam desligados
    }

    // Abastecer
    void abastecer(double total) { // parâmetros do método
        this.combustivelAtual += total; // this.combustivelAtual = this.combustivelAtual + total;
    }

    // Ligar
    void ligar() {
        this.estaLigado = true;
    }

    // Desligar
    void desligar() {
        this.estaLigado = false;
    }

    // Viajar
    boolean viajar(String local, double distancia) { // tentar viajar, se conseguir true, senão false
        if(!this.estaLigado) {
            this.ligar();
        }
        // Calcula quantos litros serão necessários para a viagem
        double totalLitros = distancia / this.consumo;

        if(this.combustivelAtual - totalLitros > 0) {
            this.combustivelAtual -= totalLitros;
            System.out.println("A viagem p/ " + local + " aconteceu. Sobrou " + this.combustivelAtual + " L");
            return true; // a viagem aconteceu
        } else {
            System.out.println("A viagem não foi possível.");
            return false; // a viagem não será possível
        }
    }

    // A main serve pra testar a classe
    public static void main(String[] args) {
        Carro carro1 = new Carro("XY", "Ferrari", 2019, true, 4, 40);
        Carro carro2 = new Carro("Z", "Ford", 2000, false, 2, 50);

        System.out.println(carro1.combustivelAtual);
        carro1.abastecer(5);
        System.out.println(carro1.combustivelAtual);

        System.out.println(carro1.estaLigado);
        carro1.ligar();
        System.out.println(carro1.estaLigado);

        System.out.println(carro1.ano); // 2019
        carro1.ano = 2022;
        System.out.println(carro1.ano); // 2022

        boolean viajou = carro1.viajar("Fortaleza", 30000);
        System.out.println(viajou);
    }
}
