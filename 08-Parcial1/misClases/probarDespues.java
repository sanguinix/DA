	-------------------------
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
