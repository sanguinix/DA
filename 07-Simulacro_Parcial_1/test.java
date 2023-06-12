public class MayorTemperatura {
    public static int mesMasCaluroso(int[][] matrizTemperaturas) {
        int mesMasCaluroso = 0;
        double maxPromedio = Double.NEGATIVE_INFINITY;
        for (int j = 0; j < matrizTemperaturas[0].length; j++) {
            double promedio = 0;
            for (int i = 0; i < matrizTemperaturas.length; i++) {
                promedio += matrizTemperaturas[i][j];
            }
            promedio /= matrizTemperaturas.length;
            if (promedio > maxPromedio) {
                maxPromedio = promedio;
                mesMasCaluroso = j;
            }
        }
        return mesMasCaluroso + 1; //Sumamos 1 para devolver el mes real (enero = 1, febrero = 2, etc.)
    }
}

