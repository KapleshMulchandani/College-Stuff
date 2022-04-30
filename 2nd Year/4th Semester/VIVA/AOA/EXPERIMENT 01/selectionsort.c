#include<stdio.h>

int arr[] = {65, 25, 12, 22, 11};
int n = sizeof(arr)/sizeof(arr[0]);

void sortArray() {
	for(int i = 0; i < n - 1; i++) {
		int min = i;
		for(int j = i+1; j < n; j++)
			if(arr[min] > arr[j])
				min = j;
		int temp = arr[i];
		arr[i] = arr[min];
		arr[min] = temp;
	}
}

void printArray() {
	for(int i = 0; i < n; i++)
		printf("%d ", arr[i]);
}

void main() {
	printf("Unsorted Array:");
	printArray();
	printf("\nSorted Array:");
	sortArray();
	printArray();
}