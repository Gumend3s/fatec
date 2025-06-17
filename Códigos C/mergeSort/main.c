#include <stdio.h>
#include <stdlib.h>

void mergeSort(int *vet, int start, int end);
void mergeVet(int *vet, int start, int end, int mid);

int main()
{
    int i, vet[] = {2, 4, 7, 5, 9, 1, 0, 3, 6, 8};

    mergeSort(vet, 0, 9);

    for(i = 0; i < 10; i++)
    {
        printf("%d\n", vet[i]);
    }

    return 0;
}

void mergeSort(int *vet, int start, int end)
{
    int mid = (start + end) / 2, i;
    if (start < end)
    {
        mergeSort(vet, start, mid);
        mergeSort(vet, mid + 1, end);

        mergeVet(vet, start, end, mid);
        printf("\n");
        for(i = 0; i < 10; i++)
        {
            printf("%da\n", vet[i]);
        }
    }
}

void mergeVet(int *vet, int start, int end, int mid)
{
    int size = end - start;
    if(size == 1) return;
    int res[size];
    int i = start, j = mid, t = 0, y;
    while(i <= mid && j <= end && t < size){
        if(vet[i] < vet[j])
        {
            res[t] = vet[i];
            i++;
        } else {
            res[t] = vet[j];
            j++;
        }
        t++;
        printf("\ni: %d|j: %d|t: %d|size: %d\n",i, j, t, size);
        for(y = start; y < end; y++)
        {
            printf("%d\n", res[y]);
        }
    }
    for(;i <= mid; i++, t++)
    {
        res[t] = vet[i];
    }
    for(;j <= end; j++, t++)
    {
        res[t] = vet[j];
    }
    for(t = 0; t < size; t++)
    {
        vet[t] = res[t+start];
    }
}
