package edu.thiago.condicionais;
import java.util.Locale;
import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite um tamanho de camiseta: ");
        String tamanho = scanner.next();

        switch (tamanho) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Indefinido");
                break;
        }
    }
}
