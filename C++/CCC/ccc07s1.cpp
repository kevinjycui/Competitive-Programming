#include <iostream>
using namespace std;

int main() {
	int n;
	cin >> n;
	for (int i=0; i<n; i++) {
		int y;
		int m;
		int d;
		cin >> y >> m >> d;
		if (2007-y==18) {
			if (m==2) {
				if (d<=27) {
					cout << "Yes" << endl;
				} else {
					cout << "No" << endl;
				}
			} else if (m<2) {
				cout << "Yes" << endl;
			} else {
				cout << "No" << endl;
			}
		} else if (2007-y>18) {
			cout << "Yes" << endl;
		} else {
			cout << "No" << endl;
		}
	}
	return 0;
}