#include <bits/stdc++.h>
#define ll long long

using namespace std;

int main() {

    int t; cin >> t;

    for (int i=0; i<t; i++) {
        ll n, m;
        cin >> n >> m;

        ll before = 0, after = 0, weight = 0, midpoint = 0;

        for (ll i=0; i<n; i++) {
            int a; cin >> a;
            if (a <= m) {
                if (midpoint == m)
                    weight = max(weight, before+after+m);
                if (a == m) before = after;
                else before = 0;
                after = 0;
                midpoint = a;
            }
            else after += a;
        }

        cout << max(weight, before+after+m) << endl;

    }

}
