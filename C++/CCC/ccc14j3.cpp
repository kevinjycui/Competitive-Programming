#include <iostream>
#include <cmath>
using namespace std;

int main() {
	int n;
	cin >> n;
	int a = 100;
	int d = 100;
	int aRoll;
	int dRoll;
	for (int i=0; i<n; i++) {
		cin >> aRoll;
		cin >> dRoll;
		if (aRoll < dRoll){
			a -= dRoll;
		}
		else if (aRoll > dRoll){
			d -= aRoll;
		}
	}
	cout << a << endl;
	cout << d;
}