package trabalhando_heranca;
//trabalhando herença
public class Pessoa {
    String sexo;
    String corPele;
    int idade;

    public void comer(){
        System.out.println("Preciso comer!");
    }

    public void sono(){
        System.out.println("Estou com sono!");
    }
    
    // Cria o método "estudar()" para ser herdada em "Estudante".
    public void estudar(){
        System.out.println("O/A estudante vai estudar!");
    }

    // Exemplo de método privado. Este método não pode ser herdado.
    private void correr(){
        System.out.println("Necessario correr para se exercitar!");
    }
}
