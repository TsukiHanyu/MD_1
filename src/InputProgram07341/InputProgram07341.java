package InputProgram07341;
//mengkomplikasi kelas-kelas sesuai dengan packagenya masing-masing
import java.util.Scanner; 
//mengimportkan atau mengelompokkan scanner ke program

public class InputProgram07341 {
    public static void main(String[] args){     //class utama program
        Scanner scan = new Scanner(System.in);  //mencetak hasil dari data-data
                                                //membuat scanner baru
        
        System.out.println("INPUT");
        System.out.println("Masukkan Nama : ");
        String nama07341 = scan.nextLine(); //konversi dari tipe string
        System.out.println("Masukkan Umur : ");
        int umur07341 = scan.nextInt(); //konversi dari tipe integer
        
        System.out.println("\nOUTPUT");
        System.out.println("Nama :" + nama07341);   //mencetak nama
        System.out.print("Umur :");
        System.out.print(umur07341); //mencetak umur
        
    }
}