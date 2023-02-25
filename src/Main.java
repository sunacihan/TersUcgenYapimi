import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Sayıyı giriniz:");
        int sayi=input.nextInt();
        int i,j,k;

        for (i=1;i<=sayi;i++){
            for (j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for (k=(2*sayi-1);k>=(2*i-1);k--) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}