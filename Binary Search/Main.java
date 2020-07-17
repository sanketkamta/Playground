#include<iostream>
using namespace std;

int binary_search(int arr[], int l, int h, int s){
  if(l <= h){
    int m = (l+h) /2;
    if(arr[m] == s)
      return m;
    if(arr[m] > s)
      return binary_search(arr, l, m-1, s);
    else
      return binary_search(arr, m+1, h, s);
  }
  return -1;
}

int main()
{
  int n, s;
  cin >> n;
  int arr[n];
  for(int i=0; i < n; i++){
    cin >> arr[i];
  }
  cin >> s;
  int res = binary_search(arr,0, n-1, s);
  if(res == -1)
    cout << "Not found";
  else
    cout << res;
  return 0;
}