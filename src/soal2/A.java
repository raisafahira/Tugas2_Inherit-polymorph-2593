package soal2;

/**
 * Kelas induk untuk demo urutan inisialisasi objek.
 */
public class A {

    /**
     * Membuat objek A dan memanggil init().
     */
    public A() {
        System.out.println("A dibuat");
        init();
    }

    /**
     * Mencetak penanda init milik A.
     */
    public void init() {
        System.out.println("init A");
    }
}
