public class TestaCondicionalBoolean {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadeAcompanhantes = 1;
		boolean estaAcompanhado = quantidadeAcompanhantes >= 1;
		if (idade >= 18 || estaAcompanhado) {
			System.out.println("Você é maior de idade ou está acompanhado!");
		}
		else {
			System.out.println("Você é menor de idade!");
		}
	}
}
