#include <bits/stdc++.h>
#define int long long

using namespace std;

signed main() {

    int t;
    cin >> t;

    for (int i=0; i<t; i++) {

        int a, b;
        cin >> a >> b;

        cout << (a%b == 0 ? 0:-a%b+b) << endl;

    }

}
