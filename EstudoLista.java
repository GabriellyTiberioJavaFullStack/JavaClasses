package Aulas;

import java.util.ArrayList;

    public class EstudoLista {
        public static void main(String[] args) {
            // cria um novo ArrayList vazio que guarda Integer
            ArrayList<Integer> numeros = new ArrayList<>();
            ArrayList<String> nomes = new ArrayList<>();
            System.out.println(numeros); //vazio

            // Adicionando elementos no array
            numeros.add(10); // equivale ao push no JS
            numeros.add(20);
            numeros.add(1000);
            System.out.println(numeros);

            System.out.println(numeros.get(2)); // numeros[2]

            // numeros[0] = 500;
            numeros.set(0, 500); //troca o n que estava no 0 e coloca outro
            System.out.println(numeros);

            // Remove o elemento na posição 0
            numeros.remove(0);
            System.out.println(numeros);

            numeros.add(1, 200); // adiciona o elemento na posição e move os demais
            System.out.println(numeros);

            numeros.add(3, 200);
            System.out.println(numeros);

            System.out.println(numeros.size()); // array.length


            for(int i = 0; i < numeros.size(); i++) { // 0, 1, 2, 3
                System.out.println(numeros.get(i));
            }

            System.out.println("---------");
            for(int numero : numeros) { // Para cada valor dentro do array ele executa o código
                System.out.println(numero);
            }

            System.out.println("---------");
            System.out.println(numeros.contains(200)); // true = achou, false = não achou

            System.out.println(numeros.indexOf(1000)); // qual a posição do 1000 na lista?
            System.out.println(numeros.indexOf(500)); // -1 = não achou o elemento
            System.out.println(numeros.indexOf(200)); // mostra o array do primeiro encontrado

            System.out.println(numeros.lastIndexOf(200)); // mostra o ultimo encontrado
        }
    }

