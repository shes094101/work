import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int x = src.nextInt();
        int o = 0 ;
        for (int i=2 ; i<x ; i++){
        if (x%i==0){o=o+1;break;}
        else {o=0;}
        }
        if (o==0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    }
