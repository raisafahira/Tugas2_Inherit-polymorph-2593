package soal2;

/**
 * Merepresentasikan hewan umum yang punya nama, bisa bersuara dan makan.
 */
public class Hewan {
    protected String nama;

    /**
     * Membuat hewan baru.
     *
     * @param nama nama hewan
     */
    public Hewan(String nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + nama);
    }

    /**
     * Mencetak suara hewan umum.
     */
    public void suara() {
        System.out.println("...");
    }

    /**
     * Mencetak aktivitas makan, lalu hewan bersuara.
     */
    public void makan() {
        System.out.println(nama + " makan");
        suara();
    }
}
