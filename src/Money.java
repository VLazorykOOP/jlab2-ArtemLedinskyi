public class Money {
    private long hryvnia;  // Гривні
    private byte kopiyky;  // Копійки


    public Money(long hryvnia, byte kopiyky) {
        this.hryvnia = hryvnia;
        this.kopiyky = kopiyky;
    }


    public Money add(Money other) {
        long totalHryvnia = this.hryvnia + other.hryvnia;
        int totalKopiyky = this.kopiyky + other.kopiyky;
        if (totalKopiyky >= 100) {
            totalHryvnia++;
            totalKopiyky -= 100;
        }
        return new Money(totalHryvnia, (byte) totalKopiyky);
    }


    public Money subtract(Money other) {
        long totalHryvnia = this.hryvnia - other.hryvnia;
        int totalKopiyky = this.kopiyky - other.kopiyky;
        if (totalKopiyky < 0) {
            totalHryvnia--;
            totalKopiyky += 100;
        }
        if (totalHryvnia < 0) {
            throw new IllegalArgumentException("Результат віднімання негативний.");
        }
        return new Money(totalHryvnia, (byte) totalKopiyky);
    }


    public Money divide(long divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Ділення на нуль неможливе.");
        }
        long totalHryvnia = this.hryvnia / divisor;
        int totalKopiyky = (int) ((this.hryvnia % divisor) * 100 + this.kopiyky) / (int) divisor;
        return new Money(totalHryvnia, (byte) totalKopiyky);
    }

    public boolean isEqual(Money other) {
        return this.hryvnia == other.hryvnia && this.kopiyky == other.kopiyky;
    }

    @Override
    public String toString() {
        return hryvnia + "," + String.format("%02d", kopiyky) + "грн";
    }
}