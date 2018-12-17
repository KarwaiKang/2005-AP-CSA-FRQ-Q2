import java.util.ArrayList;

public abstract class Ticket {
    /**
     * unique ticket id number
     */
    private int serialNumber;
    private static ArrayList<Integer> tickets = new ArrayList<>();

    public Ticket() {
        serialNumber = getNextSerialNumber();
    }

    /**
     * @return the price for this ticket
     */
    public abstract double getPrice();

    /**
     * @return a string with information about the ticket
     */
    public String toString() {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }

    /**
     * @return a new unique serial number
     */
    private static int getNextSerialNumber() {
        int num = (int) (Math.random() * 900) + 100;
        while (tickets.contains(num))
            num = (int) (Math.random() * 900) + 100;
        tickets.add(num);
        return num;
    }
}