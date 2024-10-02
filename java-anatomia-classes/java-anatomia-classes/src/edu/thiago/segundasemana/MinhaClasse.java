package edu.thiago.segundasemana;
public class MinhaClasse {
    
   public static void main(String [] args) {
    //ao inserir Final no início de uma variável, sugere que um valor nunca será alterado   
      final int ano = 2021;

    //Toda Variável em Java deve seguir a seguinte estrutura
    /// Tipo NomeBemDefinido = Atribuição (Opcional em alguns casos)
     // Exemplo: int idade = 23;
     double altura = 1.70;
     String meuNome = "Thiago";
     boolean simNao = true;

     // Declarando Métodos em Java segue uma estrutura bem simples:
     ///TipoRetorno NomeObjetivoNoInfinitivo Parametros(s) => opcional a depender do método
     ////Exemplo
     /////int somar (int numeroUm, int numero2)
     ////String formatarCep (long cep)
    String primeiroNome = "Thiago";
    String segundoNome = "Meneses";
     // Chamada de um método: Tipo VariávelBemDefinida = nomeDoMetodo (Parâmetros) => opcional
    String  nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
   } 

//Declarando um Método:
// public static Tipo nomeMétodo (Parâmetros"se houver"){}
   public static String nomeCompleto (String primeiroNome, String segundoNome){
    //Concatenando usando a função "concat"
       return primeiroNome.concat(" ") .concat(segundoNome);
       //pode ser feito, da seguinte forma também =>
       //return primeiroNome + " " + segundoNome;
   }

}
