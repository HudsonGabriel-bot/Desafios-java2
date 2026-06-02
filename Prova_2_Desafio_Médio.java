import java.util.Scanner;
import java.util.Random;
public class prova5 {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         Random numAleatorio  = new Random();

         double temperatura;
         double velocidade;
         
         System.out.println("Qual a velocidade?");
         velocidade = ler.nextDouble();
         temperatura = numAleatorio.nextDouble() / 0.010;

         if (temperatura >= 80) {
            System.out.println("ALERTA: Motor superaquecido! Reduz a pontencia! Bobão");
         }
else if ( temperatura >= 50 && temperatura <= 79){
    System.out.println("Aviso: Temperatura elevada, monitore o painel");
}
else {
    System.out.println("Motores operando temperatura segura ");
}


ler.close();
    }
}
