package edu.thiago.terminal;

public class AboutMe {
    public static void main(String[] args) {
        //Os argumentos começam com indice 0
        //abaixo, temos variáveis que receberão elementos de nosso Array Main
        // para executar no terminal e inserir os parâmetros, devemos fazer o seguinte:
        //java edu.thiago.terminal.AboutMe Thiago Meneses 25 1.70
        //Após o comando java e o caminho do arquivo class, inserimos os parâmetros, separados por espaço
        //Obs: podemos inserir os argumentos(args) via IDE, através do menu run > add configuration
        //para inserir os args padrão para execução
        /** pode ser inseridos os argumentos abaixo do parâmetro "mainClass" como:
         * "args": [
         * "Thiago",
         * "Meneses",
         * "25",
         * "1.70"
         * ]
         */
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo "+ nome+" " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "m");
    }
}
