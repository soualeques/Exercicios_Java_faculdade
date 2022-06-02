class Animal {
    String Nome;
    int Patas;
    String Raca;
    void Registro(String nome, int patas, String raca){
        Nome = nome;
        Patas = patas;
        Raca = raca;
    }

    void exibirInformacoes(){
        System.out.println("Animal: " + Nome + "...tem " + Patas + " patas e é sua raça é: " + Raca);
    }


    public static void main(String[] args){
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        animal1.Registro("Aranha", 8, "Aracnídeo");
        animal2.Registro("Leão", 4, "Felino");
        animal1.exibirInformacoes();
        animal2.exibirInformacoes();
}
}




