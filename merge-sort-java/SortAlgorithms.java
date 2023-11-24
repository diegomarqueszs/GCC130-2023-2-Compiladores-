public class SortAlgorithms {
    public void mergeSort(int[] arrayEntrada) {
        int tamanhoArray = arrayEntrada.length;
        if (tamanhoArray > 2) {
            int meio = tamanhoArray / 2;
            int [] inicio = new int[meio];
            int [] fim = new int[tamanhoArray - meio];

            for (int i = 0; i < meio; i++) {
                inicio[i] = arrayEntrada[i];
            }
            for (int i = meio; i < tamanhoArray; i++) {
                fim[i - meio] = arrayEntrada[i];
            }
            
            mergeSort(inicio);
            mergeSort(fim);

            merge(arrayEntrada, inicio, fim);

        }
    }

    public void merge(int[] arrayEntrada, int inicio[], int fim[]) {
        int tamanhoInicio = inicio.length;
        int tamanhoFim = fim.length;

        // nessa parte é preciso 3 interadores - um para para o array da esquerda, um pra direita e outro para o array de junção
        int i = 0, j = 0, k = 0;
        while (i < tamanhoInicio && j < tamanhoFim) {
            if (inicio[i] <= fim[j]) {
                arrayEntrada[k] = inicio[i];
                i++;
            } else {
                arrayEntrada[k] = fim[j];
                j++;
            }
            k++;
        }
        // caso tenha elementos do array da esquerda que não foram adicionados
        while(i < tamanhoInicio) {
            arrayEntrada[k] = inicio[i];
            i++;
            k++;
        }
        while(j < tamanhoFim) {
            arrayEntrada[k] = fim[j];
            j++;
            k++;
        }

    }
}
