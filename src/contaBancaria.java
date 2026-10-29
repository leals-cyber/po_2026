
public class contaBancaria {

    String titular;
    int numeroConta;
    double saldo;

    public contaBancaria() {
        saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado!");
        } else {
            System.out.println("Deposito negado!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Erro no saque!");
        }
    }

    public void verSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
