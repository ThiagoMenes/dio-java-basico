package edu.thiago.estruturasDeRepeticao;
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0){
            Double valorDoce = valorAleatorio();

            if(valorDoce > mesada){
                valorDoce = mesada;
            }

            System.out.println("Doce do Valor: " + valorDoce + " Adicionado no Carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
}
    //Criação de Método para auxiliar na geração do Valor Aleatório
    //utilizando a Classe importada: ThreadLocalRandom
    private static double valorAleatorio(){
        //esta classe foi configurada para fornecer um valor aleatório entre 2 e 8
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
