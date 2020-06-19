#include <bits/stdc++.h>
#define int long long
#define MAXN 100001

using namespace std;

signed main() {

    int n, a[MAXN];
    cin >> n;

    for (int i=0; i<n; i++) cin >> a[i];

    sort(a, a+n);

    int dupl = 0;
    int cnt = 0;
    for (int i=0; i<n; i++) {
        if (i > 0 && a[i] != a[i-1]) {
            dupl = max(dupl, cnt);
            cnt = 0;
        }
        cnt++;
    }

    dupl = max(dupl, cnt);

    cout << (n - dupl) << endl;

}
