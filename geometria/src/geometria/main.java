package geometria;

public class main {

	public static void main(String[] args) {

		// Teste da classe Quadrado
		Quadrado primeiroQuadrado = new Quadrado();
		primeiroQuadrado.setLado(12);

		double areaPrimeiroQuadrado = primeiroQuadrado.calculaArea();
		System.out.println("Area quadrado: " + areaPrimeiroQuadrado);

		System.out.println("Desenho quadrado: ");
		primeiroQuadrado.desenhar();
		
		Retangulo primeiroRetangulo = new Retangulo();
		primeiroRetangulo.setBase(24);
		primeiroRetangulo.setAltura(12);
		

		double areaPrimeiroRetangulo = primeiroRetangulo.calculaArea();
		System.out.println("Area retangulo: " + areaPrimeiroQuadrado);

		System.out.println("Desenho retangulo: ");
		primeiroRetangulo.desenhar();
	}
}
