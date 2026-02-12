import ex1.Cachorro;
import ex1.Gato;
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("digite o nome do Gato ");
    String nome = sc.next();
    IO.println("digite a raca do Gato ");
    String raca = sc.next();
    IO.println("digite a idade do gato ");
    int idade = sc.nextInt();
    IO.println("Digite o sexo ");
    String sexo = sc.next();
    Cachorro Gato = new Cachorro(nome,sexo,idade,raca);
    IO.println(Gato);
}
