import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String x = src.nextLine();
        int y = src.nextInt();
        for (int i = 0; i < x.length(); i++) {
            int a = (int) x.charAt(i) + y;
            System.out.print((char) a);
        }
    }
}
