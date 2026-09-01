import java.util.Arrays;
public class matriz {
    public static void main(String[] args) {
        int aux;
        int [] arreglo = {3,5,9,2,1,6,0,7};
        for (int i = 1 ; i < arreglo.length; i++) {
            for (int j = 0 ; j < arreglo.length - 1  ; j++) {
                if (arreglo[j] > arreglo[i]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
                System.out.println(Arrays.toString(arreglo));
            }
                
        }
        System.out.println("Arreglo ordenado: "+Arrays.toString(arreglo));
    }
}