#include<stdio.h>

int arr[] = {65, 25, 12, 22, 11};
int n = sizeof(arr)/sizeof(arr[0]);

void sortArray() {
	
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