package soal1;

/**
 * Merepresentasikan laptop sebagai jenis perangkat elektronik.
 */
public class Laptop extends Perangkat {
    private static final double SERATUS_PERSEN = 100.0;

    private final int ramGb;
    private final double ukuranLayarInci;

    /**
     * Membuat laptop baru.
     *
     * @param merek           merek laptop
     * @param harga           harga laptop
     * @param garansiBulan    lama garansi dalam bulan
     * @param ramGb           kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     * @throws IllegalArgumentException jika merek kosong atau harga negatif
     */
    public Laptop(String merek, double harga, int garansiBulan,
                  int ramGb, double ukuranLayarInci) {
        super(merek, harga, garansiBulan);
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
     * Menghitung harga setelah diskon.
     *
     * @param diskonPersen besar diskon dalam persen (0 sampai 100)
     * @return harga setelah diskon
     * @throws IllegalArgumentException jika diskon di luar rentang 0 sampai 100
     */
    public double hitungHargaPromo(double diskonPersen) {
        if (diskonPersen < 0 || diskonPersen > SERATUS_PERSEN) {
            throw new IllegalArgumentException("Diskon harus 0 sampai 100 persen");
        }
        return harga - (harga * diskonPersen / SERATUS_PERSEN);
    }

    /**
     * Membuat ringkasan laptop.
     *
     * @return teks berisi data dasar, RAM, dan ukuran layar
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | RAM " + ramGb
                + " GB | layar " + ukuranLayarInci + " inci";
    }
}
