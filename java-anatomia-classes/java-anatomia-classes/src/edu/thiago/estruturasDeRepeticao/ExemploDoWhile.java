package edu.thiago.estruturasDeRepeticao;
import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            //executando repetidas vezes até que alguém atenda
            System.out.println("Telefone tocando");
        }while(tocando());

        System.out.println("Alô !!!");
    }
    private static boolean tocando(){
        //possuo um valor aleatório entre 1 e 3
        //caso este valor aleatório seja 1, significa que atendeu
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);

        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
