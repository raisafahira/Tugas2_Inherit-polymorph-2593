package soal2;

/**
 * Kelas uji Soal 2: menjalankan Bagian A (upcasting dan downcasting aman),
 * Bagian B (urutan constructor dan method overridable), serta
 * Bagian C (polimorfisme pada Lingkaran dan Titik).
 */
public class TesSoal2 {

    /**
     * Menjalankan ketiga bagian secara berurutan.
     *
     * @param args tidak dipakai
     */
    public static void main(String[] args) {
        System.out.println("=== Bagian A ===");
        jalankanBagianA();

        System.out.println();
        System.out.println("=== Bagian B ===");
        jalankanBagianB();

        System.out.println();
        System.out.println("=== Bagian C ===");
        jalankanBagianC();
    }

    /**
     * Bagian A: upcasting, downcasting, dan pencegahan ClassCastException
     * memakai instanceof.
     */
    private static void jalankanBagianA() {
        // Upcasting: tipe statis Hewan, tipe dinamis Kucing
        Hewan h = new Kucing("Tom");
        h.makan();
        h.suara();
        // h.panjat(); // error kompilasi: tipe statis Hewan tidak punya panjat()

        // Downcasting aman: h memang objek Kucing
        if (h instanceof Kucing) {
            Kucing k = (Kucing) h;
            k.panjat();
        }

        // Perbaikan Pertanyaan 3: tipe variabel h2 tetap Hewan
        Hewan h2 = new Hewan("Generik");
        if (h2 instanceof Kucing) {
            Kucing k2 = (Kucing) h2;
            k2.panjat();
        } else {
            System.out.println("h2 bukan Kucing, tidak bisa memanjat");
        }
    }

    /**
     * Bagian B: mengamati urutan eksekusi saat objek B dibuat.
     */
    private static void jalankanBagianB() {
        new B();
    }

    /**
     * Bagian C: mencetak luas tiga objek untuk mengamati dynamic dispatch.
     */
    private static void jalankanBagianC() {
        Lingkaran l1 = new Lingkaran(5);
        Titik l2 = new Titik();
        Lingkaran l3 = new Titik();

        System.out.println(l1.luas());
        System.out.println(l2.luas());
        System.out.println(l3.luas());
    }
}
