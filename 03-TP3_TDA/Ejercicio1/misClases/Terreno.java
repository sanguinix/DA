package misClases;
public class Terreno
{
	/**
	 * Variables de instancia
	 */
	private	int codigo;
	private	int manzana;
	private	double altura;
	private	double base;
	/**
	 * Constructores
	 */
	public Terreno() {}
	public Terreno(int cod) {
		codigo = cod;
	}
	public Terreno(int cod, double ba, double al, int man) {
		codigo = cod;
		base = ba;
		altura = al;
		manzana = man;
	}
	/**
	 * Observadores
	 */
	public int getCodigo() {
		return this.codigo;
	}
	public double getBase() {
		return this.base;
	}
	public double getAltura() {
		return this.altura;
	}
	public int getManzana() {
		return this.manzana;
	}
	public String toString() {
		return ("Código: " + this.getCodigo() +
			"\nManzana: " + this.getManzana() +
			"\nBase: " + this.getBase() +
			"\nAltura: " + this.getAltura());
	}
	public boolean equals(Terreno ter) {
		return (this.codigo == ter.getCodigo());
	}
	/**
	 * Modificadores
	 */
	public void setCodigo(int cod) {
		codigo = cod;
	}
	public void setManzana(int man) {
		manzana = man;
	}
	public void setBase(double ba) {
		base = ba;
	}
	public void setAltura(double al) {
		altura = al;
	}
	/**
	 * Propias del tipo
	 */
	public double perimetro() {
		return (2 * base + 2 * altura);
	}
	public double superficie() {
		return (base * altura);
	}
	public double valor(double precio) {
		return (precio * this.superficie());
	}
}
