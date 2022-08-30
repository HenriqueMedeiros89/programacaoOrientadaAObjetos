
package poo;

public class Poo {

    public static void main(String[] args) {
      Carro meuCarro = new Carro();
      
      meuCarro.setCor("Preto");
      meuCarro.setNumPortas(4);
      meuCarro.setPlaca("YPM-4262");
      meuCarro.setTipo("Corsa");
      
        System.out.println("----------Carro---------");
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("N° Portas: " + meuCarro.getnumPortas());
        System.out.println("Placa: " + meuCarro.getPlaca());
        System.out.println("Modelo: " + meuCarro.getTipo());
        
                
    Pessoa humano = new Pessoa ();
    humano.setNome("Jorjin do Pneu");
    humano.setAltura("1.81");
    humano.setCorDoCabelo("Preto");
    humano.setBiotipo("Magro");
    humano.setIdade(18);
    
        System.out.println("----------Pessoa----------");
        System.out.println("Nome: " + humano.getNome());
        System.out.println("Altura " + humano.getAltura());
        System.out.println("Cor do Cabelo: " + humano.getCorDoCabelo()); 
        System.out.println("Biotipo: " + humano.getBiotipo());
        System.out.println("Idade: " + humano.getIdade());
        
       
    }
    
}
