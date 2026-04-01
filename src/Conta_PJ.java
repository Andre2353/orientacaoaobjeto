public class Conta_PJ extends Conta {

    public Conta_PJ(String numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + 1.50;

        if (getSaldo() >= valorTotal) {
            setSaldo(getSaldo() - valorTotal);
            System.out.print("Saque de R$ " + valor + " (+ taxa de R$ 1.50) realizado com sucesso! ");
        } else {
            System.out.print("Saldo insuficiente! ");
        }
    }

    @Override
    public double calcularTarifaMensal() {
        return 20.0;
    }
}