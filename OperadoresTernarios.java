import java.util.Scanner;

public class OperadorTernario{
     
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua indade:");
        int idade = entrada.nextInt();

        String indicacao = (idade >= 18)?"adulto.":"crianca/adolecente.";
        System.out.print(indicacao);
    

    }
}