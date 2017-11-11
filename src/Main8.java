import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int m = src.nextInt();
        int x = 1;
        int y = 1;
        int z = 1;
        for (int i = 1; i <= n; i++) { x = x * i;}
            for (int j = 1; j <= m; j++) {y = y * j;}
                for (int k = 1; k <= (n - m); k++) {z = z * k;}
        System.out.println(x /(y * z));
            }
        }

