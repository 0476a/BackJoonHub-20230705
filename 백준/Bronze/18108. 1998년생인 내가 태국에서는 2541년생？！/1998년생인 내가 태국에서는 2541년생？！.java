import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        int thailandYear = scanner.nextInt();

        int koreaYear = thailandYear - 543;

        System.out.println(koreaYear);

    }
}