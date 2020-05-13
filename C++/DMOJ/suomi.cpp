#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    long long m;
    cin >> n >> m;
    long long hold = 0;
    long long moved = 0;
    bool flag = true;
    for (int i=0; i<n; i++) {
        long long a;
        cin >> a;
        if (flag) {
            if (a >= m) hold += a-m;
            else if (a<m && m-a<=hold) {
                hold -= m-a;
                moved += m-a;
            }
            else flag = false;
        }
    }

    if (flag) cout << moved << endl;
    else cout << -1 << endl;

    return 0;
}