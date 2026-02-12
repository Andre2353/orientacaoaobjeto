public class pessoa {

    public String nome;
    protected String sexo ;
    public  int idade;

    public pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
