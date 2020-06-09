#include <bits/stdc++.h>
#define int long long
#define MAXN 150001

using namespace std;

signed main() {

    int t;
    cin >> t;

    for (int i=0; i<t; i++) {

        int n, a[MAXN];
        cin >> n;

        for (int j=0; j<n; j++)
            cin >> a[j];

        int minimum = 1000001;
        int counter = 0;
        for (int j=n-1; j>=0; j--) {
            if (a[j] > minimum) counter++;
            minimum = min(minimum, a[j]);
        }

        cout << counter << endl;

    }

}
