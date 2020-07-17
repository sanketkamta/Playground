#include<iostream>
using namespace std;

int isPrime(int n){
  int t = 0;
  for(int i = 2; i <=n/2; i++){
    if(n % i == 0)
      t++;
  }
  if(t == 0)
    return 1;
  else
    return 0;
}

int main()
{
  int n;
  cin >> n;
  if(isPrime(n))
    cout << "Prime";
  else
    cout << "Not Prime";
  return 0;
}