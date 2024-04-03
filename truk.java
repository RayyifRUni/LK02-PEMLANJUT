
import java.util.Scanner;
class truk extends kendaraan{
    Scanner in = new Scanner(System.in);
    private float maxLoadKg;
    private float capacity;
    private float beratSekarang;
    private float volumeSekarang;
    public truk(String pn, String m, int max){
        super(pn, m, max);
    }

    public void setKapasitas(int kapasitas){
        this.maxLoadKg = kapasitas;
    }

    public void cekberat(){
        System.out.println("Penumpang saat ini: "+this.maxLoadKg);
    
}

public void naikbarang(float berat, float volume) {

        if (!cekKeberatan(berat, beratSekarang) && !cekKepenuhan(volume, volumeSekarang)) {
            beratSekarang += berat;
            volumeSekarang += volume;
            System.out.println("Barang berhasil dimasukkan ke truck");
            System.out.println("Load saat ini "+beratSekarang+" kg per "+maxLoadKg+" kg");
            System.out.println("Kapasitas saat ini "+volumeSekarang+" m2 per "+capacity+" m2");
        } else {
            System.out.println("Berat atau ruangan sisa di truck tidak cukup untuk memasukkan barang.");
        }
   
    }
    private boolean cekKeberatan(float berat, float beratSekarang) {
        return ((beratSekarang+berat)>maxLoadKg);
    }

    private boolean cekKepenuhan(float volume, float volumeSekarang) {
        return ((volumeSekarang+volume)>capacity);
    }


}
