#include <bits/stdc++.h>
#define ll long long
#define MAXN 200001

using namespace std;

int main() {

    ll n;
    cin >> n;

    ll sum1 = 0;
    ll sum2 = n;

    for (ll i=0; i<n-1; i++) {
        ll j; cin >> j;
        sum1 += j;
        sum2 += i+1;
    }

    cout << sum2 - sum1 << endl;

}
