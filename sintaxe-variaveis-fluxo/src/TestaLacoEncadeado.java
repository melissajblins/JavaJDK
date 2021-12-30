public class TestaLacoEncadeado {
	public static void main(String[] args) {
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.println("Tabuada do " + multiplicador);
			for (int multiplicando = 0; multiplicando <= 10; multiplicando++) {
				System.out.println(multiplicador + " * " + multiplicando + " = " + (multiplicador * multiplicando));
			}
			System.out.println("\n");
		}
	}
}
