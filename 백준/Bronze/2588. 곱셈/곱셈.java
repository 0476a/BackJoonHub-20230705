import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int onesDigit = B % 10;
		int tensDigit = (B % 100)/10;
		int hundredDigit = (B % 1000)/100;
		
		System.out.println(A * onesDigit);
		System.out.println(A * tensDigit);
		System.out.println(A * hundredDigit);
		System.out.println(A * B);
	}
}