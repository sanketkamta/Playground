#include<iostream>
using namespace std;

int gcd(int n, int m){
  if(n == 0)
    return m;
  if(m == 0)
    return n;
  if(n == m)
    return n;
  if(n > m)
    return gcd(n-m, m);
  return gcd(n, m-n);
}

int main()
{
  int n, m;
  cin >>n >> m;
  cout << gcd(n, m);
  return 0;
}