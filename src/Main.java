import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        creatTriangle();
    }

    public static void creatTriangle() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh thứ nhất của tam giác: ");
        double firstSide = scanner.nextDouble();
        System.out.println("Nhập độ dài cạnh thứ hai của tam giác: ");
        double secondSide = scanner.nextDouble();
        System.out.println("Nhập độ dài cạnh thứ nhất của tam giác: ");
        double thirdSide = scanner.nextDouble();
        try {
            Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());;
        }
    }
}
