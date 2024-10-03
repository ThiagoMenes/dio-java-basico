public class Metodos {
    //Exemplo de estrutura de método
    ///Visibilidade TipoDeRetorno NomeMetódo(ParâmetrosQueRecebe)
    public double somar(int num1, int num2){
        double soma = num1 + num2;
        return soma;
    }
    //Método que não retorna nada, apenas recebe uma String como parâmetro e imprime na tela
    public void imprimir(String texto){
        System.out.println(texto);
    }
    public static void main(String[] args) {
        //Métodos são como funções ou sub-rotinas
        //Atributos são como variáveis
        //Critérios para nomeação de métodos:
        ///Devem ser nomeados como Verbo, ex: acelerar, buzinar
        ///Seguir o padrão camelCase, ex: calcularImposto
        // em Java não existem métodos globais, todos os métodos
        //devem ser definidos dentro de uma Classe
        // a Nomenclatura dos métodos só deve possuir um Verbo, Ex: calcular e não calcularImprimir

        ///Qual a proposta principal do método?
        //qual o tipo de retorno esperado após executar o método?
        ///Quais os parâmetros serão necessários para execução do método?
        /// O método possui o risco de apresentar alguma exceção?
        /// Qual a visibilidade do método?

        

    }
}
