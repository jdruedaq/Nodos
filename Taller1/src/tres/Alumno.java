package tres;

public class Alumno {
    public static final int MEN = 0;
    public static final int FEMALE = 1;
    private String name;
    private int age;
    private int gender;

    public Alumno(String name, int age, @IntRange(minimo = 0, maximo = 1) int gender) {
        if (gender > 1) {
            return;
        }
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(@IntRange(minimo = 0, maximo = 1) int gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        String g;
        if (gender == FEMALE) {
            g = "Mujer";
        } else {
            g = "Hombre";
        }
        return "Alumno{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + g +
                '}';
    }
}
