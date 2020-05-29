#include <bits/stdc++.h>
#define int long long

using namespace std;

signed main() {

    int t;
    cin >> t;

    for (int i=0; i<t; i++) {

        int a, k;
        cin >> a >> k;

        bool ended = false;

        for (int j=0; j<k-1; j++) {
            int minimum = 1 << 30;
            int maximum = 0;
            for (char c:to_string(a)) {
                if (c == '0') {
                    ended = true;
                    break;
                }
                maximum = max(maximum, (long long)(c-'0'));
                minimum = min(minimum, (long long)(c-'0'));
            }
            if (ended) break;
            a += minimum * maximum;
        }

        cout << a << endl;

    }

}
