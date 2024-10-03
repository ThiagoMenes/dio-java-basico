package edu.thiago.operadores;

public class Operadores {
    public static void main(String[] args) {
        //operadores de atribuição, o símbolo de igualdade "="

        // Operadores Aritméticos => Adição + , subtração - , multiplicação * , divisão /, módulo(resto divisão) %
        // obs: quando o operador de adição (+) é utilizado em variáveis do tipo Texto, realizará a concatenação de textos
        String nomeCompleto = "Linguagem" + " Java";
        System.out.println(nomeCompleto);

        //teste concatenação numero + texto em Strings

        String concatenacao = "?";

        System.out.println(concatenacao);

        // quando se utiliza o op. de atribuição + com numeros literais, o sistema realiza a soma
        // ao utilizar o valor somado com o 1 entre aspas, ele insere o valor ao final da soma.
        //ex: 31
        concatenacao = 1 + 1+ 1 + "1";
        System.out.println(concatenacao);

        //neste caso, após a primeira aspas, ele realiza apenas a concatenação
        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao); 

        //Ao utilizar uma expressão em evidência = () entre parênteses, mesmo que o op. de concatenação
        //esteja no início da sentença, o sistema realiza a soma dos números primeiro, antes de concatenálos ao fim
        //ex:
        concatenacao = "1" + (1 + 1 + 1 );
        System.out.println(concatenacao);

        //Operadores unários - e +
        // Op. Unários de Decremento(--) e Incremento(++) de Valor 

        int numero = 5;
        //negando o número "temporariamente" para mostrar no terminal, o número ainda mantém seu valor original
        System.out.println( - numero);
        //negando o número definitivamente, transformando o mesmo em negativo.
        numero = - numero;
        System.out.println(numero);

        //tornando o número em positivo novamente      
        numero = numero * -1;
        System.out.println(numero);

        //incrementar o número em 1, obs: a incrementação pode ser usada como um prefixo ex: ++ numero;
        numero++;
        System.out.println(numero);

        //decrementar o número em 1, obs: a decrementação pode ser usada tbm como prefixo ex: -- numero;

        numero--;
        System.out.println(numero);

        //negando uma variável boolean
        //utilizar o símbolo '!'
        boolean variavel = true;
        System.out.println(!variavel);


        //operador ternário, funciona como um IF normal, porém, sua estrutura é escrita em apenas uma única linha
        //estrutura "? : "
        //<Expressão condicional> ? <Caso Condição seja True> : <Caso condição seja false>
        
        int a,b;

        a = 5;
        b = 6;
        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);


        int inteiro = a == b ? 1 : 0;

        // if(a == b){
        //     resultado = "verdadeiro";
        // }else{
        //     resultado = "falso";
        // }
        // System.out.println(resultado);
    
    
    }


}
