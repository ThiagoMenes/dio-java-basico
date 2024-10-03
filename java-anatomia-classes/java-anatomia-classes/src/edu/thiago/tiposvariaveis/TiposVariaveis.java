package edu.thiago.tiposvariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {

        /// Tipos Primitivos 

        //forma correta de atribuir um valor milhar para uma variável do tipo double
        double salarioMinimo = 2500;
        //caso tenha algum centavo ou decimal após, deve-se adicionar o ponto
        salarioMinimo = 2500.35;

        //int e Long não podem começar com zero, se este for o caso, considere utilizar uma String
        // o Tipo float deve finalizar com um F ou f, senão, gera erro de compilação. Double não precisa
        // o Tipo Long deve finalizar com um L para informar que o literal não será Int e sim um Long
        float pi =  3.14f;
        long longo = 315L;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // *Não é Recomendado* para o numeroNormal(int) "Caber" em numeroCurto2(short), deve se realizar um "Casting" para adaptar o Valor Int para caber em uma Short
        short numeroCurto2 = (short) numeroNormal;

        //'final' define que um valor nunca poderá mudar ex:  final tipoVariavel
        // por Convenção, Constantes são sempre escritas em CAIXA ALTA
        
        final double VALOR_DE_PI = 3.14;
        //forma de representar texto = String nome = "texto"
        String meuNome = "Thiago";
    }
}
