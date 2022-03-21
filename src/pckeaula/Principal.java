package pckeaula;

public class Principal {

	public static void main(String[] args) {
		
		//Triangulo sem calcular na criação
		FiguraTriangulo triangulo = new FiguraTriangulo();
		triangulo.setAltura(5);
		triangulo.setBase(10);
		triangulo.calculaArea(triangulo.getBase(), triangulo.getAltura());
		
		System.out.println("Calculo da area do triangulo...");
		System.out.println("Altura = " + triangulo.getAltura());
		System.out.println("Base = " + triangulo.getBase());
		System.out.println("Área = " + triangulo.getArea());
		
		//Retangulo calculando na criação
		FiguraGeometrica retangulo = new FiguraRetangulo(5, 6);
		
		System.out.println("Calculo da area do retangulo...");
		System.out.println("Altura = " + retangulo.getAltura());
		System.out.println("Base = " + retangulo.getBase());
		System.out.println("Área = " + retangulo.getArea());
		
		
	}
}
