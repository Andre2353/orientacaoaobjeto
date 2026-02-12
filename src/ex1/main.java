import ex1.Cachorro;

import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Digite o nome do cão");
    String nome = sc.next();
    IO.println("Digite a idade");
    int idade = sc.nextInt();
    IO.println("Digite o sexo");
    String sexo = sc.next();
    IO.println("Digite a raça");
    String raca = sc.next();

    Cachorro cachorro = new Cachorro(nome,sexo,idade,raca);
    IO.println(cachorro);





}