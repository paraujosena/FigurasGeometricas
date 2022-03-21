package pckeaula;

public abstract class FiguraGeometrica {
	protected float base, altura,area;

	public FiguraGeometrica() {}
	
	public FiguraGeometrica(float b, float a) {
		super();
		this.base = b;
		this.altura = a;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}
	
	abstract public float calculaArea(float b, float a);
	
}
