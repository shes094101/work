import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String x = src.nextLine();
        int o = 0;
        for (int i = 0; i < x.length(); i++) {
            char y = x.charAt(i);
            o = o + Character.getNumericValue(y);
        }
        System.out.println(o);
    }
}

