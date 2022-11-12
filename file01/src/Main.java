public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] array = new int[n];
        int max_number = 10;
        int min_number = -10;
        int[] ans = new int[3];
        ans[0] = max_number;
        ans[1] = min_number;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * (max_number - min_number)) + min_number;
            ans[0] = Math.min(array[i], ans[0]);
            ans[1] = Math.max(array[i], ans[1]);
            ans[2] += array[i];
            System.out.println(array[i]);
        }
        System.out.print("Min: ");
        System.out.println(ans[0]);
        System.out.print("Max: ");
        System.out.println(ans[1]);
        System.out.print("Average: ");
        System.out.println((double)ans[2] / n);
    }
}