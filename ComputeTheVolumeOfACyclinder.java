import java.util.Scanner;

public class ComputeTheVolumeOfACyclinder {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cyclinder:");
        double radius = in.nextDouble();
        double length = in.nextDouble();
        double area = radius * radius * 3.14159;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
        in.close();

    }
}
