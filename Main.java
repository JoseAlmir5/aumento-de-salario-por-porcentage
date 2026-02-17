package ContrutoresMultiplos.application;

import java.util.Locale;
import java.util.Scanner;

import ContrutoresMultiplos.application.entitites.Funcionario;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do funcionario: ");
        String nomeF = sc.nextLine();
        System.out.println("Informe o salario R$:");
        double salarioF = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nomeF, salarioF);

        System.out.println(funcionario);

        System.out.println();
        System.out.println("Adicione a porcentagem de aumento: (%...) ");
        int porcentagem = sc.nextInt();
        funcionario.aumentarSalario(porcentagem);

        System.out.println();
        System.out.println("Atualizado | " + funcionario);
        System.out.println("Aumento de salario R$:" + String.format("%.2f", funcionario.getSalario()));


        sc.close();
    }
}
