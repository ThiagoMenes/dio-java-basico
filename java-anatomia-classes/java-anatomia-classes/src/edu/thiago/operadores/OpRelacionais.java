package edu.thiago.operadores;

public class OpRelacionais {
    public static void main(String[] args) {
        // Operadores relacionais
        //verificar se uma variável é igual a outra ==
        //verificar se uma variável é diferente da outra !=
        // maior ou igual >=
        // Menor ou igual <=
        //Menor <
        //Maior >

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        if (numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }else{
            System.out.println("A nossa condição é falsa");
        }

        //Para verificar se o valor de uma string normal e uma string presente em um objeto são iguais
        //devemos utilizar o método "equals" ex: nomeUm.equals(nomeDois), o método equals compara conteúdos
        //Obs: se for comparação entre duas Strings comuns, o simbolo de == "Mata" o serviço
        String nomeUm = "Thiago";
        String nomeDois = new String("Thiago");

        System.out.println(nomeUm.equals(nomeDois));



    }
}
