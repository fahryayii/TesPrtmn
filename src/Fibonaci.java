import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        int x = 1, y = 1, z = 1;
        int length = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Nilai Fibonaci : ");
        length = input.nextInt();
                for (int i = 0; i < length; i++)
                {
                    System.out.print(z + " ");
                    z = x + y;
                    x = y;
                    y = z;
                }
                System.out.println();;

    }
}
