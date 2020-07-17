#include<iostream>
using namespace std;

int main()
{
  int n;
  cin >> n;
  int arr1[n];
  for(int i = 0; i < n; i++)
    cin >> arr1[i];
  int arr2[n], arr3[n], arr4[n];
  arr2[0] = 1;
  arr3[n-1] = 1;
  for(int i = 1; i< n; i++)
    arr2[i] = arr1[i-1]*arr2[i-1];
  for(int j = n-2; j>=0; j--)
    arr3[j] = arr3[j+1] * arr1[j+1];
  for(int k = 0; k< n; k++)
    arr4[k] = arr2[k]*arr3[k];
  for(int a = 0;a < n; a++)
    cout<< arr4[a]<< endl;
  return 0;
}