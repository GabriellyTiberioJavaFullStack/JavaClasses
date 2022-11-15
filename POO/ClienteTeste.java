package Aulas.POO;

import java.time.LocalDate;

public class ClienteTeste {
    public static void main(String[] args) {
    Cliente cliente1 = new Cliente(1, "Felipe", "José", LocalDate.of(1993, 5, 25), 1.85, 95.0);

    System.out.println(cliente1.getNome());
    System.out.println(cliente1.getSobrenome());
    System.out.println(cliente1.getNomeCompleto());
    cliente1.setAltura(50);
    cliente1.setAltura(1.5);
}
}
