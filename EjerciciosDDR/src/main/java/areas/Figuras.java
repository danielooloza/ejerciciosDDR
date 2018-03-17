package areas;

public class Figuras {



	private String nombre;
	
	private String circulo;
	
	private String cuadrado;
	
	private String triangulo;
	
	private int radio;
	
	private int pi;
	
	private int base;
	
	private int altura;
	
	private int lado;
	
	private int area;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the circulo
	 */
	public String getCirculo() {
		return circulo;
	}

	/**
	 * @param circulo the circulo to set
	 */
	public void setCirculo(String circulo) {
		this.circulo = circulo;
	}

	/**
	 * @return the cuadrado
	 */
	public String getCuadrado() {
		return cuadrado;
	}

	/**
	 * @param cuadrado the cuadrado to set
	 */
	public void setCuadrado(String cuadrado) {
		this.cuadrado = cuadrado;
	}

	/**
	 * @return the triangulo
	 */
	public String getTriangulo() {
		return triangulo;
	}

	/**
	 * @param triangulo the triangulo to set
	 */
	public void setTriangulo(String triangulo) {
		this.triangulo = triangulo;
	}

	/**
	 * @return the radio
	 */
	public int getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(int radio) {
		this.radio = radio;
	}

	/**
	 * @return the pi
	 */
	public int getPi() {
		return pi;
	}

	/**
	 * @param pi the pi to set
	 */
	public void setPi(int pi) {
		this.pi = pi;
	}

	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * @return the lado
	 */
	public int getLado() {
		return lado;
	}

	/**
	 * @param lado the lado to set
	 */
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	/**
	 * @return the area
	 */
	public int getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(int area) {
		this.area = area;
	}

	
	public int calculaCirculo(int radio, int pi) {
		
//		area = radio ^ 2 * pi;
//		Math.pow(getRadio(), 2);
		radio = (int) Math.pow(radio, 2);
		area = radio * pi;
		
		return area;
				
	}
	
	public int calculaTriangulo (int base, int altura) {
		
		area = (base * altura) /2;
		
		return area;

	}


	public int calculaCuadrado(int lado1, int lado2){
		
		area = lado1 * lado2;
		
		return area;
		
	}
	
	




	
	

}
