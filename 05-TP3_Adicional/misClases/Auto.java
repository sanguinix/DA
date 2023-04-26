package misClases;
public class Auto
{
	/**
	 * Atributos
	 */
	private int agno;
	private double capacidadTanque;
	private double combustibleActual;
	private double kmRecorridos;
	private String color;
	private String marca;
	private String modelo;
	private String caja;
	/**
	 * Constructores
	 */
	public Auto() {}
	public Auto(int aa, double cap, double com, double km, String col,
			String mar, String mod, String caj)
	{
		this.agno = aa;
		this.capacidadTanque = cap;
		this.combustibleActual = com;
		this.kmRecorridos = km;
		this.color = col;
		this.marca = mar;
		this.modelo = mod;
		this.caja = caj;
	}
	/**
	 * Modificadores
	 */
	public void setAgno(int aa)
	{
		this.agno = aa;
	}
	public void setCapacidadTanque(double cap)
	{
		this.capacidadTanque = cap;
	}
	public void setCombustibleActual(double com)
	{
		this.combustibleActual = com;
	}
	public void setKmRecorridos(double km)
	{
		this.kmRecorridos = km;
	}
	public void setColor(String col)
	{
		this.color = col;
	}
	public void setMarca(String mar)
	{
		this.marca = mar;
	}
	public void setModelo(String mod)
	{
		this.modelo = mod;
	}
	public void setCaja(String caj)
	{
		this.caja = caj;
	}
	/**
	 * Visualizadores
	 */
	public int getAgno()
	{
		return (this.agno);
	}
	public double getCapacidadTanque()
	{
		return (this.capacidadTanque);
	}
	public double getCombustibleActual()
	{
		return (this.combustibleActual);
	}
	public double getKmRecorridos()
	{
		return (this.kmRecorridos);
	}
	public String getColor()
	{
		return (this.color);
	}
	public String getMarca()
	{
		return (this.marca);
	}
	public String getModelo()
	{
		return (this.modelo);
	}
	public String getCaja()
	{
		return (this.caja);
	}
	public String toString()
	{
		return ("\nMarca: " + this.marca +
			"\nModelo: " + this.modelo +
			"\nColor: " + this.modelo +
			"\nAño: " + this.agno +
			"\nKilómetros: " + this.kmRecorridos +
			"\nCaja: " + this.caja +
			"\nCapacidad de tanque: " + this.capacidadTanque +
			"\nCombustible actual: " + this.combustibleActual);
	}
	/**
	 * Métodos propios del tipo
	 */
}
