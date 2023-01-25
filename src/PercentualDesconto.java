import java.util.*;

public class PercentualDesconto {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Informe o valor marcado do produto");
        int M = input.nextInt();

        System.out.println("Informe o valor do produto com desconto");
        int S = input.nextInt();  

       int desconto = (int) (((double)M - S) / M * 100);
        System.out.println("O desconto foi de " + desconto + "%");
        input.close();
    }
}
