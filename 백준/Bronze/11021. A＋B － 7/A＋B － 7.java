import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			sb.append("Case #" + (i + 1) + ": ").append(scanner.nextInt() + scanner.nextInt()).append("\n");
		}
		
		System.out.println(sb);
	}
}