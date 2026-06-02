import java.util.Random;
public class prova6 {
public static void main(String[] args) {
    
    System.out.println("========PAINEL=======");
    System.out.println("");
    System.out.println("sensor para mapear");
    System.out.println("");

Random gerador  = new Random ();
int num = gerador.nextInt();
Boolean sensor = (num % 2 == 0);

if (sensor){
    System.out.println("sensor ok");
}
else {
    System.out.println("Sensor desativado");
}
if (! sensor){
    System.out.println("");
}
else{
    for (int i =1; i <= 6; i++){
        System.out.println("Executando a leitura " + i + " de 6");
 }    
}

 }

}