public class TestaSomatoria {
	public static void main(String[] args) {
		int total = 0;
		int contador = 0;
		while (contador <= 10) {
			total += contador;
			contador++;
		}
		System.out.println(total);
	}
}
