package Aulas.POO.Zoo;

public interface Animal {
    void dormir(); // definição do método apenas

    void fazerSom();

    void comer(String comida);
}

// Gato precisa implementar os métodos
class Gato implements Animal {
    @Override
    public void dormir() {
        System.out.println("zzzzzz Miau");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void comer(String comida) {
        if (comida.equals("Peixe")) {
            System.out.println("Hummm gosto de peixe");
        } else {
            System.out.println("Só como peixe");
        }
    }

    public void ronronar() {
        System.out.println("grmmmmm");
    }
}

class Galinha implements Animal {
    @Override
    public void dormir() {
        System.out.println("Có có zzzzzz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Có có có có");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Hummm có có " + comida);
    }

    public void botarOvo() {
        System.out.println("ovo colocado");
    }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();
        Gato gato2 = new Gato();

        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("Milho");
        galinha.botarOvo();

        gato.fazerSom();
        gato.dormir();
        gato.comer("Peixe");
        gato.ronronar();

        gato2.fazerSom();

        // Interface não consigo criar um objeto
        // Animal novoAnimal = new Animal(); // não consigo criar pois é Interface
        Animal animalGalinha = galinha;
        Animal animalGatinho = gato;
        System.out.println(" ===== POLIMORFISMO ===== ");
        animalGatinho.fazerSom();
        animalGalinha.fazerSom();
    }
}
