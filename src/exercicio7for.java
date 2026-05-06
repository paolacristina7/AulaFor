import java.util.Scanner;

public class exercicio7for {
    static void main() {
        Scanner sc= new Scanner(System.in);
        IO.println("escolha um numero");
        int num= sc.nextInt();
        int valor;

        for (int i=1;i <=10;i++){
            valor= num*i;
            IO.println(valor);
        }
    }
}
