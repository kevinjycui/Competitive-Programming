#include <iostream>
using namespace std;

int main() {
	int x;
	int y;
	cin >> x;
	cin >> y;
	for (int i=x; i<=y; i++) {
		if ((i-x)%4==0 && (i-x)%3==0 && (i-x)%5==0) {
			cout << "All positions change in year " << i << endl;
		}
	}
	return 0;
}