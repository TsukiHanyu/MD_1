package CekPlatnomer07341;
//mengkomplikasi kelas-kelas sesuai dengan packagenya masing-masing
import java.util.Scanner;
//mengimportkan atau mengelompokkan scanner ke program
public class CekPlatnomer07341 {
    public static void main(String[] args){ //class utama program
        Scanner scan = new Scanner(System.in);  //membuat scanner baru
        char plat07341; //variable yang digunakan dalam program
        
        System.out.println("Masukkan kode Plat : ");
        plat07341 = scan.next().charAt(0); //charAt,method yang mengembalikan
                                           //sebuah karakter atau huruf pada index tertentu dalam program
            switch(plat07341){
                case 'L':
                    System.out.println("Plat Surabaya");
                    break;
                case 'B':
                    System.out.println("Plat Jakarta");
                    break;
                case 'N':
                    System.out.println("Plat Malang");
                    break;
                case 'D':
                    System.out.println("Plat Bandung");
                    break;
                default:
                    System.out.println("Plat tidak dikenal oleh sistem");
                    
            }
    }
}