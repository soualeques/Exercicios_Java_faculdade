import java.util.*;

public class Par_ou_Impar {
    public static void main(String[] args) {
        try (Scanner valor = new Scanner(System.in)) {
            System.out.println("Informe um número inteiro: ");
            int numero = valor.nextInt();

            if (numero % 2 == 0){
                System.out.println("Esse é um número PAR!");
            }
            else{
                System.out.println("Esse é um numero IMPAR!");
            }
        }
        System.exit(0);
    }
}
