import java.util.Scanner;

public class markspercentage {
 public static void main(String args[]) {
    float eng, phy, chem, math, comp; int count=1;
    double[] total, average, percentage;
    total=new double[5];average=new double[5];percentage=new double[5];
    for(int i=0;i<5;i++){
   Scanner op=new Scanner(System.in);
   System.out.println("Enter marks of five subject of "+count+" student:");
   System.out.print("Enter marks of English subjects:");
   eng=op.nextFloat();
   System.out.print("Enter marks of physics subjects:");
   phy=op.nextFloat();
   System.out.print("Enter marks of chemistry subjects:");
   chem=op.nextFloat();
   System.out.print("Enter marks of maths subjects:");
   math=op.nextFloat();
   System.out.print("Enter marks of computers subjects:");
   comp=op.nextFloat();
   total[i] = eng + phy + chem + math + comp;
   average[i] = (total[i] / 5.0);
   percentage[i] = (total[i] / 500.0) * 100;
   count++;
   }
for(int i=0;i<5;i++){
   int no=1;
    System.out.println("student "+no+" Average");
   System.out.println("Average marks = "+average[i]);
no++;
}    
}
}
