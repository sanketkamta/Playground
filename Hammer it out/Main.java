#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  cin >> n;
  int c = 0;
  int temp = n;
  while(temp){
    c++;
    temp /= 10;
  }
  int a1=0, a2=0;
  while(n){
    a1 += n%10;
    n /= 10;
    a2 += n%10;
    n /= 10;
  }
  cout << abs(a2 -a1);
}