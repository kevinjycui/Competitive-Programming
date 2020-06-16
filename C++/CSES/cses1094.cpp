#include <bits/stdc++.h>
#define ll long long

using namespace std;

int main() {

    ll n; cin >> n;

    ll b = LONG_MIN;
    ll sum = 0;

    for (ll i=0; i<n; i++) {
        ll a; cin >> a;
        if (a < b) sum += b-a;
        else b = a;
    }

    cout << sum << endl;

}
