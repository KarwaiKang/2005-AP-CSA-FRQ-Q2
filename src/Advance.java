public class Advance extends Ticket {
    int days;

    public Advance(int days) {
        super();
        this.days = days;
    }

    public double getPrice() {
        if (this.days > 9)
            return 30;
        return 40;
    }

    public String toString() {
        return super.toString();
    }
}