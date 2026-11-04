package soal4;

/**
 * Produk digital berlangganan dengan diskon untuk durasi panjang.
 * Tidak memakai diskon digital biasa.
 */
public class Langganan extends ProdukDigital {
    private static final double DISKON_LANGGANAN = 0.20;
    private static final int BATAS_DURASI_DISKON_BULAN = 12;

    private final int durasiBulan;

    /**
     * Membuat langganan baru.
     *
     * @param kode        kode produk
     * @param nama        nama produk
     * @param hargaDasar  harga dasar per bulan
     * @param ukuranMb    ukuran berkas dalam MB
     * @param durasiBulan durasi langganan dalam bulan
     * @throws IllegalArgumentException jika nama kosong atau harga negatif
     */
    public Langganan(String kode, String nama, double hargaDasar,
                     double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);
        this.durasiBulan = durasiBulan;
    }

    /**
     * Menghitung harga dasar dikali durasi, dengan diskon jika durasi
     * mencapai batas minimal.
     *
     * @return harga akhir langganan
     */
    @Override
    public double hitungHargaAkhir() {
        double total = hargaDasar * durasiBulan;
        if (durasiBulan >= BATAS_DURASI_DISKON_BULAN) {
            total -= total * DISKON_LANGGANAN;
        }
        return total;
    }

    /**
     * Memberi keterangan jenis dan durasi.
     *
     * @return deskripsi, misalnya "langganan 12 bulan"
     */
    @Override
    public String deskripsi() {
        return "langganan " + durasiBulan + " bulan";
    }
}
