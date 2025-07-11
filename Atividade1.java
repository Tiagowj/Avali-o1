import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = sc.nextDouble();
        }

        double media1Semestre = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        double media2Semestre = (notas[4] + notas[5] + notas[6] + notas[7]) / 4;
        double mediaFinal = (media1Semestre + media2Semestre) / 2;

        System.out.println("\nResultados:");
        for (int i = 0; i < 8; i++) {
            System.out.println((i + 1) + "º Bimestre: " + notas[i]);
        }

        System.out.printf("1º Semestre: %.1f\n", media1Semestre);
        System.out.printf("2º Semestre: %.1f\n", media2Semestre);
        System.out.printf("Média Final: %.1f\n", mediaFinal);
        
        sc.close();
    }
}
