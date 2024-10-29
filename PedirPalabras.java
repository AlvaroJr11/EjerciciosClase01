import java.util.Scanner;

public class PedirPalabras {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la 1 palabra:");
        String palabra1 = scanner.nextLine();

        System.out.print("Ingrese la 2 palabra:");
        String palabra2 = scanner.nextLine();

        System.out.print("Ingrese la 3 palabra:");
        String palabra3 = scanner.nextLine();

        System.out.println("Las palabras ingresadas son:");
        System.out.print(palabra1);
        System.out.print(palabra2);
        System.out.print(palabra3);

        scanner.close();



    }
    
}
