import java.util.Scanner;

public class main {
      public static void main(String[] args) throws Exception {
        int pilihan =0;
        //kendaraan becak1 = new kendaraan("N0001XX","bajaj",10);        
        truk t1 = new truk("N 1234 YY", "HINO", 4);

        driver s1 = new driver();
        s1.no_sim = "123456";
        t1.supir = s1; 

        t1.showSIM();

        Scanner scanner = new Scanner(System.in);
        while (pilihan != 4) {
        // Menampilkan menu
        System.out.println("Menu:");
        System.out.println("1. Naik");
        System.out.println("2. Turun");
        System.out.println("3. Cek Penumpang");
        System.out.println("4. Keluar");
        
        // Meminta input dari pengguna
        System.out.print("Pilih menu (masukkan angka): ");
        pilihan = scanner.nextInt();
        
        // Proses pemilihan menu
        switch (pilihan) {
            case 1:
                System.out.println("Berapa jumlah penumpang naik?");
                System.out.print("(masukkan angka): ");
       
                int jumlah = scanner.nextInt();
 
                t1.naik(jumlah);
                break;
            case 2:
                System.out.println("Berapa jumlah penumpang turun?");
                System.out.print("(masukkan angka): ");
                int turun = scanner.nextInt();
                t1.turun(turun);
                break;
            case 3:
                t1.cek();
                t1.listpenumpang();
                break;
            case 4:
                System.out.println("Terima kasih. Program berhenti.");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih antara 1-4.");
        }
        }    
        scanner.close();

    }
}