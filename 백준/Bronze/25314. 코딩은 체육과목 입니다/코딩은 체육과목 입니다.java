import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		String lg = "";
		
		if(N % 4 == 0){
			int b = N / 4;
			for(int i = 0; i < b; i++) {
				lg += "long ";
			}
		}
		
		System.out.println(lg + "int");
	}
}