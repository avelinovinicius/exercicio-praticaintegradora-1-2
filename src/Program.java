import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro numero");
		int n = sc.nextInt();

		System.out.println("Digite o segundo numero");
		int m = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			int result = m * i;

			System.out.println(result);

		}
		sc.close();

	}

}
