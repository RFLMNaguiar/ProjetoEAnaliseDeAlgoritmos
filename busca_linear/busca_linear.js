let valores = [100, 44, 53, 4, 62, 64, 99, 28, 8, 8]

let indiceMenorValor = 0
for (let i = 0; i < 10; i++) {
    if (valores[indiceMenorValor] > valores[i]){
        indiceMenorValor = i;
    }
}

console.log("A lista tem os seguintes valores:")
for (let i = 0; i < 10; i++) {
    console.log(valores[i])
}

console.log("\nO índice do menor valor é " + indiceMenorValor + " e seu valor é " + valores[indiceMenorValor] + ".\n")