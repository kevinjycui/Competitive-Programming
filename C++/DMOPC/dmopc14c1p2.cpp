#include <iostream>
using namespace std;
 
int main() {
	int l;
	int w;
	cin >> l;
	cin >> w;
	int s;
	cin >> s;
	cout << ((l-l%s)/s)*((w-w%s)/s);
 
	return 0;
}