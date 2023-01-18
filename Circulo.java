package actividadCuadradoCirculo;
	
public class Circulo {
	public float radio;
	public float circunferencia;
	public float area;
	
	public Circulo (float radio) {
		this.radio=radio;
	}
	public float calcularCircu () {
		return (float) ((2*Math.PI)*radio);
	}
	public float calcularArea () {
		return (float) (Math.PI*(radio*radio));
	}
	
}
