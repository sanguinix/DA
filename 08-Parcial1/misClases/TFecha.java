package misClases;
public class TFecha
{
	/**
	 * Atributos
	 */
	private int dia;
	private int mes;
	private int anio;
	/**
	 * Constructores
	 */
	public TFecha(int d, int m, int a)
	{
		this.dia = d;
		this.mes = m;
		this.anio = a;
	}
	/**
	 * Modificadores
	 */
	public void setDia(int d)
	{
		this.dia = d;
	}
	public void setMes(int m)
	{
		this.mes = m;
	}
	public void setAnio(int a)
	{
		this.anio = a;
	}
	/**
	 * Visualizadores
	 */
	public int getDia()
	{
		return (this.dia);
	}
	public int getMes()
	{
		return (this.mes);
	}
	public int getAnio()
	{
		return (this.anio);
	}
	/**
	 * Métodos propios del tipo
	 */
	public static boolean esValido(int unDia, int unMes, int unAnio)
	{
		boolean valido = true;
		if (unDia >= 1 && unDia <= 31
			&& unMes >= 1 && unMes <= 12
			&& unAnio > 1900 && unAnio < 2100) {
			switch (unMes) {
			case 2:
				if (unDia <= 29) {
					if (unDia == 29 && !esBisiesto(unAnio))
						valido = false;
				} else {
					valido = false;
				}
				break;
			case 4, 6, 9, 11:
				if (unDia > 30) {
					valido = false;
				}
				break;
			}
		} else {
			valido = false;
		}
		return (valido);
	}
	public boolean equals(TFecha unaFecha)
	{
		boolean igual = false;
		if (this.dia == unaFecha.getDia() &&
			this.mes == unaFecha.getMes() &&
			this.anio == unaFecha.getAnio()) {
			igual = true;
		}
		return (igual);
	}
	public static boolean esBisiesto(int unAnio)
	{
		boolean bisiesto = false;
		if (unAnio % 100 != 0) {
			if ((unAnio % 4 == 0) && (unAnio % 400 == 0)) {
				bisiesto = true;
			}
		}
		return (bisiesto);
	}
	public boolean esBisiesto()
	{
		return (esBisiesto(this.anio));
	}
}
