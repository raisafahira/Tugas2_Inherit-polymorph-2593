package soal4;

import java.util.ArrayList;

/**
 * Menyimpan daftar produk belanja dan menghitung total serta struk (composition).
 */
public class Keranjang {
    private final ArrayList<Produk> daftarProduk = new ArrayList<>();

    /**
     * Menambahkan produk ke keranjang.
     *
     * @param produk produk yang ditambahkan
     * @throws IllegalStateException jika kode produk sudah ada di keranjang
     */
    public void tambah(Produk produk) {
        for (Produk ada : daftarProduk) {
            if (ada.getKode().equals(produk.getKode())) {
                throw new IllegalStateException(
                        "Kode produk " + produk.getKode() + " sudah ada di keranjang");
            }
        }
        daftarProduk.add(produk);
    }

    /**
     * Menghitung total harga akhir seluruh produk. Tanpa instanceof,
     * polimorfisme yang memilih rumus tiap produk.
     *
     * @return total harga
     */
    public double hitungTotal() {
        double total = 0;
        for (Produk produk : daftarProduk) {
            total += produk.hitungHargaAkhir();
        }
        return total;
    }

    /**
     * Mencetak struk: satu baris per produk, lalu total.
     */
    public void cetakStruk() {
        for (Produk produk : daftarProduk) {
            System.out.printf("%s | %s | %s | Rp%.0f%n",
                    produk.getKode(), produk.getNama(),
                    produk.deskripsi(), produk.hitungHargaAkhir());
        }
        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    /**
     * Mencetak jumlah produk per jenis. Langganan dicek lebih dulu karena
     * Langganan juga merupakan ProdukDigital.
     */
    public void hitungPerJenis() {
        int jumlahFisik = 0;
        int jumlahDigital = 0;
        int jumlahLangganan = 0;
        for (Produk produk : daftarProduk) {
            if (produk instanceof Langganan) {
                jumlahLangganan++;
            } else if (produk instanceof ProdukDigital) {
                jumlahDigital++;
            } else if (produk instanceof ProdukFisik) {
                jumlahFisik++;
            }
        }
        System.out.println("Fisik: " + jumlahFisik + ", Digital: " + jumlahDigital
                + ", Langganan: " + jumlahLangganan);
    }
}
