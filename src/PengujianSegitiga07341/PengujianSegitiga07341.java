package PengujianSegitiga07341;
//mengkomplikasi kelas-kelas sesuai dengan packagenya masing-masing
import java.util.Scanner;
//mengimportkan atau mengelompokkan scanner ke program
public class PengujianSegitiga07341 {
    public static void main(String[] args){ //class utama program
        int a07341,b07341,c07341;   //variable yang digunakan untuk program
        Scanner scan = new Scanner(System.in);
        //membuat scanner baru
        System.out.println("Masukkan ketiga panjang sisi segitiga");
        a07341 = scan.nextInt();    //masukkan nilai a
        b07341 = scan.nextInt();    //masukkan nilai b
        c07341 = scan.nextInt();    //masukkan nilai c
        //fungsi math.pow menghitung bilangan berpangkat (angka,pangkat)
        if (Math.pow(c07341,2) < Math.pow(a07341,2) + Math.pow(b07341,2)){
            System.out.println("Segitiga Lancip");
        }else if (Math.pow(c07341,2) > Math.pow(a07341,2) + Math.pow(b07341,2)){
            System.out.println("Segitiga Tumpul");
        }else {
            System.out.println("Segitiga Siku-Siku");
        }
    }
}
