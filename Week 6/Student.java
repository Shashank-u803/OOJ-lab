package CIE;

import java.util.Scanner;

public class Student {
   String usn;
   String name;
   int sem;

   public Student() {
   }

   public void getd() {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter student USN");
      this.usn = var1.nextLine();
      System.out.println("Enter student name");
      this.name = var1.nextLine();
      System.out.println("Enter semester");
      this.sem = var1.nextInt();
   }

   public void display() {
      System.out.println();
      System.out.println("Student USN: " + this.usn);
      System.out.println("Student name: " + this.name);
      System.out.println("Semester: " + this.sem);
      System.out.println();
   }
}
