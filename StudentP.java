import java.util.Scanner;
public class StudentP
{public static void main(String args[])
    {
 System.out.println("Vikrant Singh");        
int marks[] = new int[5];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		for(i=0; i<5; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        avg = total/5;
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=70)
        {
           System.out.print("B");
        } 
        else if(avg>=60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("Fail");
        }
    }
}