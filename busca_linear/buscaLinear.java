public class buscaLinear {
	public static void main(String[] args) {
        int valores[] = {100, 44, 53, 4, 62, 64, 99, 28, 8, 8};

        int indiceMenorValor = 0;
        for (int i = 0; i < 10; i++) {
            if (valores[indiceMenorValor] > valores[i]){
                indiceMenorValor = i;
            }
        }
        System.out.println("A lista tem os seguintes valores:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", valores[i]);
        }
        System.out.printf("\nO índice do menor valor é %d e seu valor é %d.\n", indiceMenorValor, valores[indiceMenorValor]);
    }
}
