package edu.thiago.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? : "+ smartTv.ligada);
        System.out.println("Canal atual: "+ smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? : "+ smartTv.ligada);
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Novo Canal: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Novo Canal: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("novo Canal: " + smartTv.canal);
    }
}
