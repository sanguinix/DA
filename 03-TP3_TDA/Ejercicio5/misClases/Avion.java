package misClases;
public class Avion
{
	/**
	 * Atributos
	 */
	private int identificador;
	private int cantidadAsientos;
	private double kmRecorridos;
	private double velocidadPromedio;
	private String modelo;
	/**
	 * Constructores
	 */
	public Avion()
	{
		// No asigna
	}
	public Avion(int id, String mod, int asi, double km, double vel)
	{
		this.identificador = id;
		this.cantidadAsientos = asi;
		this.kmRecorridos = km;
		this.velocidadPromedio = vel;
		this.modelo = mod;
	}
	/**
	 * Modificadores
	 */
	public void setIdentificador(int id)
	{
		this.identificador = id;
	}
	public void setCantidadAsientos(int asi)
	{
		this.cantidadAsientos = asi;
	}
	public void setKmRecorridos(double km)
	{
		this.kmRecorridos = km;
	}
	public void setVelocidadPromedio(double vel)
	{
		this.velocidadPromedio = vel;
	}
	public void setModelo(String mod)
	{
		this.modelo = mod;
	}
	public int getIdentificador()
	{
		return (this.identificador);
	}
	public int getCantidadAsientos()
	{
		return (this.cantidadAsientos);
	}
	public double getKmRecorrido()
	{
		return (this.kmRecorridos);
	}
	public double getVelocidadPromedio()
	{
		return (this.velocidadPromedio);
	}
	public String getModelo()
	{
		return (this.modelo);
	}
	public String toString()
	{
		return ("Identificador: " + this.identificador + "\n" +
			"Modelo: " + this.modelo + "\n" +
			"Cantidad de asientos: " + this.cantidadAsientos + "\n" +
			"Kilómetros recorridos: " + this.kmRecorridos + "\n"+
			"Velocidad promedio: " + this.velocidadPromedio);
	}
}
