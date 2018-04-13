
/**
 *
 * @author camila
 */
public class ContaBancaria {

    private String nome;
    private int codigo;
    private float saldo = 0;

    public ContaBancaria(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    void depositar(float valor) {
        saldo += valor;
    }

    void sacar(float valor) {
        if (valor > saldo) {
            throw (new Erros()).new SaldoInsuficiente();
        }

        saldo -= valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContaBancaria other = (ContaBancaria) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

}
