import java.util.Scanner;//判斷是否為圓內

public class Main {
    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        int x =src.nextInt();
        int y =src.nextInt();
        if (Math.pow(x,2)+Math.pow(y,2)<=10000) {
            System.out.println("inside");
        }else{
            System.out.println("outside");}
    }
}
