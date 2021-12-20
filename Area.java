public class Area {
    public static void main(String[] args) {
        area(5.0);
        area(-1);
        area(5.0,4.0);
        area(-1.0,4.0);
    }

    public static void area(double radius){
        if(radius<0){
            System.out.println("Invalid value");
        }
        double circle = radius * radius * 3.14;
        System.out.println(circle);
    }
    public static void area(double x, double y){
        double rect = x*y;
        System.out.println(rect);
    }
}
