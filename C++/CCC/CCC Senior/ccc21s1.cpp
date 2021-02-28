#include <bits/stdc++.h>

using namespace std;

int main() {
	
	double n, h[10002], a=0;

	scanf("%lf", &n);
	for (int i=0; i<n+1; i++)
		scanf("%lf", &h[i]);
	for (int i=0; i<n; i++) {
		double w;
		scanf("%lf", &w);
		a += w * (h[i] + h[i+1])/2;
	}

	printf("%lf\n", a);

	return 0;
}
