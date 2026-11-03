// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class LaptopGaming extends Laptop {
   private static final int GARANSI_TAMBAHAN_BULAN = 6;
   private final String kartuGrafis;

   public LaptopGaming(String var1, double var2, int var4, int var5, double var6, String var8) {
      super(var1, var2, var4 + 6, var5, var6);
      this.kartuGrafis = var8;
   }

   public String infoSingkat() {
      String var10000 = super.infoSingkat();
      return var10000 + " | GPU " + this.kartuGrafis;
   }
}
