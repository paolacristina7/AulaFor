import java.util.Scanner;

public class senhacelular {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int senha = 0;
        do {
            IO.println("digite uma senha");
            senha = sc.nextInt();
            if (senha != 1234) {
                IO.println("senha incorreta, tente novamente");
            }
        } while (senha != 1234);
        IO.println("senha correta, desbloqueou");
    }
}