package soal4;

/**
 * Kelas induk semua produk di toko. Menyimpan data dasar dan memvalidasinya.
 */
public class Produk {
    private final String kode;
    private final String nama;
    protected final double hargaDasar;

    /**
     * Membuat produk baru.
     *
     * @param kode       kode unik produk
     * @param nama       nama produk, tidak boleh kosong
     * @param hargaDasar harga dasar, tidak boleh negatif
     * @throws IllegalArgumentException jika nama kosong atau harga negatif
     */
    public Produk(String kode, String nama, double hargaDasar) {
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong");
        }
        if (hargaDasar < 0) {
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif");
        }
        this.kode = kode;
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    /**
     * Mengambil kode produk.
     *
     * @return kode produk
     */
    public String getKode() {
        return kode;
    }

    /**
     * Mengambil nama produk.
     *
     * @return nama produk
     */
    public String getNama() {
        return nama;
    }

    /**
     * Menghitung harga akhir produk. Subclass meng-override sesuai aturannya.
     *
     * @return harga akhir
     */
    public double hitungHargaAkhir() {
        return hargaDasar;
    }

    /**
     * Memberi keterangan jenis produk.
     *
     * @return deskripsi produk
     */
    public String deskripsi() {
        return "produk umum";
    }
}
