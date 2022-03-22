#include<stdio.h>

void sortArray(int arr[], int size) {
	int a = 0;
	for(int i =0; i < n; ++i) {
		for(int j = i+1; j < n; ++j) {
			if(arr[i] > arr[j]) {
				a = arr[i];
				arr[i] = arr[j];
				arr[j] = a;
			}
		}
	}
}

void main(){
	int size = 4;
	int process[] = {212, 417, 112, 426};
	int block[] = {100, 500, 200, 300, 600};
	sortArray(process, 4);
	sortArray(block, 5);
	for(int i = 0; i < 4; i++) {
		for(int j = 0; j < 5; j++) {
			if(block[j]==0)
				j++;
			if(block[j] - process[i] > 0) {
				printf("%d is assigned under %d. /n", process[i], block[j]);
				block[j]=0;
				process[i]=0;
				break;
			}
		}
	}
}
