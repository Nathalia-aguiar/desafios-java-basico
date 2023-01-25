import java.util.Scanner;

public class FilaAtendimento {
    public static void main(String[] args) {
        String[] nomesFila = new String[3];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            nomesFila[i] = leitor.nextLine();
        }

        for (int i = 0; i < nomesFila.length; i++) {
            System.out.println(nomesFila[i] + " - esta na posicao: " + (i + 1));
        }

        leitor.close();

    }
}
