public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadeAcompanhantes = 0;
		if (idade >= 18) {
			System.out.println("Você é maior de idade!");
		}
		else {
			if (quantidadeAcompanhantes >= 1) {
				System.out.println("Mesmo sendo menor de idade, você está acompanhado!");
			}
			else {
				System.out.println("Você é menor de idade!");
			}
		}
	}
}
