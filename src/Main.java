import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int n = input.nextInt();
        int count = 0;
        int sum = 0;

        for (int i = 0; i <= n; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                count++;
                sum += i;
            }
        }

        double average = (double) sum / count;
        System.out.println("3 ve 4' e tam bölünen sayıların ortalaması : " + average);
    }
}