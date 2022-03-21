package pckeaula;

public class FiguraRetangulo extends FiguraGeometrica{


	public FiguraRetangulo(float b, float a) {
		super(b, a);
		calculaArea(b, a);
	}

	@Override
	public float calculaArea(float b, float a) {
		area = b* a;
		return area;
	}
}
