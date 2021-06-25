public class Student{  
    Student(){
        System.out.println("Default constructor Name : Vikrant Singh");
    }
    int id;  
    String name;  
    //creating a parameterized constructor  
    Student(int i,String n){  
    id = i;  
    name = n;  
    }  
   
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Student s1 = new Student(111,"Vikrant Singh");  
    Student s2 = new Student();  
    s1.display();  
      
   }  
} 