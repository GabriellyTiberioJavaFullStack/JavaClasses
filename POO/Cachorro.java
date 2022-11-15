package Aulas.POO;

public class Cachorro extends Pet{
    private String comidaFavorita;
    private String raca;

    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca) {
        // representa a classe Pet
        super(nome, idade, peso); // chamando o construtor da classe pai/superclasse
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    @Override // vamos sobrescrever a ação de fazer som
    public void fazerSom() {
        System.out.println("Au auuuu");
    }

    @Override
    public void brincar() { // o cachorro late na hora de brincar
        this.fazerSom(); // chama o fazerSom do cachorro, foi sobrescrito
        super.brincar(); // está chamando o brincar() de Pet
        this.dormir(); // chama o dormir do pet, pois não foi sobrescrito
    }

    @Override
    public void comer(String comida) { // customizando a forma de comer
        // verifica se é a comida favorita
        if (comida.equals(this.comidaFavorita)) {
            super.comer(comida); // chama o comer() do Pet
            this.peso += 0.2; // this.peso = this.peso + 0.2
//            this.setPeso(this.getPeso() + 0.2);
        } else {
            System.out.println("Quero " + comida + " não!");
        }
    }

    public void correrAtrasMoto() { // método especifico do cachorro
        this.fazerSom();
        super.fazerSom(); // ...
        System.out.println("Correndo atrás da moto");
    }

    public static void main(String[] args) {
        // Testar a herança
        Pet pet1 = new Pet("Fred", 3, 12.5);
        pet1.dormir();
        pet1.comer("Batata");
        pet1.fazerSom();

        System.out.println(" ================== ");

        Cachorro batata = new Cachorro("Rex", 5, 25, "Osso", "Caramelo");
        batata.dormir();
        batata.fazerSom();
        batata.comer("Feijão");
        batata.setPeso(20);
        batata.brincar();
        batata.comer("Osso");
        batata.correrAtrasMoto();
    }
}
