#include <stdio.h>

int main(){
    int valores[10] = {100, 44, 53, 4, 62, 64, 99, 28, 8, 8};
    
    int indiceMenorValor = 0;
    for (int i = 0; i < 10; i++) {
        if (valores[indiceMenorValor] > valores[i]){
            indiceMenorValor = i;
        }
    }

    printf("A lista tem os seguintes valores:\n");
    for (int i = 0; i < 10; i++) printf("%d ", valores[i]);
    printf("\nO índice do menor valor é %d e seu valor é %d.\n", indiceMenorValor, valores[indiceMenorValor]);
}