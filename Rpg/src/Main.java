import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1-Mago  2-Guerreiro  3-Arqueiro");
        int escolha = sc.nextInt();
        sc.nextLine();

        System.out.print("nome: ");
        String nome = sc.nextLine();

        Personagem jogador;

        switch (escolha) {
            case 1:
                jogador = new Mago(nome);
                break;
            case 2:
                jogador = new Guerreiro(nome);
                break;
            case 3:
                jogador = new Arqueiro(nome);
                break;
            default:
                jogador = new Guerreiro(nome);
        }

        Personagem inimigo = new Guerreiro("Inimigo : Gurreiro3");

        while (jogador.getVida() > 0 && inimigo.getVida() > 0) {

            System.out.println("1-Atacar  2-Habilidade");
            int ataque = sc.nextInt();

            switch (ataque) {
                case 1:
                    int dano = jogador.getAtaque();
                    inimigo.receberDano(dano);
                    System.out.println(
                            "Você causou " + dano + " de dano!");
                    break;

                case 2:
                    switch (escolha) {
                        case 1:
                            ((Mago) jogador).lancarMagia(inimigo);
                            break;

                        case 2:
                            ((Guerreiro) jogador).defender();
                            break;

                        case 3:
                            ((Arqueiro) jogador).tiro_certeiro(inimigo);
                            break;
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }


            if (inimigo.getVida() <= 0) break;
            int danoInimigo = inimigo.getAtaque();
            jogador.receberDano(danoInimigo);
            System.out.println(" Inimigo causou " + danoInimigo + " de dano!");

            System.out.println(" Sua vida: " + jogador.getVida());
            System.out.println(" Vida do inimigo: " + inimigo.getVida());
        }


        if (jogador.getVida() <= 0) {
            System.out.println("vc perdeu");
        } else if (inimigo.getVida() <= 0) {
            System.out.println("vc ganhou ");
        }
        ;
        sc.close();

    }
}