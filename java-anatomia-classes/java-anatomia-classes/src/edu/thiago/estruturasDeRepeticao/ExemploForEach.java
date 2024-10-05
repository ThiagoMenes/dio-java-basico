package edu.thiago.estruturasDeRepeticao;

public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        //Forma Abreviada de For Each
        for (String aluno : alunos){
            System.out.println("Nome do Aluno é: " + aluno);
        }
    }
}
