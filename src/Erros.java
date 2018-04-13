/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camil
 */
public class Erros extends RuntimeException {


    private String mensagem;
    public Erros(){}

    public Erros(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public class CadastroJaExistente extends Erros {

        public CadastroJaExistente() {
            super("Conta já existente !");

        }

    }
    public class SaldoInsuficiente extends Erros {

        public SaldoInsuficiente() {
            super("Saldo insuficiente");

        }

    }
    public class LimiteUltrapassado extends Erros {

        public LimiteUltrapassado() {
            super("O valor informado é maior do que o limite !");

        }

    }
    public class ContaNaoEncontrada extends Erros {

        public ContaNaoEncontrada() {
            super("Conta não encontrada !");

        }

    }

}
