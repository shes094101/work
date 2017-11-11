import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        float max=0;
        float min=2000000000;
        for (int i=0; i<10 ; i++){
            float x=src.nextInt();
            if (x>max){max=x;}
            if (x<min){min=x;}
        }
        System.out.println(max+"\t"+min);

        }
    }