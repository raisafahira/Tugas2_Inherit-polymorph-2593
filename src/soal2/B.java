package soal2;

/**
 * Subclass A yang meng-override init() dan memakai atribut sendiri.
 */
public class B extends A {
    private int nilai = 5;

    /**
     * Membuat objek B.
     */
    public B() {
        super();
        System.out.println("B dibuat, nilai=" + nilai);
    }

    /**
     * Mencetak penanda init milik B beserta nilainya.
     */
    @Override
    public void init() {
        System.out.println("init B, nilai=" + nilai);
    }
}
