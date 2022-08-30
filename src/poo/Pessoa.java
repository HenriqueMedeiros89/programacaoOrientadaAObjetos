package poo;

public class Pessoa {

    String nome;
    String altura;
    String corDoCabelo;
    String biotipo;
    int idade;

    void imprimeDadosPessoa() {
        System.out.println("----------Pessoa----------");
        System.out.println("Nome: " + nome);
        System.out.println("Altura " + altura);
        System.out.println("Cor do Cabelo: " + corDoCabelo);
        System.out.println("Biotipo: " + biotipo);
        System.out.println("Idade: " + idade);

    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAltura() {
        return altura;

    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getCorDoCabelo() {
        return corDoCabelo;

    }

    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    public String getBiotipo() {
        return biotipo;

    }

    public void setBiotipo(String biotipo) {
        this.biotipo = biotipo;
    }

    public int getIdade() {
        return idade;

    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
