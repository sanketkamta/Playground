#include<iostream>
#include<cmath>
using namespace std;

int isArm(int temp){
  int c, out;
  int n = temp;
  while(n){
    c++;
    n /= 10;
  }
  n = temp;
  while(n){
    out += pow((n%10), c);
    n /= 10;
  }
  if(temp == out)
    return 1;
  else
    return 0;
}

int main()
{
  int n;
  cin >> n;
  if(isArm(n))
    cout << "Yes";
  else
    cout << "No";
}