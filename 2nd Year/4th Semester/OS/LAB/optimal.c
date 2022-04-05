// Author: Gaurav Amarnani.
// Optimal Page Replacement.

#include<stdio.h>

int arr[3] = {-1, -1, -1};
int user[20] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2, 1, 2, 0, 1, 7, 0, 1};

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

int findNextOccurrence(int num, int pos, int size) {
	for(int i = pos+1; i < size; i++) {
		if(user[i] == num) {
			return i;
		}
	}
	return -1;
}


void main() {
	int count = 0, size = 3, temp = 0, max = 0, element = 0;
	for(int i = 0; i < 20; i++) {
		if(exists(user[i], size)) { }
		else {
			count++;
			for(int j = 0; j < 3; j++) {
				temp = findNextOccurrence(arr[j], i, 20);
				if(temp > max) {
					max = temp;
				}
				element = user[max];
				for(int k = 0; k < 3; k++) {
					if(arr[k] == element) {
						arr[k] = user[i];
					}
				}
			}
		}
	}
	printf("Total Number of Page Faults: %d\n", count);
}
