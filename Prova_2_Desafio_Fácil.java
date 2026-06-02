import java.util.Scanner;
public class prova4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
       double comandoPiloto = ler.nextDouble();
        boolean  garraEmMovimento = true;

garraEmMovimento = (comandoPiloto > 0.1 || comandoPiloto <-0.1);
System.out.println("=== SMARTDASHBOARD === ");

System.out.println("");
System.out.println("A garra esta movendo  " + garraEmMovimento);
ler.close();


System.out.println("");
System.out.println("GARRA COLETANDO   " + garraEmMovimento );

System.out.println("");
System.out.println("A VELOCIDADE Q ELE ESTÁ:  " +  comandoPiloto );

System.out.println("");
    }
}
