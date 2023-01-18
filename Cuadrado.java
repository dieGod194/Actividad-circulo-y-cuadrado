package actividadCuadradoCirculo;

public class Cuadrado {
	public int longitud;
	public float diagonal;
	public float perimetro;
	public float area;
	
	public Cuadrado (int longi) {
		this.longitud=longi;
	}
	public float calculaDiagonal () {
		return (float) Math.sqrt((longitud*longitud)*2);
	}
	public float calculaPerimetro () {
		return longitud*4;
	}
	public float calculaArea() {
		return longitud*longitud;
	}
}
