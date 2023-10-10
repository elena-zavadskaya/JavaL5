import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите координаты первой точки: ");
        Point3d firstObj = input();
        System.out.println("Введите координаты второй точки: ");
        Point3d secondObj = input();
        System.out.println("Введите координаты третьей точки: ");
        Point3d thirdObj = input();

        if (!firstObj.comparePoints(secondObj) && !firstObj.comparePoints(thirdObj)
            && !secondObj.comparePoints(thirdObj)) { // Если точки не повторяются.
            if (computeArea(firstObj, secondObj, thirdObj) == 0) // Если площадь равна нулю.
                System.out.println("Введенные точки некорректны.");
            else {
                System.out.print("Площадь треугольника: ");
                System.out.printf("%.2f", computeArea(firstObj, secondObj, thirdObj));
            }
        } else
            System.out.println("Вы ввели точки с одинаковыми координатами.");
    }

    // Метод для ввода координат.
    public static Point3d input() {
        Scanner sc = new Scanner(System.in);
        double x = 0;
        double y = 0;
        double z = 0;
        if (sc.hasNextDouble()) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();
        }
        Point3d point = new Point3d(x, y, z); // Создаем новый объект класса Point3d и присваеваем координаты.
        return point;
    }

    // Метод для вычисления площади треугольника.
    public static double computeArea(Point3d firstObj, Point3d secondObj, Point3d thirdObj) {
        double a = firstObj.distanceTo(secondObj); // Вычисляем расстояние между двумя точками по их координатам.
        double b = firstObj.distanceTo(thirdObj);
        double c = secondObj.distanceTo(thirdObj);
        double p = (a + b + c) / 2; // Вычисляем полупериметр.
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Вычисляем площадь по формуле Герона.
    }
}