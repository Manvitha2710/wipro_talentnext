package oop_inheritance;
import java.util.Scanner;

public class Box {
    int width, height, depth;

    Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    int calculateVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        int width = sc.nextInt();

        System.out.print("Enter height: ");
        int height = sc.nextInt();

        System.out.print("Enter depth: ");
        int depth = sc.nextInt();

        Box b = new Box(width, height, depth);

        System.out.println("Volume of the box is: " + b.calculateVolume());

        sc.close();
    }
}
