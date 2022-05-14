import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args){
        System.out.println("Bir sayı giriniz: ");
        int n,sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1;i<n;i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(sum == n){
            System.out.println(n+" Mükemmel sayıdır");
        }else{
            System.out.println(n+" Mükemmel sayı degildir");
        }

    }
}
