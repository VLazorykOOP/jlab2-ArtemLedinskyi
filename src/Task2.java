public class Task2 {
    private double a;
    private double b;
    private double c;

    public Task2() {
        this.a = 0.0;
        this.b = 0.0;
        this.c = 0.0;
    }

    public Task2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean IsOnLine(double x, double y) {
        double result = (a * x) + (b * y) + c;
        return result == 0;
    }

    public void findIntersection(Task2 other) {
        double determinant = this.a * other.b - other.a * this.b;

        if (determinant == 0) {
            System.out.println("Прямі паралельні, немає точки перетину.");
        } else {
            double x = (this.b * other.c - other.b * this.c) / determinant;
            double y = (other.a * this.c - this.a * other.c) / determinant;
            System.out.println("X = " + x + ", Y = " + y);
        }
    }
}
