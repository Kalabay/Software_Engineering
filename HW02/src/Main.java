import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group group = null;
        Scanner in = new Scanner(System.in);
        boolean isStart = false;
        System.out.println("/h - начать семианр.");
        System.out.println("/r - выбрать случайного студента.");
        System.out.println("/l - список студентов с оценками.");
        System.out.println("/e - закончить.");
        String input = in.nextLine();
        while (!Objects.equals(input, "/e")) {
            if (Objects.equals(input, "/h")) {
                group = new Group();
                isStart = true;
            } else if (!isStart) {
                System.out.println("Некорректный ввод.");
            } else if (Objects.equals(input, "/r")) {
                group.ask();
            } else if (Objects.equals(input, "/l")) {
                group.print();
            } else {
                System.out.println("Некорректный ввод.");
            }
            input = in.nextLine();
        }
    }
}