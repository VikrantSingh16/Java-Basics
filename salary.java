public class salary {
    int salary; int workHour;
    void getinfo(int s,int h){
if (s>5000&&h>6){
    s=s+1000+500;
    System.out.println("Salaray is "+s);
}
else if(s>5000&&h<6){
    s=s+1000;
    System.out.println("Salaray is "+s);
}
else if(s<5000&&h<6){
    s=s+500;
    System.out.println("Salaray is "+s);
}
else if(s>5000&&h>6){
    System.out.println("Salaray is "+s);}};
    public static void main(String args[]){
    salary E= new salary();
    E.getinfo(4000,4);
    }
}
 