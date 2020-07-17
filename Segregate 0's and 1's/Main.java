#include<iostream>
#include<string>
using namespace std;

void swap(char *a, char *b){
	char temp = *a;
	*a = *b;
	*b = temp;
}

int main(){
	string str;
	getline(cin, str);
	int i = 0, j = (str.length() - 1);
	while(i <= j){
		while(str[i] == '1')
			i++;
		while(str[j] == '0')
			j--;
		if(i < j)
			swap(&str[i], &str[j]);
	}
	cout << str;
}