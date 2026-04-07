public abstract class Conta {
    protected double saldo;

        this.numero = numero;
        this.agencia = agencia;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
            saldo -= valor;
        } else {
        }
    }

    public void exibirSaldo(){
    }

    public abstract double calcularTarifaMensal();

        return numero;
    }

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