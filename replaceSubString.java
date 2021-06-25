public class replaceSubString {
    
        public static void main(String[] args)
         {
             String str = "I am Unknown";
     
              // Replace all the 'dog' with 'cat'.
             String new_str = str.replaceAll("Unknown", "Vikrant");
            
             System.out.println("Original string: " + str);
             System.out.println("New String: " + new_str);
         }
     }   

