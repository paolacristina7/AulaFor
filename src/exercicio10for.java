import java.util.Scanner;

public class exercicio10for {
    static void main() {
       double valor=0;
        Scanner sc= new Scanner(System.in);
        for (int bemdez =1; bemdez <=5;bemdez++) {
            IO.println("Fala ai tua nota");
            double nota = sc.nextInt();
            valor += nota;
        }
            IO.println(valor/5);
    }
}
