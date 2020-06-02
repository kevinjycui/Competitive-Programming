#include <bits/stdc++.h>
#define int long long
#define MAXN 1001

using namespace std;

signed main() {

    int n;
    double d[MAXN];
    cin >> n;

    for (int i=0; i<n; i++) {
        string s;
        cin >> s >> d[i];
    }

    sort(d, d+n);
    double idle = 0;

    for (int i=0; i<n-1; i++)
        idle = max(idle, d[i+1] - d[i]);
    idle = max(idle, d[0]+360.0 - d[n-1]);

    cout << ceil((360.0 - idle)*(72.0*60.0/360.0)) << endl;

}
