#include<iostream>
using namespace std;

void isLargest(char a, char b, char c){
	if(a>=b && a>=c)
		cout << a ;
	else if(b>=a && b>=c)
		cout << b ;
	else
		cout << c ;
}
void isSmallest(char a, char b, char c){
	if(a<=b && a<=c)
		cout << a ;
	else if(b<=a && b<=c)
		cout << b;
	else
		cout << c ;
}

int main()
{
	string n, m, o;
	cin >> n >> m >> o;
	int l = n.length();
	int i = 1;
	while(i <= l){
		if(i%2 == 0)
			isLargest(n[i-1], m[i-1], o[i-1]);
		else
			isSmallest(n[i-1], m[i-1], o[i-1]);
		i++;
	}
	return 0;
}