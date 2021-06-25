import java.util.Scanner;
public class exception{
    public static void main(String args[]){
        
       try{
        String value;
        System.out.println("Enter your value:");
        Scanner sc= new Scanner(System.in);
        value=sc.nextLine();
        sc.close();
        if(value.contains("Amity")){
            throw new Exception();
           System.out.println(value);
        }
    }
        catch(Exception e){
            System.out.println("Error");
        }
        
    }
}
