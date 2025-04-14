import java.util.Locale;
import java.util.Scanner;

public class start {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario1, salario2;
        String nome1, nome2;
        int idade1 , idade2;
        char sexo1, sexo2;

        // Registros da pessoa 1
        System.out.print("Nome da primeira pessoa: ");
        nome1 = sc.nextLine();
        System.out.print("Salario da primeira pessoa: ");
        salario1 = sc.nextDouble();
        System.out.print("Digite uma idade: ");
        idade1 = sc.nextInt();
        System.out.print("Digite um sexo (F ou M): ");
        sexo1 = sc.next().charAt(0);

        // Registros da pessoa 2
        System.out.print("\nNome da segunda pessoa: ");
        sc.nextLine(); // Limpeza de Buffer
        nome2 = sc.nextLine();
        System.out.print("Salario da segunda pessoa: ");
        salario2 = sc.nextDouble();
        System.out.print("Digite uma idade: ");
        idade2 = sc.nextInt();
        System.out.print("Digite um sexo (F ou M): ");
        sexo2 = sc.next().charAt(0);
        
        // Pessoa 1
        System.out.println("\nNome 1: "+ nome1);
        System.out.println("Salario 1: "+ String.format("%.2f", salario1));
        System.out.println("Idade = "+ idade1);
        System.out.println("Sexo = " + sexo1);

        // Pessoa 2
        System.out.println("\nNome 2: "+ nome2);
        System.out.println("Salario 2: "+ String.format("%.2f", salario2));
        System.out.println("Idade = "+ idade2);
        System.out.println("Sexo = " + sexo2);
        
        sc.close();
    }
}
