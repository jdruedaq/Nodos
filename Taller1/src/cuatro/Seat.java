package cuatro;

public class Seat {
    public static final int SEATS = 50;
    private String name;
    private int seatNumber;

    public Seat(String name, int seatNumber) {
        this.name = name;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        String n;
        if (name == null) {
            n = "Disponible";
        } else {
            n = name;
        }
        return "Detalles asiento " + seatNumber + " {" +
                "nombre='" + n + '\'' +
                '}';
    }
}
