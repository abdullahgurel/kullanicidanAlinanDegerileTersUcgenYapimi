import java.util.Scanner;
public class tersUcgenYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=1,bSayisi;
        System.out.print("Basamak Sayısını Giriniz : ");
        bSayisi = input.nextInt();
        for (int i =bSayisi;i>=n;i--) {
            for (int k =bSayisi;k>=(n+i);k--) {
                System.out.print(" ");
            }
            for(int j =1;j<=(2*i)-1;j++) {
                System.out.print("*"+"");
            }
            System.out.println(" ");

        }
    }
}
