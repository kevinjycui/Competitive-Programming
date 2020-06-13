#include <bits/stdc++.h>
#define int long long
#define MAXN 100002

using namespace std;

bool sortcost(const pair<int, int> &a, const pair<int, int> &b) {
    if (a.second == b.second)
        return a.first > b.first;
    return a.second > b.second;
}

signed main() {

    int n, m, a[MAXN], c[MAXN];

    cin >> n >> m;

    vector<pair<int, int>> cheapest;

    for (int i=1; i<=n; i++) cin >> a[i];
    for (int i=1; i<=n; i++) {
        cin >> c[i];
        cheapest.push_back(make_pair(i, c[i]));
    }

    sort(cheapest.begin(), cheapest.end(), sortcost);

    for (int j=0; j<m; j++) {

        int t, d;
        cin >> t >> d;

        int cost = 0;

        while (d > 0 && cheapest.size()) {

            if (d <= a[t]) {
                a[t] -= d;
                cost += d * c[t];
                d = 0;
            }
            else {
                d -= a[t];
                cost += a[t] * c[t];
                a[t] = 0;
            }

            while (cheapest.size() && !a[cheapest.back().first]) cheapest.pop_back();
            t = cheapest.back().first;

        }

        cout << (d == 0 ? cost:0) << endl;

    }

}
