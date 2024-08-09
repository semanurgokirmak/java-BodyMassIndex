
package javaprojeleri;
import java.util.Scanner;

public class kitleindexi {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz : ");
        double boy = scan.nextDouble();
        
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        double kilo = scan.nextDouble();
        
        double index = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndexinix : "+ index);
    }
    
}
