import java.util.Locale;
import java.util.Scanner;

public class start {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota01, nota02, nota03, media;
    
        // Registros das notas
        System.out.print("Digite a nota 01: ");
        nota01 = sc.nextDouble();
        System.out.print("Digite a nota 02: ");
        nota02 = sc.nextDouble();
        System.out.print("Digite a nota 03: ");
        nota03 = sc.nextDouble();

        // Estrutura condicional
        media = (nota01 + nota02 + nota03)/3;
        if (media >= 7 ){
            System.out.println("\nParabéns, você foi aprovado!");
        } else {
            if (media >= 4 && media < 6.9) {
                System.out.println("\nVocê está na recuperação!");
            } else {
                System.out.println("\nVocê está reprovado!");
            }
        }

        sc.close();
    }
}
