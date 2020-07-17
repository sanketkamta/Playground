#include<iostream>
using namespace std;

int sod(int n){
  int res = 0;
  while(n){
    res = res + n%10;
    n /= 10;
  }
  return res;
}

int find(int n, int d){
  int l = 1, h = n;
  while(l <= h){
    int mid = (l+h) / 2;
    if(mid - sod(mid) < d)
      l = mid + 1;
    else
      h = mid-1;
  }
  return n-h;
}

int main()
{
  int n, d;
  cin >> n >> d;
  cout << find(n, d);
  return 0;
}