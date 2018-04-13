/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camila
 */
public class ContaEspecial extends ContaBancaria {

    float limite = 100f;

    public ContaEspecial(String nome, int numero) {
        super(nome, numero);
    }

    @Override
    void sacar(float valor) {
        if (valor > limiteSaque()) {
            throw (new Erros()).new LimiteUltrapassado();
        }

        float novoSaldo = getSaldo() - valor;
        setSaldo(novoSaldo);
    }

    private float limiteSaque() {
        return getSaldo() + limite;
    }

}
