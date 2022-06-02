public class Robo {
    String Nome;
    String Cor;
    float VelocidadeMax;
    int NivelBateriaAtual;
    float PesoCargaMax;
    String TipodeTracao;
    boolean TemAntena;

    public static void main(String[] args){
        Robo objeto1 = new Robo();
        objeto1.Nome = "Visão";

        System.out.println("Olá, meu nome é: " + objeto1.Nome);

    }

}
