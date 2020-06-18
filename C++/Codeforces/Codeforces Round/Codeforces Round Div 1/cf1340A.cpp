#include <bits/stdc++.h>
#define int long long
#define MAXN 100001

using namespace std;

signed main() {

    int q;
    cin >> q;

    for (int i=0; i<q; i++) {

        int n;
        cin >> n;

        int last = MAXN;
        bool possible = true;

        for (int j=0; j<n; j++) {
            int p;
            cin >> p;
            if (p > last+1)
                possible = false;
            last = p;
        }

        cout << (possible ? "Yes":"No") << endl;

    }

}
