package soal4;

/**
 * Produk berwujud yang dikenai ongkos kirim berdasarkan berat.
 */
public class ProdukFisik extends Produk {
    private static final double ONGKOS_KIRIM_PER_KG = 10000;

    private final double beratKg;

    /**
     * Membuat produk fisik baru.
     *
     * @param kode       kode produk
     * @param nama       nama produk
     * @param hargaDasar harga dasar
     * @param beratKg    berat dalam kilogram
     * @throws IllegalArgumentException jika nama kosong atau harga negatif
     */
    public ProdukFisik(String kode, String nama, double hargaDasar, double beratKg) {
        super(kode, nama, hargaDasar);
        this.beratKg = beratKg;
    }

    /**
     * Menghitung harga dasar ditambah ongkos kirim.
     *
     * @return harga akhir produk fisik
     */
    @Override
    public double hitungHargaAkhir() {
        return hargaDasar + (beratKg * ONGKOS_KIRIM_PER_KG);
    }

    /**
     * Memberi keterangan jenis dan berat.
     *
     * @return deskripsi, misalnya "fisik 1.5 kg"
     */
    @Override
    public String deskripsi() {
        return "fisik " + beratKg + " kg";
    }
}
