/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camila
 */
public class ContaPoupanca extends ContaBancaria {

    float diaRendimento = 10;
    float aliquota = 0.005f;

    public ContaPoupanca(String nome, int numero) {
        super(nome, numero);
    }

    public void calcularRendimento() {
        float rendimento = getSaldo()* aliquota;
        depositar(rendimento);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" + "saldo=" + getSaldo() + '}';
    }

}
