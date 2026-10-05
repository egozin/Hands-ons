public class att08 {
	public static void main(String[] args) {
		int vidasJogador1 = 3;
		int vidasJogador2 = 3;
		int pontosJogador1 = 0;
		int pontosJogador2 = 0;
		int rodada = 1;

		while (vidasJogador1 > 0 && vidasJogador2 > 0) {
			int numeroJogador1 = (int) (Math.random() * 10) + 1;
			int numeroJogador2 = (int) (Math.random() * 10) + 1;

			System.out.println("===== RODADA " + rodada + " =====");
			System.out.println();
			System.out.println("Jogador 1 tirou: " + numeroJogador1);
			System.out.println("Jogador 2 tirou: " + numeroJogador2);
			System.out.println();

			if (numeroJogador1 > numeroJogador2) {
				pontosJogador1 += 10;
				vidasJogador2--;
				System.out.println("Jogador 1 venceu a rodada!");
				System.out.println("Jogador 2 perdeu uma vida!");
			} else if (numeroJogador2 > numeroJogador1) {
				pontosJogador2 += 10;
				vidasJogador1--;
				System.out.println("Jogador 2 venceu a rodada!");
				System.out.println("Jogador 1 perdeu uma vida!");
			} else {
				pontosJogador1 += 5;
				pontosJogador2 += 5;
				System.out.println("Empate!");
				System.out.println("Ninguém perdeu vida.");
				System.out.println();
				System.out.println("Cada jogador recebeu 5 pontos.");
			}

			System.out.println();
			System.out.println("Vidas do Jogador 1: " + vidasJogador1);
			System.out.println("Pontos do Jogador 1: " + pontosJogador1);
			System.out.println();
			System.out.println("Vidas do Jogador 2: " + vidasJogador2);
			System.out.println("Pontos do Jogador 2: " + pontosJogador2);
			System.out.println();

			rodada++;
		}

		System.out.println("===== RESULTADO FINAL =====");
		System.out.println();
		System.out.println("Jogador 1");
		System.out.println("Vidas: " + vidasJogador1);
		System.out.println("Pontos: " + pontosJogador1);
		System.out.println();
		System.out.println("Jogador 2");
		System.out.println("Vidas: " + vidasJogador2);
		System.out.println("Pontos: " + pontosJogador2);
		System.out.println();

		if (vidasJogador1 > 0) {
			System.out.println("Vencedor: Jogador 1");
		} else {
			System.out.println("Vencedor: Jogador 2");
		}
	}
}
