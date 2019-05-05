import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int wek[] = new int[10];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<10; i++) {

            System.out.println(Arrays.toString(wek));
            System.out.println("Wpisz liczbe do wektora:");
            int number = scan.nextInt();
            wek[i] = number;

        }
        System.out.println(Arrays.toString(wek));

    }
}
      
