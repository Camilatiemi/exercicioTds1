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
public final class Adicao extends OperacaoMatematica implements Operacao{
    
    public Adicao(double numero1, double numero2) {
        super(numero1, numero2);
    }


    @Override
    public void executarOperacao() {
        System.out.println("Executando Adicao");
    }

    @Override
    public void imprime() {
        double resultado = getNumero1() + getNumero2(); 
        System.out.println("Resultado" + resultado);
                
    }
}