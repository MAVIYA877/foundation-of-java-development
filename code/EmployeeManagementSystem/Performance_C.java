public class Performance_C {
   public Performance_C() {
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{80, 75, 85};
      int var2 = 0;

      for(int var3 = 0; var3 < var1.length; ++var3) {
         var2 += var1[var3];
      }

      double var5 = (double)var2 / (double)var1.length;
      System.out.println("Technical Skills : " + var1[0]);
      System.out.println("Communication Skills : " + var1[1]);
      System.out.println("Teamwork : " + var1[2]);
      System.out.println("Average Performance Score : " + var5);


      
      if (var5 >= (double)90.0F) {
         System.out.println("Rating : Excellent");
      } else if (var5 >= (double)75.0F) {
         System.out.println("Rating : Good");
      } else if (var5 >= (double)60.0F) {
         System.out.println("Rating : Average");
      } else {
         System.out.println("Rating : Needs Improvement");
      }

   }
}