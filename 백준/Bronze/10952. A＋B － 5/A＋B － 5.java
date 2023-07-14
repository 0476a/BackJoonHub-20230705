import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int A = 1;
		int B = 1;
		
		while(! (A == 0 && B == 0)) {
			A = scanner.nextInt();
			B = scanner.nextInt();
			if (A != 0 || B != 0) {
                System.out.println(A + B);
            }
		}
		
		scanner.close();
	}
}