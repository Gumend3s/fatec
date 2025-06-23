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
    }
}

void mergeVet(int *vet, int start, int end, int mid)
{
    int size = end - start + 1;
    int res[size];
    int i = start, j = mid + 1, t = 0, y;
    while(i <= mid && j <= end && t < size){
        if(vet[i] < vet[j])
        {
            res[t++] = vet[i++];
        } else {
            res[t++] = vet[j++];
        }
    }
    while(i <= mid)
    {
        res[t++] = vet[i++];
    }
    while(j <= end)
    {
        res[t++] = vet[j++];
    }
    for(t = 0; t < size; t++)
    {
        vet[t+start] = res[t];
    }
}
