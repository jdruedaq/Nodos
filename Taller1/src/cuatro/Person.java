package cuatro;

public class Person {
    private long dni;
    private String name;

    public Person(long dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    public long getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }
}
