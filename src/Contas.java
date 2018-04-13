
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Contas {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<ContaBancaria> contas = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        int opcao = 0;
        System.out.println(" 1 - Cadastrar Conta Basica"
                + "  || 2 - Cadastrar Conta Poupanca"
                + "  || 3 - Cadastrar Conta Especial"
                + "  || 4 - Depositar"
                + "  || 5 - Sacar"
                + "  || 6 - Listar"
                + "  || 0 - Sair");
        do {
            System.out.println("Opção: ");

            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarContaBasica();
                    break;
                case 2:
                    cadastrarContaPoupanca();
                    break;
                case 3:
                    cadastrarContaEspecial();
                    break;
                case 4:
                    depositar();
                    break;
                case 5:
                    sacar();
                    break;
                case 6:
                    calcularRendimento();
                    break;
                case 7:
                    listarContas();
                    break;
                default:
                    opcao = 0;
            }
        } while (opcao != 0);

    }

    static void cadastrarContaBasica() {
        String nome = inserirNomeCliente();
        int codigo = inserirCodigoConta();

        ContaBancaria c = new ContaBancaria(nome, codigo);

        cadastrarConta(c);
    }

    private static String inserirNomeCliente() {
        System.out.println("Nome : ");
        String nome = entrada.nextLine();
        entrada.nextLine();
        return nome;
    }

    private static int inserirCodigoConta() {
        System.out.println("Código : ");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        return codigo;
    }

    private static void cadastrarConta(ContaBancaria c) {
        validarClienteCadastrado(c);

        contas.add(c);
    }

    private static void validarClienteCadastrado(ContaBancaria c) {
        if (contas.contains(c)) {
            throw (new Erros()).new CadastroJaExistente();
        }
    }

    static void cadastrarContaPoupanca() {
        String nome = inserirNomeCliente();
        int codigo = inserirCodigoConta();

        ContaBancaria c = new ContaPoupanca(nome, codigo);

        cadastrarConta(c);
    }

    static void cadastrarContaEspecial() {
        String nome = inserirNomeCliente();
        int codigo = inserirCodigoConta();

        ContaEspecial c = new ContaEspecial(nome, codigo);

        cadastrarConta(c);
    }

    private static void calcularRendimento() {
        int codigo = inserirCodigoConta();
        ContaBancaria contaPoupanca = findContaByCodigo(codigo);

        if (!(contaPoupanca instanceof ContaPoupanca)) {
            throw (new Erros().new TipoIncorreto());
        }

        ((ContaPoupanca) contaPoupanca).calcularRendimento();
    }

    private static void depositar() {
        int codigo = inserirCodigoConta();
        float valor = inserirValorConta();
        ContaBancaria contaBancaria = findContaByCodigo(codigo);

        contaBancaria.depositar(valor);
    }

    private static void sacar() {
        int codigo = inserirCodigoConta();
        float valor = inserirValorConta();
        ContaBancaria contaBancaria = findContaByCodigo(codigo);

        contaBancaria.sacar(valor);
    }

    private static float inserirValorConta() {
        System.out.println("Valor : ");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        return codigo;
    }

    private static ContaBancaria findContaByCodigo(int codigo) {
        for (ContaBancaria conta : contas) {
            if (conta.getCodigo() == codigo) {
                return conta;
            }
        }

        throw (new Erros()).new ContaNaoEncontrada();

    }

    private static void listarContas() {
        contas.forEach(c -> {
            System.out.println(c);
        });
    }

}
