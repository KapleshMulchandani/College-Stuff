//Author: Gaurav Amarnani.

#include<stdio.h>

int arr[2] = {-1, -1};

int exists(int num, int size) {
	int found = 0;
	for(int i=0; i<size; i++) {
		if(arr[i] == num) {
		    found = 1;
		    break;
		}
    	}
	return found;
}

void decrementAndAdd(int num, int size) {
	for(int i = 0; i < size-1; i++) {
		arr[i] = arr[i+1];
	}
	arr[size - 1] = num;
}


void main() {
	int user[18] = {3, 2, 1, 0, 3, 2, 4, 3, 2, 1, 0, 4, 2, 3, 2, 1, 0, 4};
	int count = 0, size = 2;
	for(int i = 0; i < 18; i++) {
		if(exists(user[i], size)) { }
		else {
			count++;
			decrementAndAdd(user[i], size);
		}
	}
	printf("Total Number of Page Faults: %d\n", count);
}
