#include<iostream>
#include<string>
using namespace std;

int main() 
{ 
	string str;
  	getline(cin, str);
  	for(string::iterator i = str.end()-1; i >= str.begin(); i--){
      cout << *i;
    }
}