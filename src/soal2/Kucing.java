package soal2;

/**
 * Merepresentasikan kucing sebagai jenis hewan yang bisa memanjat.
 */
public class Kucing extends Hewan {

    /**
     * Membuat kucing baru.
     *
     * @param nama nama kucing
     */
    public Kucing(String nama) {
        super(nama);
        System.out.println("Kucing dibuat");
    }

    /**
     * Mencetak suara kucing.
     */
    @Override
    public void suara() {
        System.out.println("meong");
    }

    /**
     * Mencetak aktivitas memanjat, khusus milik kucing.
     */
    public void panjat() {
        System.out.println(nama + " memanjat");
    }
}
