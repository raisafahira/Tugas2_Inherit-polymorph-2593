package soal2;

/**
 * Titik sebagai lingkaran berjari-jari nol. Dipakai untuk menunjukkan
 * overriding dan masalah relasi is-a yang dipaksakan.
 */
public class Titik extends Lingkaran {
    private static final double JARI_JARI_TITIK = 0.0;
    private static final double NILAI_NOL = 0.0;

    /**
     * Membuat titik (lingkaran berjari-jari nol).
     */
    public Titik() {
        super(JARI_JARI_TITIK);
    }

    /**
     * Luas titik selalu nol.
     *
     * @return 0.0
     */
    @Override
    public double luas() {
        return NILAI_NOL;
    }

    /**
     * Keliling titik selalu nol.
     *
     * @return 0.0
     */
    @Override
    public double keliling() {
        return NILAI_NOL;
    }
}
