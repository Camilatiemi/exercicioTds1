/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioDois;

/**
 *
 * @author camil
 */
public class Erros extends RuntimeException {

    private String mensagem;

    public Erros() {
    }

    public Erros(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public class EntradaInvalida extends Erros {

        public EntradaInvalida() {
            super("Entrada Invalida !");

        }

    }

}
