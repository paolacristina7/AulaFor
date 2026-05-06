import java.util.Scanner;

public class eleição {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("quantos integrantes vão votar");
        int eleitores = sc.nextInt();
        int votos1 = 0;
        int votos2 = 0;
        for (int eleicao = 1; eleicao <= eleitores; eleicao++) {
            IO.println("voce vai voltar em quem?");
            IO.println("/n" + "(1)lucas neto" + "/n" + "(2) gretchem");
            int voto = sc.nextInt();

            if (voto == 1) {
                votos1 += 1;
            }

            }
        }
    }
