#include <bits/stdc++.h>
#define int long long
#define MAXN 100005

using namespace std;

signed main() {

    int n, q;
    int a[3][MAXN];

    cin >> n >> q;

    fill(a[1], a[1]+n+2, 0);
    fill(a[2], a[2]+n+2, 0);

    int cols = 0;

    for (int i=0; i<q; i++) {
        int r, c;
        cin >> r >> c;
        a[r][c] = 1-a[r][c];
        if (a[r][c]) cols += a[3-r][c-1] + a[3-r][c] + a[3-r][c+1];
        else cols -= a[3-r][c-1] + a[3-r][c] + a[3-r][c+1];
        cout << (cols == 0 ? "Yes":"No") << endl;
    }

}
