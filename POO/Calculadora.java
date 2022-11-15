package Aulas.POO;

public class Calculadora {  // atributo estático
    public static final double PI = 3.14;
    // final = impede a alteração do valor de PI

    // Método estático
    // Não pertence ao objeto, mas sim a classe
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        return a / b;
    }

    // main = auto-executavel
    public static void main(String[] args) {
        double resultadoSoma = Calculadora.soma(1, 2);
        double resultadoSub = Calculadora.subtracao(10, 5);
        double resultadoMult = Calculadora.multiplicacao(10, 2);
        double resultadoDiv = Calculadora.divisao(10, 5);
        System.out.println(Calculadora.PI);
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(144));
        System.out.println(Math.cbrt(8));
    }
}
