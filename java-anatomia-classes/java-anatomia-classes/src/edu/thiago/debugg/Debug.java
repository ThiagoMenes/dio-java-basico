package edu.thiago.debugg;

public class Debug {
    public static void main(String[] args) {
        System.out.println("Inicio do Programa no método Main");
        a();
        System.out.println("Finalização do Programa no método Main");
    }
    
    static void a(){
        System.out.println("Entrou no Método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b(){
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++){
            System.out.println(i);
        }
        c();
        System.out.println("Finalizou o método b.");
    }

    static void c(){
        System.out.println("Entrou no método c.");
        Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}
