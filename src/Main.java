import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        System.out.println("Java Lab 2 ");
        System.out.println("Choose task");
        Scanner in = new Scanner(System.in);
        int task = in.nextInt();
        switch (task) {
            case 1:
                Money money1 = new Money(10, (byte) 50);
                Money money2 = new Money(5, (byte) 75);

                System.out.println("money1: " + money1);
                System.out.println("money2: " + money2);

                Money sum = money1.add(money2);
                System.out.println("Сума: " + sum);

                Money difference = money1.subtract(money2);
                System.out.println("Різниця: " + difference);

                Money division = money1.divide(2);
                System.out.println("Поділити на 2 money1: " + division);

                boolean areEqual = money1.isEqual(money2);
                System.out.println("money1 і money2 рівні: " + areEqual);
                break;

            case 2:
                Task2 line1 = new Task2(2.0, -3.0, 6.0); // Параметри першої прямої
                Task2 line2 = new Task2(4.0, -6.0, 12.0); // Параметри другої прямої

                double x = 3.0;
                double y = 2.0;

                boolean pointOnLine1 = line1.IsOnLine(x, y);
                boolean pointOnLine2 = line2.IsOnLine(x, y);

                if (pointOnLine1) {
                    System.out.println("Точка лежить на першій прямій.");
                } else {
                    System.out.println("Точка не лежить на першій прямій.");
                }

                if (pointOnLine2) {
                    System.out.println("Точка лежить на другій прямій.");
                } else {
                    System.out.println("Точка не лежить на другій прямій.");
                }

                line1.findIntersection(line2);
                break;
            case 3:
                VeryLongNumber num1 = new VeryLongNumber("143456789012345678901234");
                VeryLongNumber num2 = new VeryLongNumber("137654321098765432109876");

                // Додавання
                VeryLongNumber sum1 = num1.add(num2);
                System.out.println("Додавання: " + sum1);

                // Віднімання
                VeryLongNumber difference1 = num1.sub(num2);
                System.out.println("Віднімання: " + difference1);

                // Множення
                VeryLongNumber product = num1.multiply(num2);
                System.out.println("Множення: " + product);

                // Ділення
                VeryLongNumber quotient = num1.divide(num2);
                System.out.println("Ділення: " + quotient);

                // Піднесення до степеня
                VeryLongNumber powerResult = num1.power(3);
                System.out.println("Піднесення до степеня: " + powerResult);
                break;
        }
    }
}
