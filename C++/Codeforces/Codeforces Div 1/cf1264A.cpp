#include <bits/stdc++.h>
#define ll long long
#define MAXN 400001

using namespace std;

int main() {

    ll t; cin >> t;

    for (ll i=0; i<t; i++) {

        ll n; cin >> n;
        ll a[MAXN];

        for (ll j=0; j<n; j++) cin >> a[j];

        if (n < 6) {
            cout << "0 0 0" << endl;
            continue;
        }

        ll g = 1, s = 1, b = 1;

        while (g <= n && a[g-1] == a[g]) g++;
        while (g+s <= n && s <= g || a[g+s-1] == a[g+s]) s++;
        b = (n/2)-g-s;
        while (g+s+b > 1 && a[g+s+b-1] == a[g+s+b]) b--;
        if (g > 0 && s > 0 && b > 0 && g+s+b <= n/2 && g < s && g < b) cout << g << " " << s << " " << b << endl;
        else cout << "0 0 0" << endl;

    }

}
