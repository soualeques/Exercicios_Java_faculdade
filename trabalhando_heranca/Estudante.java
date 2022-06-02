package trabalhando_heranca;

public class Estudante extends Pessoa {
    // Cria um método dentro da classe depois que mostrar todos os exemplos
    // Nesse novo método, utilizar o "@Override" para sobreescrever o outro método que esta sendo usado.
    // Quando o aluno for para a faculdade ele exibirá outra mensagem.

    @Override
    public void estudar(){
        System.out.println("O/A estudante vai para a faculdade.");
    }
}
