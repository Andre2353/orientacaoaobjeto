public class pessoa {
    public String name;
    public String email;
    protected String sexo;
    public int idade;

    public pessoa(String name, String email, String sexo, int idade) {
        this.name = name;
        this.email = email;
        this.sexo = sexo;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
