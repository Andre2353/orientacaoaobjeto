public class Main {
    public static void main(String[] args) {

        Conta cc = new Conta_cc("001", "0001", "Joao", 100);
        Conta cp = new conta_po("002", "0001", "Maria", 200);
        Conta pj = new Conta_PJ("003", "0001", "Empresa", 300);

        System.out.print("Conta Corrente: ");
        cc.depositar(50);
        cc.sacar(30);
        cc.exibirSaldo();

        System.out.print("Conta Poupanca: ");
        cp.depositar(100);
        cp.sacar(50);
        cp.exibirSaldo();

        System.out.print("Conta PJ: ");
        pj.depositar(200);
        pj.sacar(100);
        pj.exibirSaldo();
    }
}