import java.util.Scanner;//平年閏年判斷

public class Main2 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int x = src.nextInt();
        if (x % 4 == 0 && x%100!=0) {
            System.out.println("Bissextile Year ");
        }
        if (x%4 != 0){
            System.out.println("Common Year ");
        }
        if (x % 4 == 0 && x % 100 == 0 && x%400 !=0) {
            System.out.println("Common Year ");
        }
        if (x % 4 == 0 && x % 100 == 0 && x % 400 == 0) {
            System.out.println("Bissextile Year ");
        }
    }
}

