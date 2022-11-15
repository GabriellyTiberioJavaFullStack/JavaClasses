package Aulas.POO;

public class Gato extends Pet{

    public String raça;

    public Gato(String nome, int idade, double peso, String raça) {
        super(nome, idade, peso);
        this.raça = raça;
    }
    @Override
    public void fazerSom() {
        System.out.println("MIUAUU MIAUUU");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Estou comendo " + comida);
    }

    @Override
    public void dormir() {
        System.out.println("zzzzzzzzzzzz miau");
    }

    @Override
    public void brincar() {
        System.out.println("Estou brincando... MIAU");
    }


    @Override
    public double getPeso() {
        return this.peso;
    }

    @Override
    public void setPeso(double novoPeso) {
        this.peso = novoPeso;
    }

    public void apresentação(){
        System.out.println("Oi eu sou um gato, meu nome é " +  nome + ", tenho " + idade + " anos, peso " + peso + "kg e sou da raça " + raça);
    }

    public static void main(String[] args){

        Gato g1 = new Gato("Bis", 2, 5, "siamês");
        g1.apresentação();

        g1.brincar();
        g1.comer("petisco");
        g1.dormir();
        g1.fazerSom();

}}
