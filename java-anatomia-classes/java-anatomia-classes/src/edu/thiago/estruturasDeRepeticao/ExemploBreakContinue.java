package edu.thiago.estruturasDeRepeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <=5; numero++){
            if(numero == 3){
                //ao alcançar o 3, se depara no "Break" e o sistema para a execução do programa, não executando o restante
                //do laço de repetição
                break;

                // ao utilizar o continue; o sistema deverá continuar a execução
                //porém, não irá executar o comando abaixo
                //como se o sistema pulasse a execução, porém não parasse de executar
                // continue;
            }
            System.out.println(numero);
        }
    }
}
