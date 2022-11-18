import java.util.concurrent.ThreadLocalRandom;

class Group {
    private Student[] students;
    private boolean[] used;

    public Group() {
        students = new Student[]{new Student("Максим", "Максимов"),
                                 new Student("Иван", "Иванов"),
                                 new Student("Пётр", "Петров")};
        used = new boolean[3];
    }

    public void ask() {
        int count = 0;
        for (int i = 0; i < used.length; ++i) {
            if (!used[i]) {
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("Никого не осталось.");
        } else {
            int indexStudent = ThreadLocalRandom.current().nextInt(0, count + 1);
            count = 0;
            for (int i = 0; i < used.length; ++i) {
                if (!used[i]) {
                    if (count == indexStudent) {
                        used[i] = true;
                        students[i].ask();
                        break;
                    }
                    count += 1;
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < students.length; ++i) {
            students[i].print();
        }
    }
}