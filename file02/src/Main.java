public class Main {
    public static void main(String[] args) {
        for (int num = 2; num <= 100; ++num) {
            boolean check = true;
            for (int prev = 2; prev < num; ++prev) {
                if (num % prev == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(num);
            }
        }
    }
}