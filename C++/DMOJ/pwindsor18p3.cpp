#include <iostream>
using namespace std;

int main() {

	int n;
	scanf("%d", &n);
	
	int sum = 0;
	
	for (int i=0; i<n; i++) {
		int m;
		scanf("%d", &m);
		
		for (int j=2; j*j<=m; j++)
			if (m % j == 0) {
				sum++;
				break;
			}
	}
	
	printf("%d\n", sum);
		
	
	return 0;
}