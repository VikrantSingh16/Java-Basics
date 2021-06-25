public class StudentPercentage {
    void calculate_grade(int percentage) {
        if (percentage >= 80) {
            System.out.println("Grade A");
        } else if (80 > percentage && percentage >= 70) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }
    }

    public static void main(String args[]) {
        StudentPercentage s1 = new StudentPercentage();
        s1.calculate_grade(70);
    }
}
