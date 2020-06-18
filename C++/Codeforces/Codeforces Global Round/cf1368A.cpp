#include <bits/stdc++.h>
#define ll long long
#define MAXA 50

using namespace std;

int main() {

    int t; cin >> t;

    for (int i=0; i<t; i++) {
        ll a, b, n;
        cin >> a >> b >> n;

        ll c = min(a, b);
        ll d = max(a, b);

        ll f[MAXA];

        f[0] = 0;
        f[1] = 1;

        int j = 2;

        while (f[j-2]*c + f[j-1]*d <= n) {
            f[j] = f[j-1] + f[j-2];
            j++;
        }

        cout << j-2 << endl;
    }

}
