# Tugas 2 Praktikum PBO: Inheritance, Composition, dan Polimorfisme

- **Nama:** Raisa Fahira
- **NPM:** 250810701100093
- **Kelas praktikum:** A
- **Repository:** https://github.com/raisafahira/Tugas2_Inherit-polymorph-2593

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

## Struktur Project

```
Tugas2_Inherit-polymorph-2593/
├── src/
│   ├── soal1/
│   │   ├── Perangkat.java
│   │   ├── Laptop.java
│   │   ├── Ponsel.java
│   │   ├── LaptopGaming.java
│   │   └── TesSoal1.java
│   ├── soal2/
│   │   ├── Hewan.java
│   │   ├── Kucing.java
│   │   ├── A.java
│   │   ├── B.java
│   │   ├── Lingkaran.java
│   │   ├── Titik.java
│   │   └── TesSoal2.java
│   ├── soal3/
│   │   ├── Titik.java
│   │   ├── Garis.java
│   │   └── TesSoal3.java
│   └── soal4/
│       ├── Produk.java
│       ├── ProdukFisik.java
│       ├── ProdukDigital.java
│       ├── Langganan.java
│       ├── Keranjang.java
│       └── TesSoal4.java
├── img/
├── .gitignore
└── README.md
```


## Prasyarat

- JDK 21
- Visual Studio Code dengan Extension Pack for Java (IntelliJ IDEA juga bisa)

## Cara Menjalankan Program

**Lewat VS Code**
1. Buka folder repository dengan **File > Open Folder**.
2. Buka file `TesSoalX.java` yang ingin dijalankan (X = nomor soal).
3. Klik **Run** di atas method `main`.
4. Hasilnya muncul di panel Terminal atau Debug Console.

**Lewat IntelliJ IDEA**
1. Buka folder repository sebagai project, lalu klik kanan folder `src` > **Mark Directory as** > **Sources Root**.
2. Buka **Run > Edit Configurations > + > Application**.
3. Isi *Main class* dengan `soal1.TesSoal1` (ganti sesuai soal), pilih JDK 21, klik **OK**, lalu Run.

**Lewat Command Line** (jalankan dari folder root repository)

```
javac -d out src/soal1/*.java src/soal2/*.java src/soal3/*.java src/soal4/*.java
java -cp out soal1.TesSoal1
java -cp out soal2.TesSoal2
java -cp out soal3.TesSoal3
java -cp out soal4.TesSoal4
```

Kalau kode diubah, kompilasi ulang dengan `javac` sebelum menjalankan `java`.

## Hasil dan Jawaban per Soal

### Soal 1: Hierarki Perangkat Elektronik

**Output:**

```
Asus | garansi 24 bulan | RAM 16 GB | layar 14.0 inci
Samsung | garansi 12 bulan | 128 GB | 3 kamera
MSI | garansi 18 bulan | RAM 32 GB | layar 15.6 inci | GPU RTX 4060
Pajak laptop: Rp800000
Promo laptop 10 persen: Rp7200000
```


**Pertanyaan tambahan: `harga` diubah menjadi `private`**

Saat `protected double harga` diubah menjadi `private double harga` lalu dikompilasi, muncul error berikut:

```
src\soal1\Laptop.java:40: error: harga has private access in Perangkat
        return harga - (harga * diskonPersen / SERATUS_PERSEN);
               ^
src\soal1\Laptop.java:40: error: harga has private access in Perangkat
        return harga - (harga * diskonPersen / SERATUS_PERSEN);
                        ^
2 errors
```


Error muncul dua kali karena `harga` dipakai dua kali pada baris itu. Penyebabnya, `private` membuat atribut hanya bisa diakses dari kelas yang mendeklarasikannya, yaitu `Perangkat`. `Laptop` memang mewarisi `harga`, tetapi `hitungHargaPromo()` mengaksesnya langsung dan itu tidak diizinkan. Dengan `protected`, subclass boleh mengaksesnya. Alternatif lain adalah membuat getter `getHarga()`. Setelah percobaan ini, atribut saya kembalikan menjadi `protected`.

### Soal 2: Analisis Output, Error, dan Polimorfisme



```
=== Bagian A ===
Hewan dibuat: Tom
Kucing dibuat
Tom makan
meong
meong
Tom memanjat
Hewan dibuat: Generik
h2 bukan Kucing, tidak bisa memanjat

=== Bagian B ===
A dibuat
init B, nilai=0
B dibuat, nilai=5

=== Bagian C ===
78.53981633974483
0.0
0.0
```


**1. Output lengkap Bagian A (versi awal soal)**

Prediksi saya: program mencetak proses pembuatan objek dari `Hewan` ke `Kucing`, lalu memanggil `makan()` yang di dalamnya memanggil `suara()` milik `Kucing` (polimorfisme), lalu memanggil `panjat()`, dan mencetak pembuatan `Hewan` generik. Setelah itu muncul `ClassCastException`, karena `h2` sebenarnya hanya objek `Hewan` biasa yang di-cast paksa ke `Kucing` tanpa pengecekan `instanceof`.

Hasil sebenarnya:

```
Hewan dibuat: Tom
Kucing dibuat
Tom makan
meong
meong
Tom memanjat
Hewan dibuat: Generik
Exception in thread "main" java.lang.ClassCastException: class soal2.Hewan cannot be cast to class soal2.Kucing (soal2.Hewan and soal2.Kucing are in unnamed module of loader 'app')
        at soal2.TesSoal2.main(TesSoal2.java:21)
```


Constructor `Hewan` berjalan lebih dulu, baru constructor `Kucing`. Pada `h.makan()`, nama dicetak lalu `suara()` dipanggil, dan yang berjalan adalah versi `Kucing`. Program berhenti di `Kucing k2 = (Kucing) h2;`, sehingga `k2.panjat()` tidak pernah dijalankan. Di versi akhir sudah dipakai `instanceof`, jadi program tidak crash.

**2. Jika `h.panjat();` dibuka komentarnya**

Error muncul pada tahap **kompilasi**:

```
src\soal2\TesSoal2.java:37: error: cannot find symbol
        h.panjat(); // error kompilasi: tipe statis Hewan tidak punya panjat()
         ^
  symbol:   method panjat()
  location: variable h of type Hewan
1 error
```


Compiler hanya melihat tipe statis `h`, yaitu `Hewan`, dan kelas itu tidak punya method `panjat()`. Fakta bahwa objek aslinya adalah `Kucing` tidak diperhatikan oleh compiler.

**3. Penyebab `ClassCastException` dan perbaikannya**

Penyebabnya adalah baris `Kucing k2 = (Kucing) h2;`. Objek yang ditunjuk `h2` dibuat dengan `new Hewan("Generik")`, bukan `Kucing`, sehingga downcast gagal saat program berjalan. Perbaikan tanpa mengubah tipe `h2`:

```java
Hewan h2 = new Hewan("Generik");
if (h2 instanceof Kucing) {
    Kucing k2 = (Kucing) h2;
    k2.panjat();
} else {
    System.out.println("h2 bukan Kucing, tidak bisa memanjat");
}
```

**4. `suara()` milik kelas mana pada `h.makan()`?**

Milik **Kucing**. Tipe statis `h` adalah `Hewan` (tipe saat dideklarasikan, dipakai compiler), sedangkan tipe dinamisnya `Kucing` (tipe objek asli saat program berjalan). Java memilih method berdasarkan tipe dinamis (dynamic dispatch), jadi `suara()` yang dipanggil dari dalam `makan()` tetap versi `Kucing`.

**5. Bagian B (`new B();`)**

Nilai pada `init B` adalah 0 karena constructor `B` memanggil `super()` lebih dulu, sehingga constructor `A` berjalan sebelum field `nilai = 5` milik `B` diisi. Saat itu `nilai` masih bernilai default `int`, yaitu 0. Karena `init()` di-override, yang dipanggil dari constructor `A` adalah versi `B`, dan ia membaca field yang belum siap. Risikonya, method yang bisa di-override lalu dipanggil dari constructor bisa membaca data subclass yang belum terisi. Sebaiknya jangan memanggil method yang bisa di-override dari constructor, atau jadikan methodnya `private` atau `final`.

**6. Bagian C (Lingkaran dan Titik)**

`l3.luas()` menghasilkan 0.0 karena objek aslinya adalah `Titik`, sehingga method `luas()` hasil override yang berjalan. "Titik adalah sebuah Lingkaran" tidak masuk akal sebagai is-a, karena titik hanya posisi dan tidak punya jari-jari, lalu dipaksa menjadi lingkaran berjari-jari nol. Akibatnya, method yang mengira setiap `Lingkaran` punya luas lebih dari nol (misalnya menghitung `1 / luas()`) bisa menghasilkan `Infinity` atau `NaN` jika diberi `Titik`. Subclass seharusnya tidak melanggar aturan superclass-nya (Liskov Substitution Principle).

### Soal 3: Titik dan Garis

**Output:**

```
(0.0, 0.0) - (3.0, 4.0) panjang=5.0
(1.0, 1.0) - (5.0, 5.0)
```


**1. Baris kedua output**

Hasilnya `(100.0, 1.0) - (5.0, 5.0)`. Ini terjadi karena aliasing: constructor hanya menyalin referensi `t`, jadi `t` dan titik awal `g2` menunjuk ke objek yang sama. Saat `t.setX(100)` dipanggil, isi `g2` ikut berubah. Titik akhir tidak berubah karena tidak ada variabel luar yang memegang referensinya.

**2. Defensive copy**

Constructor, setter, dan getter `Garis` diubah agar menyimpan dan mengembalikan salinan titik lewat method private `salin()`. Setelah diperbaiki, baris kedua menjadi `(1.0, 1.0) - (5.0, 5.0)` karena `t.setX(100)` tidak lagi memengaruhi `g2`.

**3. Kapan sebelum dan sesudah perbaikan lebih tepat**

Berbagi referensi lebih tepat jika titik memang sengaja dipakai bersama, misalnya satu titik sudut yang dipakai beberapa garis dan semua garis harus ikut bergerak saat titik itu dipindah. Defensive copy lebih tepat jika `Garis` harus menjaga isinya sendiri dan tidak boleh berubah dari luar. Defensive copy lebih aman, tetapi memakai lebih banyak memori.

**4. Masalah desain jika `Garis extends Titik`**

Garis bukan sebuah Titik, jadi relasi is-a tidak tepat. Yang benar, garis punya dua titik (has-a). Jika `Garis extends Titik`, garis akan mewarisi `x`, `y`, `getX()`, dan `jarakKe()` yang tidak bermakna untuk garis. Garis juga bisa dipakai di tempat yang membutuhkan `Titik`, padahal ia tetap butuh dua titik, sehingga desainnya janggal.

### Soal 4: Mini Project Toko Digital

**Output (skenario normal dan exception tertangani):**

```
F01 | Keyboard Mekanik | fisik 1.5 kg | Rp515000
D01 | Ebook Java | digital 20.0 MB | Rp90000
L01 | Kelas Online | langganan 12 bulan | Rp1440000
TOTAL: Rp2045000
Fisik: 1, Digital: 1, Langganan: 1
Gagal: Kode produk F01 sudah ada di keranjang
```


Hasilnya sesuai soal: total Rp2045000, hitungan per jenis `Fisik: 1, Digital: 1, Langganan: 1`, dan pesan `Gagal: ...` saat kode produk yang sama ditambahkan. `cetakStruk()` dan `hitungTotal()` memakai polimorfisme tanpa `instanceof`, sedangkan `hitungPerJenis()` memakai `instanceof` dengan `Langganan` dicek sebelum `ProdukDigital`.


---

## Analisis Konsep

**1. Perbedaan method overriding dan method overloading**

Overriding adalah ketika subclass menulis ulang method milik induknya dengan nama, parameter, dan return type yang sama agar perilakunya berbeda. Contohnya `infoSingkat()` di `LaptopGaming` yang menggantikan versi `Laptop` untuk menampilkan GPU. Overloading adalah beberapa method atau constructor bernama sama dengan parameter berbeda dalam satu kelas, contohnya dua constructor `Garis`: `Garis(Titik, Titik)` dan `Garis(double, double, double, double)`. Overriding terkait inheritance dan polimorfisme karena versi method dipilih dari objek aslinya saat program berjalan, sedangkan overloading dipilih compiler dari parameternya.

**2. Kapan memilih inheritance dan kapan composition**

Inheritance dipilih jika hubungannya "adalah sebuah" (is-a), contohnya `LaptopGaming` adalah sebuah `Laptop`, sehingga ia mewarisi atribut dan method `Laptop` lalu menambahkan GPU. Composition dipilih jika hubungannya "memiliki" (has-a), contohnya `Garis` memiliki dua `Titik` karena garis bukan titik. Jika inheritance dipaksakan pada hubungan has-a, desainnya janggal dan data yang diwarisi tidak bermakna.

**3. Mengapa `cetakStruk()` tidak butuh `instanceof` tetapi `hitungPerJenis()` butuh, dan mengapa downcasting tidak selalu aman**

`cetakStruk()` hanya memanggil `hitungHargaAkhir()` dan `deskripsi()` dari tiap `Produk`, dan Java otomatis memilih versi sesuai objek aslinya (polimorfisme). `hitungPerJenis()` harus tahu jenis tiap produk untuk menghitung per kategori, jadi memakai `instanceof` dan downcasting, dengan `Langganan` dicek lebih dulu karena ia juga `ProdukDigital`. Downcasting tidak selalu aman karena objek aslinya belum tentu bertipe yang dituju, dan jika dipaksa tanpa `instanceof` akan muncul `ClassCastException` saat program berjalan.

---


## Batasan dan Pengembangan Lanjutan

- Tantangan opsional `ProdukBundel` belum dikerjakan.
- Data keranjang hanya disimpan di memori (`ArrayList`), sehingga hilang saat program berhenti.
- Validasi baru mencakup nama kosong dan harga negatif. Berat, ukuran, dan durasi negatif belum divalidasi.
- Belum ada unit test otomatis, pengujian masih lewat kelas `TesSoalX` dan pembandingan output secara manual.
- Keranjang belum punya fitur menghapus produk.
