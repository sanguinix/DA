public class Libro
{
	/**
	 * Atributos
	 */
	private int ejemplares;
	private String ISBN;
	private String nombre;
	private String autor;
	/**
	 * Constructores
	 */
	public Libro() {}
	public Libro(String iSBN, String nom)
	{
		this.ISBN = iSBN;
		this.nombre = nom;
	}
	public Libro(String iSBN, String n, String sAutor, int cant)
	{
		this.ISBN = iSBN;
		this.nombre = n;
		this.autor = sAutor;
		this.ejemplares = cant;
	}
	/**
	 * Modificadores
	 */
	public void setAutor(String a)
	{
		this.autor = a;
	}
	public void setNombre(String n)
	{
		this.nombre = n;
	}
	public void setEjemplares(int ce)
	{
		this.ejemplares = ce;
	}
	/**
	 * Observadores
	 */
	public int getEjemplares()
	{
		return (this.ejemplares);
	}
	public String getISBN()
	{
		return (this.ISBN);
	}
	public String getAutor()
	{
		return (this.autor);
	}
	public String getNombre()
	{
		return (this.nombre);
	}
	public boolean equals(Libro otro)
	{
		//return (this.ISBN == otro.getISBN());
		return (this.ISBN.compareTo(otro.getISBN()) == 0);
	}
	public String toString()
	{
		return ("\nISBN: " + this.ISBN +
			"\nNombre: " + this.nombre +
			"\nAutor: " + this.autor +
			"\nCantidad de ejemplares: " + this.ejemplares);
	}
	/**
	 * Métodos propios del tipo
	 */
}
