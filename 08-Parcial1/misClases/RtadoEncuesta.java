package misClases;
public class RtadoEncuesta
{
	/**
	 * Atributos
	 */
	private int codigo;
	private int votosListA;
	private int votosListB;
	private int votosListC;
	private int votosBlanco;
	private TFecha fecha;
	/**
	 * Constructores
	 */
	public RtadoEncuesta()
	{
		// Constructor vacío
	}
	public RtadoEncuesta(int cod, int lA, int lB, int lC,
			int blanco, TFecha fe)
	{
		this.codigo = cod;
		this.votosListA = lA;
		this.votosListB = lB;
		this.votosListC = lC;
		this.votosBlanco = blanco;
		this.fecha = fe;
	}
	/**
	 * Modificadores
	 */
	public void setCodigo(int cod)
	{
		this.codigo = cod;
	}
	public void setFecha(TFecha fe)
	{
		this.fecha = fe;
	}
	/**
	 * Visualizadores
	 */
	public int getCodigo()
	{
		return (this.codigo);
	}
	public int getVotosListA()
	{
		return (this.votosListA);
	}
	public int getVotosListB()
	{
		return (this.votosListB);
	}
	public int getVotosListC()
	{
		return (this.votosListC);
	}
	public int getVotosBlanco()
	{
		return (this.votosBlanco);
	}
	/**
	 * Métodos propios del tipo
	 */
	public boolean equals(RtadoEncuesta unaEncuesta)
	{
		return (this.codigo == unaEncuesta.getCodigo());
	}
	public boolean todasLasEncuestas(RtadoEncuesta[][] encta, int semana)
	{
		boolean todas = true;
		int i = 0;
		while (todas && i < encta[semana].length) {
			if (encta[semana][i] == null) {
				todas = false;
			}
			i++;
		}
		return (todas);
	}
	/**
	 * El arreglo 'cantVotos' acumula la cantidad de votos de cada lista
	 * por día:
	 * cantVotos = [votosListA, votosListB, votosListC, votosBlanco]
	 */
	public String listaGanadora(RtadoEncuesta[] encta)
	{
		int i;
		int listaGanadora;
		int mayorCantVotos = -1;
		int[] cantVotos = new int[4];
		for (i = 0; i < encta.length; i++) {
			cantVotos[0] += encta[i].getVotosListA();
			cantVotos[1] += encta[i].getVotosListB();
			cantVotos[2] += encta[i].getVotosListC();
			cantVotos[3] += encta[i].getVotosBlanco();
		}
		for (i = 0; i < cantVotos.length; i++) {
			if (cantVotos[i] > mayorCantVotos) {
				mayorCantVotos = cantVotos[i];
				listaGanadora = i;
			}
		}
		// TODO Desarrollar caso de empate (a, b), (a, c), (b, c)
		switch (listaGanadora) {
		case 0:
			resultado = "Lista ganadora: A";
			break;
		case 1:
			resultado = "Lista ganadora: B";
			break;
		case 2:
			resultado = "Lista ganadora: C";
			break;
		case 3:
			resultado = "La mayoría de votos fueron en blanco.";
			break;
		}
	}
}
