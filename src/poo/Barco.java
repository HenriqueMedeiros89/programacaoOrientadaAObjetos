package poo;

public class Barco {

    String nome;
    String tipo;
    String tamanho;
    String combustivel;
    String cor;
    int ano;

    void imprimeDadosDoBarco() {
        System.out.println("----------Barco---------");
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Combustivel: " + combustivel);
        System.out.println("Modelo: " + tipo);
        System.out.println("Ano: " + ano);

    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;

    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCombustivel() {
        return combustivel;

    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCor() {
        return cor;

    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;

    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
