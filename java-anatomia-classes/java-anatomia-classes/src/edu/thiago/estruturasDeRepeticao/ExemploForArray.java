package edu.thiago.estruturasDeRepeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for (int x = 0; x<alunos.length; x++){
            System.out.println("O Aluno no indice " + x + " é: " + alunos[x]);
        }
    }
}
