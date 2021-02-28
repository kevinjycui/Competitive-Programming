#include <bits/stdc++.h>

using namespace std;

static int r[5000001] = {0}, c[5000001] = {0};

int main() {
	
	int m, n, k;

	scanf("%d", &m);
	scanf("%d", &n);
	scanf("%d", &k);

	for (int i=0; i<k; i++) {
		char ch; int j;
		cin >> ch >> j;
		if (ch == 'R')
			r[j-1] = 1 - r[j-1];
		else
			c[j-1] = 1 - c[j-1];
	}

	int count = 0;

	for (int i=0; i<m; i++)
		for (int j=0; j<n; j++)
			if (r[i] + c[j] == 1)
				count++;

	printf("%d\n", count);

	return 0;
}
