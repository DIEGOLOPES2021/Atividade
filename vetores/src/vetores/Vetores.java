package vetores;

public class Vetores {

	public static void main(String[] args) {
		
		double notas[] = {10, 10, 10, 10};
		
//		double media = (notas[1] + notas[2] + notas[3] + notas[4]) / 4;
//		System.out.println("Notas:"+media);
		
		notas[3]= 8;
		
		System.out.println("Nota do 4 bimestre:"+ notas[3]);
		notas[3] =10;
		
		System.out.println(notas.length);

		double idades [] = {11, 11, 33, 44, 55,55};
		
//		int totalIdades = 0;
//		
//		for (int i =0; i < idades.length; i++) {
//			totalIdades += idades[i];
//		}
//		double mediaIdades = totalIdades / idades.length;
		
		
		
	int totalNotas = 0;
	
	for(int i =0; i <notas.length; i++) {
		totalNotas += notas[i];
	}
	int mediaDasNotas = totalNotas /notas.length;
	System.out.println("Media das Notas:"+mediaDasNotas);
		
	double peso[] = {12,12,43,55,87,88};
	System.out.println("Media de Peso:"+media(peso));
		
		System.out.println("Mediaa:"+media(notas));
		System.out.println("Media das Idades:"+media(idades));
		
		
//			int totalIdades = 0;
//		
//			String nome = "celso";
//			int repeticao= 10;
//			
//		for(int i = 0; i < repeticao; i++) {
//			
//			System.out.println(i + "-" + nome);
//		}
		
		
		}
	
	private static double media(double vetor []) {
		double soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[1];
		}
		return soma / vetor.length;
	}

}
