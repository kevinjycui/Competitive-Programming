#include <bits/stdc++.h>
#define ll long long

using namespace std;

ll costa(ll n, ll a) {
    return n*a;
}

ll costb(ll n, ll b, ll c) {
    return ceil(n/double(b))*c;
}

int main() {

    int t; cin >> t;

    for (int i=0; i<t; i++) {
        ll a, b, c; cin >> a >> b >> c;
        ll costa1 = costa(1, a);
        ll costb1 = costb(1, b, c);
        ll costa2 = costa(b, a);
        ll costb2 = costb(b, b, c);
        if (costa1 < costb1) {
            if (costb2 < costa2) cout << 1 << " " << b << endl;
            else cout << 1 << " " << -1 << endl;
        }
        else if (costb1 < costa1) {
            if (costa2 < costb2) cout << b << " " << 1 << endl;
            else cout << -1 << " " << 1 << endl;
        }
        else {
            if (costb2 < costa2) cout << -1 << " " << b << endl;
            else if (costa2 < costb2) cout << b << " " << -1 << endl;
            else cout << -1 << " " << -1 << endl;
        }
    }

}

