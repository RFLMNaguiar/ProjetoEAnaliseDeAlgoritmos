valores = [100, 44, 53, 4, 62, 64, 99, 28, 8, 8]

indiceMenorValor = 0
for i in range(len(valores)):
    if valores[indiceMenorValor] > valores[i]:
        indiceMenorValor = i

print("A lista tem os seguintes valores:")
for i in range(len(valores)):
    print(f"{valores[i]} ", end="")
print(f"\nO índice do menor valor é {indiceMenorValor} e seu valor é {valores[indiceMenorValor]}.")
