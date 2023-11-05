import java.math.BigInteger;

public class VeryLongNumber {
    private String number;

    public VeryLongNumber(String number) {
        this.number = number;
    }

    public VeryLongNumber add(VeryLongNumber other) {
        BigInteger num1 = new BigInteger(number);
        BigInteger num2 = new BigInteger(other.number);
        BigInteger result = num1.add(num2);
        return new VeryLongNumber(result.toString());
    }

    public VeryLongNumber sub(VeryLongNumber other) {
        BigInteger num1 = new BigInteger(number);
        BigInteger num2 = new BigInteger(other.number);
        BigInteger result = num1.subtract(num2);
        return new VeryLongNumber(result.toString());
    }

    public VeryLongNumber multiply(VeryLongNumber other) {
        BigInteger num1 = new BigInteger(number);
        BigInteger num2 = new BigInteger(other.number);
        BigInteger result = num1.multiply(num2);
        return new VeryLongNumber(result.toString());
    }

    public VeryLongNumber divide(VeryLongNumber other) {
        BigInteger num1 = new BigInteger(number);
        BigInteger num2 = new BigInteger(other.number);
        BigInteger result = num1.divide(num2);
        return new VeryLongNumber(result.toString());
    }

    public VeryLongNumber power(int exp) {
        BigInteger num1 = new BigInteger(number);
        BigInteger result = num1.pow(exp);
        return new VeryLongNumber(result.toString());
    }

    @Override
    public String toString() {
        return number;
    }
}
