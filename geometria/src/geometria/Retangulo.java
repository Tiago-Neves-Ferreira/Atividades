package geometria;

public class Retangulo {
	// Atributos
	private double Base, Altura;

	// Métodos
	public void setBase(double Base) {
		if (Base > 0) {
			this.Base = Base;
		}
	}
	
	public void setAltura(double altura) {
		if (altura > 0) {
			this.Altura = altura;
		}	
	}

	public double calculaArea() {
		double area = Base * Altura;

		return area; 
	}

	public void desenhar() {
		for (int i = 0; i < Altura; i++) {
			System.out.print(". ");

			for (int j = 0; j < Base; j++) {
				if (i == 0 || i + 1 >= Altura) {
					System.out.print(". ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println(".");
		}
	}
}
