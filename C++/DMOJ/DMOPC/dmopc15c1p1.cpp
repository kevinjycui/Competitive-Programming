#include <iostream>
#include <string>

using namespace std;

int main() {

	int n;
	cin >> n;

	string s;
	double max = -1;
	
	for (int i=0; i<n; i++) {
		string name;
		double r;
		cin >> name >> r;

		if (r > max) {
			max = r;
			s = name;
		}
		
	}
	
	cout << s << endl;
	
	return 0;
}