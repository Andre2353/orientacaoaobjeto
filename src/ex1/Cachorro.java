package ex1;

public class Cachorro {
        public String nome;
        public String raca;
        protected int idade;
        public String sexo;

    public Cachorro(String nome, String raca, int idade, String sexo) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.sexo = sexo;
    }

    @Override
        public String toString() {
            return "cachorro{" +
                    "nome='" + nome + '\'' +
                    ", raça='" + raca + '\'' +
                    ", idade=" + idade +
                    ", sexo='" + sexo + '\'' +
                    '}';
        }
    }





