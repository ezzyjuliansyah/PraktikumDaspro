import java.util.Scanner;
public class ifCetakKRS09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("---Cetak KRS Siakad---");
        System.out.print("Apakah UKT sudah lunas? (true/false):");
        boolean uktLunas = sc.nextBoolean();

        //Pakai ternary operator langsung ke variabel pesan
        String pesan = (uktLunas)
            ? "Pembayaran UKT Terverifikasi. Silahkan cetak KRS dan minta tanda tangan DPA"
            : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";

            //output hasil
            System.out.println(pesan);
    }
}