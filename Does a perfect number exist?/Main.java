#include<iostream>
using namespace std;

int isperfect(int n){
  int out = 0;
  for(int i = 1; i <= n/2; i++){
    if(n % i == 0)
      out += i;
  }
  if(out == n)
    return 1;
  else
    return 0;
}

int main()
{
  int n;
  cin >> n;
  if(isperfect(n) == 1)
    cout << "Yes";
  else
    cout << "No";
}