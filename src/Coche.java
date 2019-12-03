
public class Coche {
	private	String marca;
	private String color;
	private	int anio;
	private int precio;
	
	public Coche(String marca, String color, int anio, int precio) {
		super();
		this.marca = marca;
		this.color = color;
		this.anio = anio;
		this.precio = precio;
	}
	
	public boolean esSeat(String marca) {
		if (marca.equals("Seat")){
			return true;
		}else {
			return false;
		}
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

}
