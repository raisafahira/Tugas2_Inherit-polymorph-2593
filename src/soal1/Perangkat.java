package soal1;

// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Perangkat {
   private static final double TARIF_PAJAK = 0.1;
   private final String merek;
   protected double harga;
   private final int garansiBulan;

   public Perangkat(String var1, double var2, int var4) {
      if (var1 != null && !var1.isBlank()) {
         if (var2 < (double)0.0F) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
         } else {
            this.merek = var1;
            this.harga = var2;
            this.garansiBulan = var4;
         }
      } else {
         throw new IllegalArgumentException("Merek tidak boleh kosong");
      }
   }

   public String getMerek() {
      return this.merek;
   }

   public int getGaransiBulan() {
      return this.garansiBulan;
   }

   public double hitungPajak() {
      return this.harga * 0.1;
   }

   public String infoSingkat() {
      return this.merek + " | garansi " + this.garansiBulan + " bulan";
   }
}
