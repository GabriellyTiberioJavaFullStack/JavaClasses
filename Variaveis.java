package Aulas;

public class Variaveis {
    // Execução do nosso programa Java
    public static void main(String[] args) {
        System.out.println("oioi"); //'console.log' do java

        //Aulas.Variaveis em java
        //fortemente tipado e estaticamente tipado (n consegue mudar o tipo de variavel, quando selecionado)
        int idade = 30; //int tem limite
        double salario = 8779.98; //equivale ao 'float'
        float nota = 88.9f; //para o float 'funcionar' tem que usar o f
        long populaçãoTerra = 7_900_000_000l; // numeros longos que o int não aceita, precisa do l no final
        boolean simounao = true;
        int i = 1, j = 0, k = 1000; //multi variaveis
        String nomeCompleto = "gabs"; //sempre aspas duplas, aspas simples apenas 1 caracteres

        int teste = 10;
        teste = 9; //reatribuição de variaveis

        final int teste2 = 200; //equivale ao const

        //operadores
        int a = 10;
        int b = 5;

        int soma = a + b;
        int sub = a - b;
        int multi = a * b;
        int div = a / b;

        System.out.println("Os resultados são " + soma + " e " + sub + " e " + multi + " e " + div);

        int sete = 7;
        int dois = 2;

        System.out.println(sete / dois);

        //Math
        double x = Math.sqrt(144);
        double y = Math.pow(5, 2);
        System.out.println((Math.PI));

        int pi2 = (int) Math.PI; //converte para int

        double resultado = sete / (double) dois;

        //Operadores 2
        int valor = 5;
        valor++;
        valor--;
        valor += 10;

        // Operadores relacionais
        boolean teste1 = 5 > 1; // true
        boolean teste3 = 5 < 1; // false
        boolean teste4 = 5 == 5; // true
        boolean teste5 = 5 != 1; // true
        boolean teste6 = 6 >= 6; // true
        boolean teste7 = 5 <= 9; // true

        // Operadores lógicos
        boolean teste8 = true && false; // false
        boolean teste9 = true || false; // true
        boolean teste10 = (5 > 10) && (10 < 5); // false
        boolean teste11 = (10 >= 0) || (1 < 5); // true
        boolean teste12 = (5 > 1); // true
        boolean teste13 = !teste12; // false (!inverte de true para false
    }
}