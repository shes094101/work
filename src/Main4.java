import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        if (x == 1 && y <= 20 && y <= 31 || x == 12 && y >= 22 && y <= 31)
            System.out.println("Capricorn");
        if (x == 1 && y > 20 && y <= 31 || x == 2 && y <= 18 && y <= 28)
            System.out.println("(Aquarius");
        if (x == 2 && y >= 19 && y <= 28 || x == 3 && y <= 20 && y <= 31)
            System.out.println("(Pisces");
        if (x == 3 && y >= 21 && y <= 31 || x == 4 && y <= 20 && y <= 30)
            System.out.println("Aries");
        if (x == 4 && y >= 21 && y <= 30 || x == 5 && y <= 21 && y <= 31)
            System.out.println("Taurus");
        if (x == 5 && y >= 22 && y <= 31 || x == 6 && y <= 21 && y <= 30)
            System.out.println("Gemini");
        if (x == 6 && y >= 22 && y <= 31 || x == 7 && y <= 22 && y <= 30)
            System.out.println("Cancer");
        if (x == 7 && y >= 23 && y <= 31 || x == 8 && y <= 23 && y <= 30)
            System.out.println("Leo");
        if (x == 8 && y >= 24 && y <= 31 || x == 9 && y <= 23 && y <= 30)
            System.out.println("Virgo");
        if (x == 9 && y >= 24 && y <= 30 || x == 10 && y <= 23 && y <= 31)
            System.out.println("Libra");
        if (x == 10 && y >= 24 && y <= 31 || x == 11 && y <= 22 && y <= 30)
            System.out.println("Scorpio");
        if (x == 1 && y >= 23 && y <= 30 || x == 12 && y <= 21 && y <= 31)
            System.out.println("Sagittarius");
    }
}

