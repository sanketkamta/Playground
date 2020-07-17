#include<iostream>
using namespace std;
#define INT_MAX 2147483647;
int findUtil(int arr[], int l, int h, int diff){
  if(h < l)
    return INT_MAX;
  int mid = (l+h) / 2;
  if(arr[mid+1] - arr[mid] != diff)
    return(arr[mid] + diff);
  if(mid > 0 && arr[mid] - arr[mid-1] != diff)
    return(arr[mid-1] + diff);
  if(arr[mid] == arr[0] + (diff*mid))
    return findUtil(arr, mid+1, h, diff);
  else
    return findUtil(arr, l, mid-1, diff);
}

void find(int arr[], int n){
  int diff = (arr[n-1] - arr[0]) / n;
  cout << findUtil(arr, 0, n-1, diff);
}

int main()
{
  int n;
  cin >> n;
  int arr[n];
  for(int i = 0; i< n; i++){
    cin >> arr[i];
  }
  find(arr, n);
  return 0;
}