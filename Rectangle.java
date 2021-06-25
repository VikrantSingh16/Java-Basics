public class Rectangle {
    double length;
    double width;

    Rectangle() {
        length = 0;
        width = 0;
    }

    void getPerimeterAndArea(double len, double wid) {
        double perimeter = 2 * (len + wid);
        double area = len * wid;
        System.out.println("Perimeter: " + perimeter + " and Area: " + area);
    }

    void setPerimeterAndArea(double len, double wid) {
        if (20 >= len && len > 0 && 20 >= wid && wid > 0) {
            System.out.println("Length and width are under 0 to 20 so the perimeter and area of rectangle are : ");
            getPerimeterAndArea(len, wid);
        } else {
            System.out.println("\nNot Valid");
        }
    }

    public static void main(String args[]) {
        Rectangle small = new Rectangle();
        small.setPerimeterAndArea(18.32, 17.22);
    }
}