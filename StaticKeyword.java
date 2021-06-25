public class StaticKeyword {
    static {
        System.out.println("First Static Block");
    }
    static {
        System.out.println("Second Static Block");
    }

    public static void main(String args[]) {
        System.out.println("Main block");
    }
}
