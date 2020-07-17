#include<iostream>
using namespace std;

void merge(int arr[], int l, int m, int r){
	int i, j, k;
	int n1 = m-l+1;
	int n2 = r-m;
	int arr1[n1], arr2[n2];
	for(i =0; i<n1; i++)
		arr1[i] = arr[i+l];
	for(j = 0; j<n2; j++)
		arr2[j] = arr[m+1+j];
	i =0;
	j =0;
	k = l;
	while(i < n1 && j < n2){
		if(arr1[i] <= arr2[j]){
			arr[k] = arr1[i];
			i++;
		}
		else{
			arr[k] = arr2[j];
			j++;
		}
		k++;
	}	
	while(i < n1){
		arr[k] = arr1[i];
		i++;
		k++;
	}
	while(j < n2){
		arr[k] = arr2[j];
		j++;
		k++;
	}
}

void mergeSort(int arr[], int l, int h){
	if(l < h){
		int mid = (l+h)/2;
		mergeSort(arr, l, mid);
		mergeSort(arr, mid+1, h);
		merge(arr, l , mid, h);
	}
}

int main(){
	int n;
	cin >> n;
	int arr[n];
	int i;
	for(i = 0; i< n; i++)
		cin>> arr[i];
	cout<< "Before Sort:" << endl;
	for(i = 0; i<n; i++)
		cout << arr[i] << " ";
	cout<< endl << "After Sort:" << endl;
	mergeSort(arr, 0, n-1);
	for(int t =0; t<n; t++)
		cout << arr[t] << " ";
	return 0;
	
}