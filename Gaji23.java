import java.util.Scanner;
public class Gaji23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, totGaji;
        int gaji, potGaji;
        System.out.println("Masukkan jumlah hari masuk kerja anda: ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk kerja anda: ");
        jmlTdkMasuk = input.nextInt();
        System.out.println("Masukkan besaran gaji: ");
        gaji = input.nextInt();
        System.out.println("Masukkan besaran potongan gaji: ");
        potGaji = input.nextInt();
        totGaji = (jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah "+totGaji);
    }
    
}
