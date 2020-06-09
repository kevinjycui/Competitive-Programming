#include <iostream>
using namespace std;

int main() {
	int n;
	cin >> n;
	string a[n];
	for (int i=0; i<n; i++) {
		cin >> a[i];
	}
	int count = 0;
	for (int i=0; i<n; i++) {
		string ans;
		cin >> ans;
		if (a[i]==ans){
			count++;
		}
	}
	cout << count;
	return 0;
}