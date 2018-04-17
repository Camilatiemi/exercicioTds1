/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioDois;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Main {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
//        char opcao;
//        System.out.println("Digite Operador");
//        opcao = entrada.next().charAt(0);
//        if (opcao == '-') {
//            ExecutarSubtracao();
//        } else if (opcao == '+') {
//            ExecutarAdicao();
//        } else if (opcao == '/') {
//            ExecutarDivisao();
//        } else if (opcao == '*') {
//            ExecutarMultiplicacao();
//        } else {
//            throw (new Erros()).new EntradaInvalida();
//        }

      informarOpcao();
    }

    private static void informarOpcao() {
        System.out.println("Digite Operador ou 's' para sair ");

        char opcao = '@';

        do {
            System.out.println("Operação Matemática: ");

            try {
                opcao = entrada.next().charAt(0);
            } catch (Exception e) {
                System.out.println("Opção inválida: " + entrada.next());
            }

            try {
                opcao = executarOpcao(opcao);
            } catch (Exception e) {
                System.out.println("Validação: " + e.getMessage());
            }
        } while (opcao != 's');
    }

    private static char executarOpcao(char opcao) {
        switch (opcao) {
            case '+':
                ExecutarAdicao();
                break;
            case '-':
                ExecutarSubtracao();
                break;
            case '/':
                ExecutarDivisao();
                break;
            case '*':
                ExecutarMultiplicacao();
                break;
                default:
                opcao = 's';
                break;
        }
        return opcao;
    }
    private static void ExecutarAdicao() {
        double numero1 = recebeNumero1();
        double numero2 = recebeNumero2();
        Adicao a = new Adicao(numero1, numero2);
        a.executarOperacao();
        a.imprime();
    }

    private static void ExecutarMultiplicacao() {
        double numero1 = recebeNumero1();
        double numero2 = recebeNumero2();
        Multiplicacao m = new Multiplicacao(numero1, numero2);
        m.executarOperacao();
        m.imprime();
    }

    private static void ExecutarSubtracao() {
        double numero1 = recebeNumero1();
        double numero2 = recebeNumero2();
        Subtracao s = new Subtracao(numero1, numero2);
        s.executarOperacao();
        s.imprime();
    }

    private static void ExecutarDivisao() {
        double numero1 = recebeNumero1();
        double numero2 = recebeNumero2();
        Divisao d = new Divisao(numero1, numero2);
        d.executarOperacao();
        d.imprime();
    }

    public static double recebeNumero1() {
        double numero1;
        System.out.println("Valor 1 : ");
        numero1 = entrada.nextDouble();
        entrada.nextLine();
        return numero1;
    }

    private static double recebeNumero2() {
        double numero2;
        System.out.println("Valor 2 : ");
        numero2 = entrada.nextDouble();
        entrada.nextLine();
        return numero2;
    }

}
