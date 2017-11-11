import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int a = src.nextInt();
        int b = src.nextInt();
        int c = src.nextInt();
        int o = 0;
        if(c<=b && c>=a){
        for (int i=a ;i<=b ; i++){
            if (i%c==0){
                o=o+i; }
        }
        }
        System.out.println(o);
        }
    }