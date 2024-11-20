import java.util.Scanner;

class Quad_Eq_cal{
    public static void main(String [] args){
        int y=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("General form  of a quadratic equation is ax^2+bx+c=0");
        do{
            System.out.print("\nEnter value of a=");
            int a=sc.nextInt();
            System.out.print("Enter value of b=");
            int b=sc.nextInt();
            System.out.print("Enter value of c=");
            int c=sc.nextInt();
            float d=(float)(Math.pow(b,2)-4*a*c);
            if(d<0){
                System.out.println("There are no real solutions");
            }
            else if(d==0){
                System.out.println("It has one repeated root(2 equal roots):");
                float r=-b/(2.0f*a);
                System.out.println("x="+r);
            }
            else{
                System.out.println("It has two distinct roots:");
                double r1=((-b+Math.sqrt(d))/(2*a));
                System.out.println("x1="+r1);
                double r2=((-b-Math.sqrt(d))/(2*a));
                System.out.println("x2="+r2);
            }
            System.out.println("\nDo you want to calculate again?(yes=0 and no=1): ");
            y=sc.nextInt();
        }while(y==0);
    }
}
