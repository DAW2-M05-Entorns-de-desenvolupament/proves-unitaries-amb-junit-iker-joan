import java.util.Scanner;

public class programajoaniker {
    
    public static void main(String[] args){
       Scanner reader = new Scanner(System.in);
       int numero1 = 0;
       int numero2 = 0;
    System.out.println("Introduce el primer número:");      
    numero1 = reader.nextInt();
      
    System.out.println("Introduce el segundo número:");
    numero2 = reader.nextInt();
        int resultado = numero1+numero2;
    System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado);
    }

   public static void perell(String[] args){

     Scanner keyb = new Scanner(System.in);
        System.out.println("Introdueix un nombre: ");
        int Num1 = keyb.nextInt();
        if (Num1%2 == 0) {
            System.out.println("És parell");
        }
        else {
            System.out.println("És imparell");
        }
   }
}
