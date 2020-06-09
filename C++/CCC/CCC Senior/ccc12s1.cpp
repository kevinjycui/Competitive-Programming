#include <iostream>
using namespace std;

int main() {
	int n;
	cin >> n;
	int ans = 0;
	for (int f=0; f<n-3; f++) {
		for (int s=f+1; s<n-2; s++) {
			for (int t=s+1; t<n-1; t++) {
				ans++;
			}
		}
	}
	cout << ans;
	return 0;
}