# Tugas 2 Praktikum PBO: Inheritance, Composition, dan Polymorphism

- **Nama Lengkap:** Raisa Fahira
- **NPM:** 250810701100093
- **Kelas:** A
- **Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek
- **Tautan Repository:** https://github.com/raisafahira/Tugas2_Inherit-polymorph-2593

## Deskripsi Singkat

Repository ini berisi pengerjaan Tugas 2 Praktikum PBO dengan bahasa Java (tanpa BlueJ). Ada 4 soal: hierarki perangkat elektronik, analisis output dan polimorfisme, titik dan garis, serta mini project toko digital. Konsep yang dilatih adalah inheritance, composition, overriding dan overloading, polimorfisme, downcasting aman, dan exception. Setiap soal ada di package sendiri (`soal1` sampai `soal4`).

## Fitur Utama

**Soal 1: Perangkat Elektronik**
- Menampilkan ringkasan data laptop, ponsel, dan laptop gaming.
- Menghitung pajak 10 persen dan harga promo laptop setelah diskon.
- Menolak data yang tidak valid (merek kosong atau harga negatif).
- Laptop gaming otomatis mendapat tambahan garansi 6 bulan.

**Soal 2: Analisis Output dan Polimorfisme**
- Menunjukkan urutan pembuatan objek, pemanggilan method hasil override, dan upcasting.
- Menunjukkan `ClassCastException` pada versi awal, lalu pencegahannya dengan `instanceof`.
- Menunjukkan risiko memanggil method yang bisa di-override dari constructor.
- Menunjukkan masalah relasi is-a yang dipaksakan (Titik sebagai Lingkaran).

**Soal 3: Titik dan Garis**
- Membuat garis dari dua titik atau dari empat koordinat.
- Menghitung panjang garis dan menampilkannya dengan format `(x1, y1) - (x2, y2)`.
- Isi garis tidak berubah ketika titik dari luar diubah (defensive copy).

**Soal 4: Toko Digital**
- Menambahkan produk fisik, digital, dan langganan ke satu keranjang.
- Mencetak struk berisi kode, nama, jenis, harga akhir, dan total.
- Menghitung jumlah produk untuk setiap jenis.
- Menolak kode produk yang sudah ada, serta nama kosong atau harga negatif.

## Konsep OOP yang Diterapkan

| Konsep | Lokasi | Alasan |
|---|---|---|
| Inheritance (multi level) | `Perangkat` > `Laptop` > `LaptopGaming` (soal1); `Produk` > `ProdukDigital` > `Langganan` (soal4) | Subclass adalah jenis khusus dari induknya, jadi atribut dan perilaku dasar tidak perlu ditulis ulang |
| Atribut `protected` | `Perangkat.harga`, dipakai `Laptop.hitungHargaPromo()` | Subclass bisa mengakses harga langsung, kelas lain tidak |
| `super(...)` dan `super.infoSingkat()` | Constructor dan `infoSingkat()` semua subclass di soal1 | Bagian induk dibuat lebih dulu dan kodenya tidak perlu disalin |
| Encapsulation | Atribut `private` di `Perangkat`, `Titik`, `Garis`, `Produk` | Data hanya bisa diubah lewat method yang sudah divalidasi |
| Konstanta | `TARIF_PAJAK`, `GARANSI_TAMBAHAN_BULAN`, `ONGKOS_KIRIM_PER_KG`, `DISKON_DIGITAL`, `DISKON_LANGGANAN`, `BATAS_DURASI_DISKON_BULAN` | Menghindari magic number dan nilainya bisa diubah dari satu tempat |
| Method overriding | `infoSingkat()` (soal1), `suara()` dan `luas()` (soal2), `hitungHargaAkhir()` dan `deskripsi()` (soal4) | Setiap subclass punya perilaku sendiri untuk method yang sama |
| Method overloading | Dua constructor `Garis` (soal3) | Objek bisa dibuat dengan cara input yang berbeda |
| Composition (has-a) | `Garis` punya dua `Titik` (soal3); `Keranjang` punya daftar `Produk` (soal4) | Garis bukan titik dan keranjang bukan produk, jadi hubungannya has-a |
| Polimorfisme | `cetakStruk()` dan `hitungTotal()` (soal4), `makan()` (soal2) | Satu perulangan atas tipe `Produk` memanggil method milik masing-masing objek |
| Downcasting aman | `TesSoal2` (soal2), `hitungPerJenis()` (soal4) | `instanceof` mencegah crash, dan `Langganan` dicek sebelum `ProdukDigital` |
| Defensive copy | `Garis.salin()` (soal3) | Isi `Garis` tidak berubah dari luar akibat aliasing |
| Exception | `IllegalArgumentException` dan `IllegalStateException` | Data tidak valid ditolak sejak awal |
