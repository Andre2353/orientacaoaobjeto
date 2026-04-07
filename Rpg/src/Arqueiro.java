import java.util.Random;

public class Arqueiro extends Personagem {

    Random random = new Random();

    public Arqueiro(String nome) {
        super(nome, 90, 22);
    }

<<<<<<< HEAD
    public void tiro_certeiro(Personagem inimigo) {
        int dano = this.getAtaque();
=======
    public void esquivar() {
        esquiva = true;
        System.out.println(" Esquivando! Pode evitar o próximo ataque.");
    }
>>>>>>> a28924b76a7b6096d9629b01169193cc9f4019af


        int chance = random.nextInt();

        if (chance < 70) {
            dano *= 3;
            System.out.println("atingido");
        }

        inimigo.receberDano(dano);
        System.out.println("Você causou " + dano + " de dano!");
    }
}
