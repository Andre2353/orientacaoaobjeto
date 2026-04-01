// Conta.java
public abstract class Conta {
    protected String numero;
    protected String agencia;
    protected String titular;
    protected double saldo;

    public Conta(String numero, String agencia, String titular, double saldoInicial) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ "+valor+ " realizado com sucesso! ", valor);
        } else {
            System.out.print("Valor de depósito inválido! ");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ " + valor + " realizado com sucesso ");
        } else {
            System.out.print("Saldo insuficiente ! ");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual da conta %s: R$ %.2f ", numero, saldo);
    }


    public abstract double calcularTarifaMensal();

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}