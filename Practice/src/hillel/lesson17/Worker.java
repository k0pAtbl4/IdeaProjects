package hillel.lesson17;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Worker {
    static Scanner in = new Scanner(System.in);
    private String surname;
    private String name;
    private String position;
    private int year;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void scanWorker() {
        try {
            System.out.println("Введите фамилию работника:");
            surname = in.nextLine();
            System.out.println("Введите имя работника:");
            name = in.nextLine();
            System.out.println("Введите должность работника:");
            position = in.nextLine();
            System.out.println("Введите год начала работы:");
            year = in.nextInt();
            in.nextLine();
        } catch(InputMismatchException x){
            System.out.println("Error: " + x.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Worker {\n" +
                "Surname = " + surname + "\n" +
                "Name = " + name + "\n" +
                "Position = " + position + "\n" +
                "startYear = " + year +
                " }\n";
    }
}
