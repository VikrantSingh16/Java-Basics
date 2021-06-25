class SwapNum{
    int num1,num2;
    SwapNum(int a,int b){
        num1=a;
        num2=b;
    }
    void swap(SwapNum obj){
     System.out.println("Before a= "+obj.num1+" b= "+obj.num2);
        int temp;
     temp=obj.num1;
     obj.num1=obj.num2;
     obj.num2=temp;
     System.out.println("After the swap a= "+obj.num1+" b= "+obj.num2);

    }
}
public class objectreferenceswap {
   public static void main(String args[]){
SwapNum obj=new SwapNum(2, 3);
obj.swap(obj);
   } 
}
