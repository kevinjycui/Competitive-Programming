#include <bits/stdc++.h>
#define ll long long
#define MAXX 1000000000

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
        ll costamax = costa(MAXX, a);
        ll costbmax = costb(MAXX, b, c);
        if (costa1 < costb1) {
            if (costbmax < costamax) cout << 1 << " " << MAXX << endl;
            else cout << 1 << " " << -1 << endl;
        }
        else if (costb1 < costa1) {
            if (costamax < costbmax) cout << MAXX << " " << 1 << endl;
            else cout << -1 << " " << 1 << endl;
        }
        else {
            if (costbmax < costamax) cout << -1 << " " << MAXX << endl;
            else if (costamax < costbmax) cout << MAXX << " " << -1 << endl;
            else cout << -1 << " " << -1 << endl;
        }
    }

}

