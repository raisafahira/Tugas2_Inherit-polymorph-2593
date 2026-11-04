package soal4;

/**
 * Produk digital yang mendapat diskon digital.
 */
public class ProdukDigital extends Produk {
    private static final double DISKON_DIGITAL = 0.10;

    private final double ukuranMb;

    /**
     * Membuat produk digital baru.
     *
     * @param kode       kode produk
     * @param nama       nama produk
     * @param hargaDasar harga dasar
     * @param ukuranMb   ukuran berkas dalam MB
     * @throws IllegalArgumentException jika nama kosong atau harga negatif
     */
    public ProdukDigital(String kode, String nama, double hargaDasar, double ukuranMb) {
        super(kode, nama, hargaDasar);
        this.ukuranMb = ukuranMb;
    }

    /**
     * Menghitung harga dasar setelah diskon digital.
     *
     * @return harga akhir produk digital
     */
    @Override
    public double hitungHargaAkhir() {
        return hargaDasar - (hargaDasar * DISKON_DIGITAL);
    }

    /**
     * Memberi keterangan jenis dan ukuran.
     *
     * @return deskripsi, misalnya "digital 20.0 MB"
     */
    @Override
    public String deskripsi() {
        return "digital " + ukuranMb + " MB";
    }
}
