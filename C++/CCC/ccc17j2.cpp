#include <iostream>
#include <cmath>
using namespace std;

int main() {
	int n;
	cin >> n;
	int k;
	cin >> k;
	int count = n;
	for (int i=0; i<k; i++) {
		count += n*pow(10, i+1);
	}
	cout << count;
	return 0;
}