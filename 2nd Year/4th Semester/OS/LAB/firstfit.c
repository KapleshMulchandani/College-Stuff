#include<stdio.h>

//Author: Gaurav Amarnani.

void main(){
	int size = 4;
	int process[] = {212, 417, 112, 426};
	int block[] = {100, 500, 200, 300, 600};
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
