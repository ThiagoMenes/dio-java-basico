package edu.thiago.operadores;

public class OpLogicos {
    public static void main(String[] args) {
        //Operadores lógicos && "E"
        // || => "Ou"
        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }else if(condicao1 || condicao2){
            System.out.println("Ao menos uma das condições é verdadeira");
        }else{
            System.out.println("Ambas as condições são falsas");
        }

        //outro exemplo de aplicação
        if(condicao1 && ( 7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }

    }
}
