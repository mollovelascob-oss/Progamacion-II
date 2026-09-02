import java.util.Scanner;

public class TestCronometro {

    static int n = 100000;

    static int[] numeros = new int[n];

    public static void main(String[] args) {

        llenarNumeros();


        Cronometro cronometro = new Cronometro();

        System.out.println("Ordenando " + n + " números...");


        cronometro.inicia();


        ordenacionPorSeleccion();


        cronometro.detener();

        System.out.println("Hora inicio: " + cronometro.getInicio());
        System.out.println("Hora fin: " + cronometro.getFinaliza());


        long lapso = cronometro.lapsoDeTiempo();
        System.out.println("Pasaron " + lapso + " milisegundos" );
    }

    private static void llenarNumeros() {

        for (int i = 0; i < n; i++) {
            numeros[i] = (int) (Math.random() * 1000000);
        }
    }

    private static void ordenacionPorSeleccion() {
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (numeros[j] < numeros[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int aux = numeros[indiceMinimo];
            numeros[indiceMinimo] = numeros[i];
            numeros[i] = aux;
        }
    }
}
