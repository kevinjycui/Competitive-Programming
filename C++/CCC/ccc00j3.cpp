#include <iostream>
using namespace std;

int main() {
	int quarts;
	cin >> quarts;
	int ind = 0;
	int f;
	int s;
	int t;
	cin >> f;
	cin >> s;
	cin >> t;
	while (quarts>0) {
		ind++;
		if (ind%3==0) {
	        t++;
	        if (t%10==0) {
	            quarts+=9;
	        }
		}
	    else if (ind%2==0) {
	        s++;
	        if (s%100==0) {
	            quarts+=60;
	        }
	    }
	    else {
	        f++;
	        if (f%35==0) {
	            quarts+=30;
	        }
	    }
	    quarts--;
	}
	cout << "Martha plays " << ind << " times before going broke.";
	return 0;
}