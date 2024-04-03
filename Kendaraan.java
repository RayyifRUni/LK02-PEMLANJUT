import java.util.Scanner;
class driver{
    public String no_sim;
}

class kendaraan{
    public String merk, platNomor, warna,angka;
    public int jumlahPenumpang,maxPenumpang, indexPenumpang ;

    public driver supir;
    public penumpang[] daftarPenumpang ;
    Scanner scanner = new Scanner(System.in);

    public kendaraan(String pn, String m, int max){
        this.merk = m;
        this.platNomor = pn;
        this.jumlahPenumpang = 0;
        this.maxPenumpang = max;
        this.indexPenumpang = 0;
        this.angka = "1";
        this.daftarPenumpang = new penumpang[max]; 

        System.out.println("Halo saya objek dari kelas Kendaraan dengan plat nomor : " + this.platNomor);
        cek();
    }

 
    public void cek(){
        System.out.println("Penumpang saat ini: "+this.jumlahPenumpang);
      
    }
    public void listpenumpang(){
        System.out.println("list nama penumpang");
        for (int i = 0; i < indexPenumpang; i++) {
            System.out.println(daftarPenumpang[i].nama);
    }
}


    public void naik(int jumlah){
        System.out.println("ada penumpang mau naik: "+jumlah);
   
        int current = this.jumlahPenumpang;
        System.out.println("masukkan nama penumpang");
        if (jumlah+current >this.maxPenumpang) {
            int maksimal = jumlah+current-maxPenumpang;
       for(int i=0 ,f= maxPenumpang-current; i<f;i++){
        String masukkan = scanner.nextLine();
        daftarPenumpang[indexPenumpang++]=new penumpang(masukkan);
 
        this.jumlahPenumpang ++;
       }
       cek();
       listpenumpang();
        System.out.println("tidak semua penumpang naik menyisakan :"+ maksimal );
     
    }
    else if (jumlah+ current <= maxPenumpang){
        for(int i=0 ; i<jumlah;i++){
            String masukkan = scanner.nextLine();
            daftarPenumpang[indexPenumpang++]=new penumpang(masukkan);
        
            this.jumlahPenumpang ++;}
        cek();
        listpenumpang();

    }
    }
    public void turun(int turun){
        System.out.println("ada penumpang mau turun: "+turun);
        int current = this.jumlahPenumpang;
        if (current - turun < 0){
            int d= turun-current;
            for(int i=0 ; i<current;i++)
            indexPenumpang--;
       this.jumlahPenumpang -=1;
            System.out.println("semua penumpang turun meninggalkan");
            System.out.println("dan "+ d + " makhluk ghoib ikut turun");
        }
        else{
            for(int i=0 ; i<turun;i++)
            indexPenumpang--;
            this.jumlahPenumpang-=1;
       
            System.out.println("penumpang berhasil turun");
        }
        cek();
    }


    public void showSIM(){
        System.out.println("sim driver : "+ this.supir.no_sim);
    }
    
}


