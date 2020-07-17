#include<iostream>
#include<cmath>
using namespace std;


int main()
{
	int r, c, row, col;
	cin >> r;
	cin >> c;
	int arr[r][c];
	for(int i = 0; i < r; i++){
		for(int j = 0; j < c; j++){
			cin >> arr[i][j];
		}
	}
	cin >> row;
	cin >> col;
	int s = 0;
	for(int a = 0; a < c; a++)
		s += arr[row][a];
	for(int b = 0; b < r; b++)
		s += arr[b][col];
	s -= arr[row][col];
	cout << s;
}