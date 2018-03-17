package areas;

public class CalcularAreas {

	public CalcularAreas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		//Calculo  de un circulo
		
		Figuras circulo = new Figuras();
		
		circulo.calculaCirculo(3, 89);
		
		System.out.println("El area del circulo es:" + circulo.getArea());
		
		
		//Calculo de un cuadrado
		
		Figuras cuadrado = new Figuras();
		
		cuadrado.calculaCuadrado(9, 9);
		
		System.out.println("El area del cuadrado es: " + cuadrado.getArea());
		
		
		//Calculo del triangulo
		
		Figuras triangulo = new Figuras();
		
		triangulo.calculaTriangulo(8, 50);
		
		System.out.println("El area del triangulo es: " + triangulo.getArea());
	}

}
