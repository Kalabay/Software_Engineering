import java.util.Objects;
import java.util.Scanner;

class Student {
    private String name;
    private String surname;
    private boolean isPresent;
    private int mark;

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
        isPresent = false;
        mark = -1;
    }

    public void ask() {
        Scanner in = new Scanner(System.in);
        System.out.println("Отвечает Студент " + name + " " + surname);
        System.out.println("Присутствует ли на паре? (y/n)");
        String input = in.nextLine();
        while (!Objects.equals(input, "y") && !Objects.equals(input, "n")) {
            System.out.println("Некорректный ввод.");
            input = in.nextLine();
        }
        if (input.equals("y")) {
            isPresent = true;
            System.out.println("Оценка?");
            int markInput = in.nextInt();
            while (markInput < 0 || markInput > 10) {
                System.out.println("Некорректный ввод.");
                markInput = in.nextInt();
            }
            mark = markInput;
        } else {
            mark = 0;
        }
    }

    public void print() {
        String studentInformation = this.name + " " + this.surname + ":";
        if (mark == -1) {
            studentInformation += " ? не спрашивали";
            System.out.println(studentInformation);
        } else if (isPresent) {
            studentInformation += " . " + mark;
            System.out.println(studentInformation);
        } else {
            studentInformation += " Н ";
            System.out.println(studentInformation);
        }
    }
}