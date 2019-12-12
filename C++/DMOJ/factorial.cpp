#include <iostream>
using namespace std;

unsigned long long exponent(int base, int exponent)
{
    unsigned long long result = 1ULL; // 0th power of base is 1
    for (int i=0; i<exponent;i++) {
        result*=base;
    }
    return result;
}

int main() {

	int n;
	scanf("%d", &n);

	for (unsigned long long i=0; i<n; i++) {
		unsigned long long a;
		scanf("%llu", &a);

		if (a > 33) {
			printf("%d\n", 0);
		} else {
			unsigned long long f = 1;
			for (int j=2; j<=a; j++) {
				f *= j;
			}
			printf("%llu\n", f % exponent(2, 32));
		}
	}

	return 0;
}
