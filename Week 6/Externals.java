package SEE;

import CIE.Internals;
import CIE.Student;
import java.util.Scanner;

public class Externals extends Student {
   int[] marksSee = new int[5];

   public Externals() {
   }

   public void getMarks() {
      for(int var1 = 0; var1 < 5; ++var1) {
         Scanner var2 = new Scanner(System.in);
         System.out.println("Enter SEE marks in subject " + (var1 + 1));
         this.marksSee[var1] = var2.nextInt();
      }

   }

   public void calcTotalMarks(Internals var1) {
      for(int var2 = 0; var2 < 5; ++var2) {
         System.out.println("Subject " + (var2 + 1) + ": " + (var1.returnCieMarks(var2) + this.marksSee[var2] / 2));
      }

      System.out.println();
   }
}
