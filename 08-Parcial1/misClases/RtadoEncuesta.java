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
	public String listaGanadora(rtadoEncuesta[][] unResultado, int semana)
	{
		String lista;
		int i;
		int dia;
		int votosA = 0;
		int votosB = 0;
		int votosC = 0;
		int mayor = 0;
		int contador = 1;
		for (dia = 0; dia < 7; dia++) {
			votosA += unResultado[semana][dia].getVotosListA();
			votosB += unResultado[semana][dia].getVotosListB();
			votosC += unResultado[semana][dia].getVotosListC();
		}
		int[] votos = {votosA, votosB, votosC};
		for (i = 0; i < votos.length; i++) {
			if (mayor < votos[i]) {
				mayor = i;
			} else if (mayor == votos[i]) {
				contador++;
			}
		}
		switch (contador) {
		case 1:
			lista = switch (mayor) {
			case 0 -> "lista A";
			case 1 -> "lista B";
			case 2 -> "lista C";
			default -> "ERROR";
			};
			break;
		case 2:
			if (votosA == votosB) {
				lista = "empate listaA, listaB";
			} else if (votosA == votosC) {
				lista = "empate listaA, listaC";
			} else {
				lista = "empate listaB, listaC";
			}
			break;
		default:
			lista = "empate listaA,listaB,listaC";
			break;
		}
		return (lista);
	}
	public int cantVotosBlanco(rtadoEncuesta[][] unResultado, int dia)
	{
		int votos = 0, fila;
		for (fila = 0; fila < 4; fila++) {
			votos += unResultado[fila][dia].getVotosBlanco();
		}
		return (votos);
	}
	public String mayorCantVotos(RtadoEncuesta[][] unResultado, int dia)
	{
		String lista;
		int i;
		int semana;
		int votosA = 0;
		int votosB = 0;
		int votosC = 0;
		int mayor = 0;
		for (semana = 0; semana < unResultado.length; semana++) {
			votosA += unResultado[semana][dia].getVotosListA();
			votosB += unResultado[semana][dia].getVotosListB();
			votosC += unResultado[semana][dia].getVotosListC();
		}
		int[] votos = {votosA, votosB, votosC};
		for (i = 0; i < votos.length; i++) {
			if (mayor < votos[i]) {
				mayor = i;
			}
		}
		switch (mayor) {
		case 0:
			lista = "lista A";
			break;
		case 1:
			lista = "lista B";
			break;
		case 2:
			lista = "lista C";
			break;
		default:
			lista = "ERROR";
			break;
		}
		return (lista);
	}
}
