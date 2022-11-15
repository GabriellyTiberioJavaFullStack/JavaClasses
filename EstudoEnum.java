package Aulas;// Enums são estruturas com constantes definidas
// Dias da semana, Meses do ano, Turnos do dia, Estações
// Níveis (junior, pleno, senior), Feriados nacionais, Naipes


public class EstudoEnum {public static void main(String[] args) {
    enum DiaDaSemana {
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO,
        DOMINGO
    }

    DiaDaSemana hoje = DiaDaSemana.QUINTA; // enum.CONSTANTE
    System.out.println(hoje);

    enum NivelDev {JUNIOR, PLENO, SENIOR}
    NivelDev nivel = NivelDev.SENIOR;
    NivelDev nivel2 = NivelDev.valueOf("JUNIOR"); // o valor de name precisa ser JUNIOR, PLENO, SENIOR

    switch (nivel) {
        case JUNIOR:
            System.out.println("Seu nível é JUNIOR");
            break;
        case PLENO:
            System.out.println("Seu nível é PLENO");
            break;
        case SENIOR:
            System.out.println("Seu nível é SENIOR");
            break;
    }

    // VERSÃO ENHANCED
    switch (nivel) {
        case JUNIOR -> {
            System.out.println("Seu nível é JUNIOR");
        }
        case PLENO -> {
            System.out.println("Seu nível é PLENO");
        }
        case SENIOR -> {
            System.out.println("Seu nível é SENIOR");
        }
        default -> {
            System.out.println("Nunca executa");
        }

    }    } }