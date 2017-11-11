import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int x = 1;
        for (int i = 1; i <= n; i++) {
            x = x * i;
        }
        System.out.println(x);
    }
}