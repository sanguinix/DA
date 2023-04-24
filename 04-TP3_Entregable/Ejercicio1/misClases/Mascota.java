package misClases;
public class Mascota
{
	/**
	 * Atributos
	 */
	private int codigo;
	private int edad;
	private double peso;
	private String nombre;
	/**
	 * Constructores
	 */
	public Mascota(int cod) {
		this.codigo = cod;
	}
	public Mascota(int cod, String nn, double pe, int ed) {
		this.codigo = cod;
		this.nombre = nn;
		this.peso = pe;
		this.edad = ed;
	}
	/**
	 * Modificadores
	 */
	public void setCodigo(int cod) {
		this.codigo = cod;
	}
	public void setNombre(String nn) {
		this.nombre = nn;
	}
	public void setPeso(double pe) {
		this.peso = pe;
	}
	public void setEdad(int ed) {
		this.edad = ed;
	}
	/**
	 * Observadores
	 */
	public int getCodigo() {
		return (this.codigo);
	}
	public String getNombre() {
		return (this.nombre);
	}
	public double getPeso() {
		return (this.peso);
	}
	public int getEdad() {
		return (this.edad);
	}
	public String toString() {
		return ("\nCódigo: " + this.codigo + "." +
			"\nNombre: " + this.nombre + "." +
			"\nEdad: " + this.edad + " años." +
			"\nPeso: " + this.peso + " kilogramos.");
	}
	/**
	 * Métodos propios del tipo
	 */
	public boolean equals(Mascota otra) {
		return (this.codigo == otra.getCodigo());
	}
}
