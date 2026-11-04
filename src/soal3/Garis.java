package soal3;

/**
 * Merepresentasikan garis yang tersusun dari dua objek Titik (composition).
 * Garis menyimpan salinan titik sendiri sehingga tidak terpengaruh
 * perubahan objek Titik dari luar (defensive copy).
 */
public class Garis {
    private Titik awal;
    private Titik akhir;

    /**
     * Membuat garis dari dua titik. Kedua titik disalin.
     *
     * @param awal  titik awal
     * @param akhir titik akhir
     */
    public Garis(Titik awal, Titik akhir) {
        this.awal = salin(awal);
        this.akhir = salin(akhir);
    }

    /**
     * Membuat garis dari koordinat mentah. Memakai constructor pertama lewat this(...).
     *
     * @param x1 x titik awal
     * @param y1 y titik awal
     * @param x2 x titik akhir
     * @param y2 y titik akhir
     */
    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2));
    }

    /**
     * Mengambil salinan titik awal.
     *
     * @return salinan titik awal
     */
    public Titik getAwal() {
        return salin(awal);
    }

    /**
     * Mengubah titik awal dengan menyimpan salinannya.
     *
     * @param awal titik awal baru
     */
    public void setAwal(Titik awal) {
        this.awal = salin(awal);
    }

    /**
     * Mengambil salinan titik akhir.
     *
     * @return salinan titik akhir
     */
    public Titik getAkhir() {
        return salin(akhir);
    }

    /**
     * Mengubah titik akhir dengan menyimpan salinannya.
     *
     * @param akhir titik akhir baru
     */
    public void setAkhir(Titik akhir) {
        this.akhir = salin(akhir);
    }

    /**
     * Menghitung panjang garis dengan memanggil jarakKe() milik Titik.
     *
     * @return panjang garis
     */
    public double getPanjang() {
        return awal.jarakKe(akhir);
    }

    /**
     * Mengubah garis menjadi teks berformat (x1, y1) - (x2, y2).
     *
     * @return teks garis
     */
    @Override
    public String toString() {
        return awal + " - " + akhir;
    }

    /**
     * Membuat salinan independen dari sebuah titik.
     *
     * @param asli titik yang disalin
     * @return objek Titik baru dengan koordinat yang sama
     */
    private static Titik salin(Titik asli) {
        return new Titik(asli.getX(), asli.getY());
    }
}
