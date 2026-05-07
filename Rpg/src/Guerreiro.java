public class Guerreiro extends Personagem {

    private boolean defendendo = false;

    public Guerreiro(String nome) {
        super(nome, 120, 25);
    }

    public void defender() {
        defendendo = true;
        System.out.println("Defendido");
    }

    @Override
    public void receberDano(int dano) {
        if (defendendo) {
            dano /= 10;
            defendendo = false;
            System.out.println("Dano reduzido para " + dano);
        }
        super.receberDano(dano);
    }
}