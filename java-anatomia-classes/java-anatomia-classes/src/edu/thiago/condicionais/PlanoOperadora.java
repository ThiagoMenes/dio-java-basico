package edu.thiago.condicionais;
import java.util.Locale;
import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite um Plano: ");
        String plano = scanner.next();

        switch (plano) {
            case "T":
                System.out.println("5Gb Youtube");
                
            case "M":
                System.out.println("Whats e Instagram Grátis");
                
            case "B":
                System.out.println("100 minutos de ligação");
                break;
            default:
                System.out.println("Indefinido");
                break;
        }
        scanner.close();
    }
}
