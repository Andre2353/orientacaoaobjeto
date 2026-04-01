//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);
    IO.println("Digite o nome da pessoa");
    String nome = sc.next();
    IO.println("digite seu Email");
    String email =sc.next();
    if(!email.contains("@")||email.startsWith("@")|| email.endsWith("@")){
        IO.println("email invalido ");
        return;
    }
    IO.println("digite o sexo (m ou f)");
    String sexo = sc.next();
    if (!sexo.equalsIgnoreCase("F")&& !sexo.equalsIgnoreCase("M")){
        IO.println("sexo invalido");
        return;
    }

    IO.println("digite sua idade");
    if(sc.hasNextInt()){
        int idade = sc.nextInt();
        pessoa pessoa = new pessoa(nome,email,sexo,idade);
        IO.println(pessoa);
    }else {
        IO.println("idade invalida,Digite apenas numeros");
    }

}
